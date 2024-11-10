import java.util.HashMap;

public class valid_anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i< s.length();i++){
            char key = s.charAt(i);
            if(map1.containsKey(key)){
                int freq = map1.get(key);
                map1.put(key, freq+1);
            }
            else{
                map1.put(key, 1);
            }
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i< t.length();i++){
            char key = t.charAt(i);
            if(map2.containsKey(key)){
                int freq = map2.get(key);
                map2.put(key, freq+1);
            }
            else{
                map2.put(key, 1);
            }
        }
        for (char key  : map1.keySet()) {
            int val1 = map1.get(key);
            if(! map2.containsKey(key)){
                System.out.println("this is not anagram");
            }
            int val2 = map2.get(key);
            if(val1 != val2 ){
                System.out.println("this is not anagram");
            }
        
        }
        System.out.println("this is anagram");
    }
}
