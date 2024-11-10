import java.util.HashMap;

public class mapBasic {
    public static void main(String[] args) {
        HashMap<String, Integer> mapp = new HashMap<>();
        mapp.put("warish",12);
        mapp.put("masood",34);
        mapp.put("harse",44);
        mapp.put("mritunjay",99);
        mapp.put("kaif",78);
        System.out.println(mapp+" "+mapp.size());
        System.out.println(mapp.containsKey("warish"));
        System.out.println(mapp.containsKey("Danish"));
        System.out.println(mapp.containsValue(44));
        System.out.println(mapp.containsValue(100));
        mapp.remove("mritunjay");
        System.out.println(mapp+" "+mapp.size());
       System.out.println( mapp.get("warish"));
    }
}
