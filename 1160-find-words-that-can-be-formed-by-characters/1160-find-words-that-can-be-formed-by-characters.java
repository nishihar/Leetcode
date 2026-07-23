class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int totalCount = 0;
        for (int a = 0; a < words.length; a++) {
            HashMap<Character, Integer> tempMap = new HashMap<>(map);
            int matchCount = 0;
            for (int i = 0; i < words[a].length(); i++) {
                char ch = words[a].charAt(i);
                if (tempMap.containsKey(ch) && tempMap.get(ch) > 0) {
                    matchCount++;
                    tempMap.put(ch, tempMap.get(ch) - 1);
                } else {
                    break;
                }
            }

            if (matchCount == words[a].length()) {
                totalCount += words[a].length();
            }
        }

        return totalCount;
    }
}