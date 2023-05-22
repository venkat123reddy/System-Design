package SubstitionPriciple;

import java.util.LinkedList;

public class Main {

    public static void main(String ...args)
    {

        LinkedList <String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add(2,"B");
        //linkedList.remove("B");
        System.out.println(linkedList);
        Building building = new Building();
        Office office = new Office();
        print(building);
        print(office);

    }

    public static void print(Building building)
    {
        System.out.println(building.toString());
    }

    public  static  void printing(Office office)
    {
        System.out.println(office.toString());
    }

}
