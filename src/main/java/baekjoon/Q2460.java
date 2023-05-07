package baekjoon;

import java.util.Scanner;

public class Q2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfPeople = 0;
        int maxNumOfPeople = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int outVal = sc.nextInt();
            int inVal = sc.nextInt();
            if (i == 0){
                numOfPeople = inVal;
                maxNumOfPeople = numOfPeople;
            } else {
                numOfPeople = (numOfPeople - outVal) + inVal;
                if (numOfPeople > maxNumOfPeople){
                    maxNumOfPeople = numOfPeople;
                }
            }
        }
        System.out.println(maxNumOfPeople);
    }
}
