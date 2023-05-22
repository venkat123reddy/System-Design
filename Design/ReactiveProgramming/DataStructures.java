package ReactiveProgramming;

import java.util.ArrayList;
import java.util.List;

public class DataStructures {

    public static  void  main(String args[])
    {
        List<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(432);
        arr.stream().forEach(x->System.out.println(x));

    }
}
