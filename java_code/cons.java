class cons
{
    int num;
    String name;
    cons()
    {
        System.out.println("constructor call");
    } 
}
class demo
{
    public static void main(String args[])
    {
        cons x= new cons();
        System.out.println(x.name); 
        System.out.println(x.num); 
    }
}