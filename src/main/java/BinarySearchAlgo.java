public class BinarySearchAlgo {

    public  boolean findNumber(int a , int [] arr){
       int starpoint = 0;
       int endPoint = arr.length -1;
       while(starpoint <= endPoint){
           System.out.println("startponit = "+starpoint);
           System.out.println("endPoint = "+endPoint);
           int midpoint = (endPoint - starpoint)/2 + starpoint;
           if(arr[midpoint] == a ) return  true;
           if(arr[midpoint] > a) {
               endPoint = midpoint-1;
           }else {
               starpoint = midpoint +1;
           }

       }
        return  false;
    }

    public static void main(String[] args) {

        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();

        System.out.println(binarySearchAlgo.findNumber(10,new int[] {1,2,3,4,5,6,7,8,9}));
    }
}
