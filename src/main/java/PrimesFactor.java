import java.util.ArrayList;

public class PrimesFactor {



    public ArrayList<Long> findPrimeFactor(long number){

        ArrayList<Long> result = new ArrayList<Long>();
        long factor = 2;
        int count = 0;
        int sqrt = (int) Math.sqrt(number);
        System.out.println("sqrt ="+sqrt);
        while(number > 1  && (sqrt >=factor)){
            count = count +1;
            if(number % factor ==0 ) {
                result.add(factor);
                number = number/factor;
            }else {
                factor = factor +1;

                if(factor>sqrt) {
                    result.add(number);
                    break;

                }


            }
        }
        System.out.println("count ="+count);
        return  result;
    }

    public static void main(String[] args) {

        PrimesFactor primesFactor = new PrimesFactor();

        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(38l));
        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(9l));
        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(11l));
        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(51l));
        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(168l));
        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(51l));
        System.out.println("Prime factor are :"+primesFactor.findPrimeFactor(2100078578l));
    }
}
