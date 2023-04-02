import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] arrNum = {31, 42, 25, 21, 56, 61, 13, 45, 76, 55};

        System.out.print("The elements in reverse order - \n");

        for(int i = arrNum.length-1; i >= 0; i--) {
            System.out.print(arrNum[i] + " ");
        }
    }
}