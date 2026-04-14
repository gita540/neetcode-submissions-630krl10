class Solution {
    public boolean isAnagram(String s, String t) {
 if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch2 = t.charAt(i);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !map2.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }
}
