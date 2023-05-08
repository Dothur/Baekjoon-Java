package baekjoon;

import java.util.Scanner;

public class Q2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] eightArr = new int[8];
        for (int i = 0; i < eightArr.length; i++) {
            eightArr[i] = sc.nextInt();
        }
        int idx = 0;
        boolean ascflag = false;
        boolean descflag = false;
        while (idx < 7) {
            if (eightArr[idx] + 1 == eightArr[idx + 1]){
                ascflag = true;
                idx++;
            } else if (eightArr[idx] - 1 == eightArr[idx + 1]){
                descflag = true;
                idx++;
            } else {
                ascflag = false;
                descflag = false;
                break;
            }
        }
        if (ascflag){
            System.out.println("ascending");
        } else if (descflag){
            System.out.println("descending");
        } else if (!ascflag && descflag == false){
            System.out.println("mixed");
        }
    }
}