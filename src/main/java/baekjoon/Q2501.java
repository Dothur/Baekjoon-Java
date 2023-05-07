package baekjoon;

import java.util.Scanner;

public class Q2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        for(int i=1; i<= num; i++){
            if(num % i == 0){
                cnt++;
                if(cnt == k) System.out.printf("%d", i);
            }
        }
        if(cnt < k) System.out.printf("%d", 0);
    }
}
