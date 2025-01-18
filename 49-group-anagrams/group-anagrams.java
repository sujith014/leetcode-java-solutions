class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(s);

        }

        return new ArrayList<>(anagrams.values());
    }
}