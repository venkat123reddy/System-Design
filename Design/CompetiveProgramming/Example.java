package CompetiveProgramming;

import java.util.stream.Stream;


@FunctionalInterface
interface calculation
{
   int add();
   public default int display()
   {
       System.out.println("abc");
       return 12;
   }
}
public class Example {

    static public int x =0;
    public static int  display()
    {
        System.out.println("abc");
        return 5;
    }
    public static void main(String args[])
    {
        System.out.println(Example.x);
        Stream<Integer> arr= Stream.of(1,2,3,4,5,6);
        long count = arr.filter(x->x%2==0).count();
        calculation c= Example::display;
        c.add();
    }
}
