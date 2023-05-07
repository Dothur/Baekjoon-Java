package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] numArray = new int[testCase];
        for(int i=0; i<testCase; i++){
            numArray[i] = sc.nextInt();
        }
        Arrays.sort(numArray);
        System.out.printf("%d %d", numArray[0], numArray[testCase - 1]);
    }
}
