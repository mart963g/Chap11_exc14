package Exc_14;

import java.util.HashMap;
import java.util.Map;

public class Exc_14
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        map1.put("Martin",21);
        map1.put("Emil",30);
        map1.put("Elisabeth",26);
        map1.put("Sebastian",18);
        map2.put("Sebastian",18);
        map2.put("Martin",21);
        map2.put("Moster",56);
        map2.put("Logan",100);
        System.out.println(intersect(map1,map2));
    }

    public static Map<String,Integer> intersect(Map<String,Integer> map1, Map<String,Integer> map2)
    {
        Map<String,Integer> returnMap = new HashMap<>();
        for(String s: map1.keySet())
        {
            if(map2.containsKey(s) && map1.get(s)==map2.get(s))
            {
                returnMap.put(s,map1.get(s));
            }
        }
        return returnMap;
    }

}
