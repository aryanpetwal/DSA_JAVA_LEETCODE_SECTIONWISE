class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String [] arr = s.split(" ");
        if(arr.length != pattern.length()){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++){
                char ch = pattern.charAt(i);
                String word = arr[i];
        
            if(map.containsKey(ch) && !map.get(ch).equals(word) ||        !map.containsKey(ch) && map.containsValue(word)) {
            return false ;
             }
             map.put(ch,word);
        } 
        return true;
    }
}