class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res = new HashMap<>();
        for (String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            res.putIfAbsent(sortedString, new ArrayList<>());
            res.get(sortedString).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
