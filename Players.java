 class Players
 {
  int id,score,match;
  String name;
  double avg;
  Players(int i,int s,int m,String n)
  {
   id=i;
   score=s;
   match=m;
   name=n;
  }
 double average()
 {
  avg=score/match;
  return avg;
 }
 void display()
 {
  System.out.println("Player Name:"+name);
  System.out.println("Player ID:"+id);
  System.out.println("Player Total Score:"+score);
  System.out.println("No. of matches played:"+match);
  System.out.println("Average score:"+ average());
 }
 public static void main(String args[])
 {
  double a1,a2;
  Players ob1=new Players(7,13622,25,"Dhoni");
  Players ob2=new Players(14,15422,15,"kohli");
  ob1.display();
  ob2.display();
  a1=ob1.average();
  a2=ob2.average();
  if(a1>a2)
  System.out.println("Player 1 has greater average score:"+a1);
  else
  System.out.println("Player 2 has greater average score:"+a2);
  }
 }