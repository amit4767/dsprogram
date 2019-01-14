public class Helloworld {

    public static void main(String[] args) {
        int [] arr  = new int[6];
        arr[0] =1;
        arr[1] =2;
        arr[2] =5;
        arr[3] =3;
        arr[4] =4;
        arr[5] =5;

         // Testing for dupes in array
        new DupesInArray().findDupes(arr);

        int bigArry[]  ={1,3,5,6,8,9 ,10,15,16,18,19,20,21,22, 34,34};

         // testing for random select in array
        new ReservoirAlgo().randonSelet(bigArry,5);

    }



}
