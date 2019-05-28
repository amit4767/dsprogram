import java.util.ArrayList;

public class PrimesFactor {


    public ArrayList<Long> findPrimeFactor(long number){

        ArrayList<Long> result = new ArrayList<Long>();
        long factor = 2;
        while(number > 1 ){
            if(number % factor ==0 ) {
                result.add(factor);
                number = number/factor;
            }else {
                factor = factor +1;
            }
        }
        return  result;
    }

    public static void main(String[] args) {

        PrimesFactor primesFactor = new PrimesFactor();

        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(10l));
        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(9l));
        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(11l));
    }
}
