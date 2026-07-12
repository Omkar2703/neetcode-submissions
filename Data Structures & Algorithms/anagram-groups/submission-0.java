class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char s_arr[] = s.toCharArray();
            Arrays.sort(s_arr);
            String s_new = new String(s_arr);
            if(!map.containsKey(s_new)){
                map.put(s_new, new ArrayList<>());
            }
            map.get(s_new).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
