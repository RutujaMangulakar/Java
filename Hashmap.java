import java.util.HashMap;
import java.util.Set;
import java.util.Map;

class Hashing
{
    public static void main(String rg[])
    {
        //country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("China",150);
        map.put("US",100);
        System.out.println(map);
        map.put("China",180);

        //To remove
        map.remove("US");
        System.out.println(map);

        //contains?TRUE:False
        //map.get("No key")=> null
        if(map.containsKey("China"))
        {
            System.out.println("Key is present in map with value "+map.get("China"));
        }
        else
        {
            System.out.println("Key is not present in map");
        }

        //iterator
        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println();
        }

        //Alernative way
        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.println(key+" "+map.get(key));
        }
    }
}

