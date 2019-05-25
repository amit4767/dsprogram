import java.util.ArrayList;
import java.util.List;

public class SimpleIntersection {


    public List<Integer> findIntersection(int[] a, int[] b){

        List<Integer>  result = new ArrayList<Integer>(a.length);

        for(int x:a)
             for(int y:b)
                 if(x ==y) result.add(x);
        return  result;

    }
    
    public static void main(String[] args) {

        SimpleIntersection simpleIntersection = new SimpleIntersection();

        System.out.println(simpleIntersection.findIntersection(new int[]{1,4,5,6},new int[]{5,6,9,8}));
    }
}