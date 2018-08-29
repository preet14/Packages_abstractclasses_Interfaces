import java.util.Scanner;
public class Maximum
{
     Scanner s=new Scanner(System.in);

     String n1=s.next();
     String n2=s.next();
     void compare() 
     {
	if(Integer.parseInt(n1)>Integer.parseInt(n2)) 
        {
		System.out.println("n1 is largest "+n1);
	}
	else 
        {
		System.out.println("n2 is largest "+n2);
	}
     }
      public static void main(String[] args) 
       {
		
          Maximum m=new Maximum();
	  m.compare();
       }
}