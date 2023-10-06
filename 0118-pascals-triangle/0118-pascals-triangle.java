class Solution {
    public List<List<Integer>> generate(int numRows) {
      
        List<List<Integer>> list = new ArrayList<>();

        //For handling Row 1, which will include 0c0 = 1
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        if(numRows == 1) {
            return list;
        }

        for(int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            
            //For adding first element in each row -> (ic0) = 1 where i ranges from 1 to numRows-1
            temp.add(1);

            for(int j = 1; j < i; j++) {
                temp.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }

            //For adding last element in each row -> (ici) = 1 where i ranges from 1 to numRows-1
            temp.add(1);
            list.add(temp);
        }
        
        return list;
    }
}