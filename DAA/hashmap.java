package DAA;

import java.util.HashMap;
import java.util.Map;

// public class hashmap {
//     public static void main(String[] args) {
//         Map<Integer,String> student = new HashMap<Integer,String>();
//         student.put(1,"Badmosh");
//         student.put(2,"Badmosh2");
//         student.put(3,"Badmosh3");
//         System.out.println(student.get("Badmosh"));
//     }
// }


public class HashMapExample {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        System.out.println(map.get(2));
    }
}
