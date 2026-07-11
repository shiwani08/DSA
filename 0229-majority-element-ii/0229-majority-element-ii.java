class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int div = (nums.length) / 3;

        // filling numbers with freq in the map
        for (int num : nums) {
            if(map.containsKey(num))
                map.put(num, map.getOrDefault(num, 0) + 1);

            else
                map.put(num, 1);
        }

        // search for div freq in map and add to the list
        for (int num : nums) {
            if(map.get(num) > div)
            if(list.contains(num) == false)
            list.add(num);
        }

        return list;
    }
}