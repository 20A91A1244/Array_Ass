public class Min_Max {
    public static void main(String[] args) {
        int[] arrNum = {31, 42, 25, 21, 56, 61, 13, 45, 76, 55};

        int count = arrNum.length;
        int minVal = arrNum[0];
        int maxVal = arrNum[0];
        int sum = 0;

        for(int i = 0; i < count; i++) {
            if(arrNum[i] < minVal) {
                minVal = arrNum[i];
            }
            if(arrNum[i] > maxVal) {
                maxVal = arrNum[i];
            }
            sum += arrNum[i];
        }

        double avgVal = sum/count;

        System.out.println("The element with the Minimum value: " + minVal);
        System.out.println("The element with the Maximum value: " + maxVal);
        System.out.println("Average of all array elements: " + avgVal);
        System.out.println("Total number of array elements: " + count);
    }
}