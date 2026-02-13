import java.util.Scanner;
public class Student
{
    int rollno, m1, m2, m3;
    String name;
    int total;
    float average;

    void getData()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter Student Name, Roll no, and marks of 3 subjects:");

        name = s.nextLine();
        rollno = s.nextInt();
        m1 = s .nextInt();
        m2 = s .nextInt();
        m3 = s .nextInt();
        s.close();
    }

    void cal()
    {
        total = m1 + m2 + m3;
        average = total / 3.0f;
        System.out.println("Total marks : " + total);
        System.out.println("Average : " + average);
    }

    public static void main(String[] args)
    {
        Student r = new Student();
        r.getData();
        System.out.println("\nStudent Details\n");
        System.out.println("Name : " + r.name);
        System.out.println("Rollno : " + r.rollno);
        r.cal();
    }
}