import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubblerSort {


    public List<Integer> getSortedArray(int[] arr){

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 1; i < arr.length ;i++){

             for(int j = 0; j < arr.length -1 ;i++)
             {

                 if(arr[j] > arr[j+1]){

                     int temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;

                 }
             }
        }

        for (int i : arr)
        {
            result.add(i);
        }
         return  result;
    }

    public static void main(String[] args) {


        BubblerSort bubblerSort = new BubblerSort();

        System.out.println("sorted array = "+bubblerSort.getSortedArray(new int[]{5,8,8,11,1,4,6,933}));
    }
}
