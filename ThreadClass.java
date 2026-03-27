import java.util.Scanner;
class Multiplication extends Thread
{
    public void run()
    {
        System.out.println("Multiplication table of 5 :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" x 5 = "+i*5);
        }
        System.out.println("Existing from Thread Multiplication ");
    }

}

class EvenNumber extends Thread
{
    public void run()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        System.out.println("Even number upto "+n);
        for(int i=2;i<=n;i+=2)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}

public class ThreadClass
{
    public static void main(String[] args) {
        Multiplication a=new Multiplication();
        EvenNumber b=new EvenNumber();
        a.start();
        b.start();
    }
}
