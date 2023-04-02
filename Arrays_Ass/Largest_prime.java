import java.io.*;
public class Largest_Prime {
    public static void main(String[] args) {
        int[] arrNum = {2, 29, 51, 8, 4};
        int maxPrime = Integer.MIN_VALUE;

        for (int num : arrNum) {
            if (isPrime(num) && num > maxPrime) {
                maxPrime = num;
            }
        }

        if (maxPrime == Integer.MIN_VALUE) {
            System.out.println("There are no prime numbers in the array.");
        } else {
            System.out.println("The largest prime number in the array is: " + maxPrime);
        }
    }

   
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}