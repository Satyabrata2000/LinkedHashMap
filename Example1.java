package LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Example1 {

    public static void main(String[] args) {

        LinkedHashMap lhm  = new LinkedHashMap();

        lhm.put("name1", 1);
        lhm.put("name2", 2);
        lhm.put("name3", 3);
        lhm.put("name4", 4);

        Set set = lhm.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry example = (Map.Entry) i.next();
            System.out.println(example.getKey() + " : " + example.getValue());
        }
    }
}
