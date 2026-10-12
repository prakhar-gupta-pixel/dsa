class Solution {
    public int findLucky(int[] arr) {
    

     Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int result=-1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                result = Math.max(result, entry.getKey());
            }
        }
        return result;
    }
}