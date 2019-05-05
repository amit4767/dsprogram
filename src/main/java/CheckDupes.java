public class CheckDupes {

    private  boolean checkDupes(int [] arr){
        boolean dupes = false;

        for(int i =0; i < arr.length ; i++){

            for(int j =i+1; j < arr.length ; j++)

                if(arr[i] == arr[j])
                    dupes= true;
        }
        return  dupes;
    }
    public static void main(String[] args) {

        CheckDupes cd = new CheckDupes();

        System.out.println("check dupes = "+cd.checkDupes(  new int[]{91,2,34,5,8,9}));
        System.out.println("check dupes = "+cd.checkDupes(  new int[]{9,2,34,5,8,9}));
        System.out.println("check dupes = "+cd.checkDupes(  new int[]{9,2,34,5,8,4,18,100,15,3223}));
        System.out.println("check dupes = "+cd.checkDupes(  new int[]{1,2,3,4,5,6,7,8}));
        System.out.println("check dupes = "+cd.checkDupes(  new int[]{1,2,3,4,5,6,5,6}));

    }
}
