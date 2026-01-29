public class Rectangle 
{
    double length,breadth;
    void getData(double l,double b)
    {
        length=l;
        breadth=b;
    }
    double calArea()
    {
        return length*breadth;
    }

    public static void main(String[] args) 
    {
        Rectangle r= new Rectangle();
        r.getData(12.38,13);
        System.out.println("Area of rectangle is :"+r.calArea());
        
    }

    
}
