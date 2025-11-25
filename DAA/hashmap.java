package DAA;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<Integer,String>();
        student.put(1,"Badmosh");
        student.put(2,"Badmosh2");
        student.put(3,"Badmosh3");
        System.out.println(student.get("Badmosh"));
    }
}
