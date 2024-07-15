class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int c = 0;

        HashMap<Integer, String> map = new HashMap();

        for(int i = 0; i<names.length; i++){
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        for(int i = heights.length-1; i >= 0; i--){
            names[c] = map.get(heights[i]);
            c++; 
        }

        return names;
    }
}
