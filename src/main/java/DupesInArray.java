public class DupesInArray {

    //The problem is that we want to find duplicates in a
    // T[] one-dimensional array of integers in O(N) running time where the
    // integer values are smaller than the length of the array!

    public void findDupes(int[] nums){
        if(nums.length !=0 ){
            int arraryLength = nums.length;
               for(int i =0 ; i< arraryLength ; i++){
                   int temp = nums[i];
                   int tempmode = Math.abs(temp);
                   int nextValue = nums[tempmode];
                   if(nextValue > 0){
                       nums[tempmode] = -nextValue;
                   }else {
                       System.out.println("this value is dupes ="+tempmode);
                   }
               }
        }else{

            System.out.println("This is empty string Tiger :)");
        }
    }



}
