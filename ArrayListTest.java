import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        //COMPLETE ME: print each name using standard for loop
        for (int index = 0; index < names.size(); index++)
        {
            System.out.println(names.get(index));
        }
        //COMPLETE ME: print each name (again!) using enhanced for loop
        for (String n: names)
        {
            System.out.println(n);
        }
        //COMPLETE ME: print each name (a third time!) using a while loop
        int i = 0;
        while (i < names.size())
                {
            System.out.println(names.get(i));
            i++;
                }
    }
}
