package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean flag = true;
        List<Character> list = new ArrayList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            list.add(str.charAt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != str.charAt(i)){
                flag = false;
                break;
            }
        }
        System.out.println(flag ? 1 : 0);
    }
}
