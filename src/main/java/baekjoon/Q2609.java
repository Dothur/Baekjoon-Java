package baekjoon;

import java.util.Scanner;

public class Q2609 {
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int r = num1 % num2; // ex) 24 % 18 = 6 // 18 % 6 = 0
            num1 = num2; // num1 에 18 // num1 에 6
            num2 = r; // num2 에 6  다시 반복 // num2 에 0 => 반복문 탈출 => 마지막 num1 = 6 을 return
        }
        return num1;
    }

    public static int lcm(int num1, int num2) {
        return num1 * num2 / gcd(num1, num2); // lcm 은 두 수 곱에 최대공약수를 나눠주면된다.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // 24
        int num2 = sc.nextInt(); // 18
        System.out.println(gcd(num1, num2));
        System.out.println(lcm(num1, num2));
    }
}
