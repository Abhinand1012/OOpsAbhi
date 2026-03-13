class Inheritance
{
    int id=11;
    String pname="Amal";

}
class Child extends Inheritance
{
    int age=22;
    void putData()
    {
        System.out.println("id :"+id);
        System.out.println("name :"+pname);
        System.out.println("age :"+age);
    }
}
class Single{
    public static void main(String args[])
    {
        Child obj=new Child();
        obj.putData();
    }
}