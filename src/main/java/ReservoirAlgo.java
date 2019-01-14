import java.util.Random;

public class ReservoirAlgo {

    //Task is to design an algorithm thats capable of selecting k items from an array!
    // The problem is that the n size of the array is unknown (or infinitely large)!

    //hell

    //it would very easy to select any random number if knw the size of array
    //i.e new Randon.nextInt(lengthofArray)

    private Random random;

    public  ReservoirAlgo(){
         this.random = new Random();
    }


    public  void randonSelet(int [] num , int k){

        //create array to select random k item
      int [] reservoir = new int[k];

      //copied starting 5 element from big to sample array
      for(int i = 0 ; i <k  ; i ++)
          reservoir[i] = num[i];



      //k +1 because we have already copied k element

      for(int i = k+1 ; i < num.length  ; i++){

          //the ith element chosen to be include with probability k/i
          int j = random.nextInt(i) +1;
          if(j < k)  reservoir[j]  = num[i];

      }

      System.out.print("Random selected array");
      for(int i=0 ;i < reservoir.length  ;i++){
          System.out.print(" "+reservoir[i]);
      }

    }

}
