import java.util.Scanner;
class Frequency{
public static void main(String[] args) {
    int[] arrSuperSet = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
    int[] arrSubSet = {1, 2, 3, 5, 9};

    Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < arrSubSet.length; i++) {
        freqMap.put(arrSubSet[i], 0);
    }

    for (int i = 0; i < arrSuperSet.length; i++) {
        int currentElement = arrSuperSet[i];
        if (freqMap.containsKey(currentElement)) {
            freqMap.put(currentElement, freqMap.get(currentElement) + 1);
        }
    }

    for (int i = 0; i < arrSubSet.length; i++) {
        int currentElement = arrSubSet[i];
        System.out.println("Frequency of " + currentElement + ": " + freqMap.get(currentElement));
    }
}

}