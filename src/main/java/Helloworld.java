public class Helloworld {

    public static void main(String[] args) {
        int [] arr  = new int[6];
        arr[0] =1;
        arr[1] =2;
        arr[2] =5;
        arr[3] =3;
        arr[4] =4;
        arr[5] =5;


        new DupesInArray().findDupes(arr);
    }
}
