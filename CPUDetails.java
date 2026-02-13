class CPU
{
    double price=15000.0;
    class Processor
    {
        int cores=10;
        String manufacturer="PEntium";
    }
    static class RAM
    {
        double memory=64;
        String manufacturer="Intel";        
    }
}

public class CPUDetails
{
    public static void main(String args[])
    {
        CPU c=new CPU();
        CPU.Processor p=c.new Processor();
        CPU.RAM r=new CPU.RAM();
        System.out.println("CPU CLASS");
        System.out.println("_________________");
        System.out.println("CPU price="+c.price);
        System.out.println("Process inner class");
        System.out.println("______________________");
        System.out.println("No of cores="+p.cores);
        System.out.println("MAnufacturer="+p.manufacturer);
        System.out.println("RAM static nested class");
        System.out.println("_____________________");
        System.out.println("Memory ="+r.memory);
        System.out.println("Manufacturer="+r.manufacturer);

    }
}