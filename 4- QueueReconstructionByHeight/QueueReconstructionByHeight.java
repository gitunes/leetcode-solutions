class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b)-> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]); 
        ArrayList<int[]> list = new ArrayList<int[]>();
        for(int[] person : people) {
            int index = person[1];
            list.add(index, person);
        }
        int[][] result = new int[people.length][2];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
     }
}