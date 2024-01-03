import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String ,List<String>> map = new HashMap<>();
        for( String s: strs){
            char charArray[]= s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr= new String(charArray);
            
            if(!map.containsKey(sortedStr)) {
            map.put(sortedStr, new LinkedList<String>());
            }
            map. get(sortedStr).add(s);
        }
        return new LinkedList<>(map.values());
    }
}