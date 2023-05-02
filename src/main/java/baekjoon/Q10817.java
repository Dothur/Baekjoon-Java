package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] threeNumArr = new int[3];
        for(int i=0; i<threeNumArr.length; i++){
            threeNumArr[i] = sc.nextInt();
        }
        Arrays.sort(threeNumArr);
        System.out.println(threeNumArr[1]);
    }
}
