package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
                // substring 을 사용하므로 ababc 면 5까지 j 는 5까지 해줘야 끝까지감
                // 0, 1 => a / 0, 2 => ab ... 4, 5 => c
            }
        }
        System.out.println(set.size());
    }
}
