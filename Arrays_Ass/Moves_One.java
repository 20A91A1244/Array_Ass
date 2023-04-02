import java.util.Scanner;
class Moves_One
{
public static void main(String[] args) {
    int[] arrNum = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
    int i, j = 0, n = arrNum.length;
    int[] temp = new int[n];

    for (i = 0; i < n; i++) {
        if (arrNum[i] != 1) {
            temp[j] = arrNum[i];
            j++;
        }
    }

    while (j < n) {
        temp[j] = 1;
        j++;
    }

    System.out.print("Array elements after moving Ones to end: ");
    for (i = 0; i < n; i++) {
        System.out.print(temp[i] + " ");
    }
}
}
