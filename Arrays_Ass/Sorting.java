import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        Integer[] arrNum = {23, 21, 44, 32, 12};

  
        Arrays.sort(arrNum);
        System.out.println("The elements in ascending order: " + Arrays.toString(arrNum));

       
        Arrays.sort(arrNum, Collections.reverseOrder());
        System.out.println("The elements in descending order: " + Arrays.toString(arrNum));
    }
}