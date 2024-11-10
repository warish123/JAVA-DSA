import java.util.HashMap;

public class map_iterate {
    public static void main(String[] args) {
         HashMap<String, Integer> mapp = new HashMap<>();
        mapp.put("warish",12);
        mapp.put("masood",34);
        mapp.put("harse",44);
        mapp.put("mritunjay",99);
        mapp.put("kaif",44);
        for (String key : mapp.keySet()) {
            System.out.println(key + " " + mapp.get(key));  
        }
        System.out.println();
        for (int val  : mapp.values()) {
            System.out.println(val);  
        }
        System.out.println();
        for (Object pair : mapp.entrySet()) {
            System.out.println(pair);
        }
    
    }
}
