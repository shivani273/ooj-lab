import java.util.Scanner;


class Book{
    private int bookID;
    private String bookTitle;
    private int numberOfPages;
    private int publishedYear;
    private String author;
    private String publisher;
    private float price;
    Scanner sc = new Scanner(System.in);

    void setDetails(){
        System.out.println("Enter Book ID:");
        this.bookID = sc.nextInt();
        System.out.println("Enter Book title: ");
        this.bookTitle = sc.next();
        System.out.println("Enter number of pages: ");
        this.numberOfPages = sc.nextInt();
        System.out.println("Enter year of publish: ");
        this.publishedYear = sc.nextInt();
        System.out.println("Enter Author's name: ");
        this.author = sc.next();
        System.out.println("Enter Publisher's name: ");
        this.publisher = sc.next();
        System.out.println("Enter price: ");
        this.price = sc.nextFloat();
    }

    void getDetails(){
        System.out.println("------------------")
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println();
    }

    void setAuthor(String name){
        this.author = name;
        getDetails();
    }

    float getPrice(){
        return this.price;
    }
    int getYear(){
        return this.publishedYear;
    }

    int getPages(){
        return this.numberOfPages;
    }
    
    String getTitle(){
        return this.bookTitle;
    }
    
}


public class ExtraProg2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Book books[] = new Book[3];
        for(int i = 0;i<books.length;i++){
            books[i] = new Book();
            System.out.println("Enter Details for book " + (i+1) + ": ");
            books[i].setDetails();
        }
        for(int i = 0;i<books.length;i++){
            books[i].getDetails();
        }
        System.out.println("Enter 1,2 or 3 to set a new author for that book: ");
        int update = sc.nextInt();
        System.out.println("Enter a new author for book "+update+" : ");
        String newAuthor = sc.next();
        books[update-1].setAuthor(newAuthor);
        books[update-1].getDetails();
        getMostExpensiveBook(books);
        getBooksOfYear(2020, books);
        getLeastNumberOfPages(books);

    }
    static void getMostExpensiveBook(Book arr[]){
        int max = 0,id=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i].getPrice() > max){
                max = (int)arr[i].getPrice();
                id = i;
            }
        }
        System.out.println("Title of the most expensive book: " + arr[id].getTitle());
    }

    static void getBooksOfYear(int year,Book arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getYear() == year){
                count++;
            }
        }
        System.out.println("Number of books published in "+year+" are: " + count);
    }

    static void getLeastNumberOfPages(Book arr[]){
        int least = arr[0].getPages(),i=0,id=0;
        for(i=0;i<arr.length;i++){
            if(arr[i].getPages() < least){
                least = arr[i].getPages();
                id= i;
            }
        }
        System.out.println("Details Of Book with least pages: ");
        arr[id].getDetails();
    }
}