package baekjoon;

import java.util.Scanner;

public class Q2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = count; j > i * 2 - count+1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =1; i< count; i++){
            for (int j=count-1; j>i; j--){
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
