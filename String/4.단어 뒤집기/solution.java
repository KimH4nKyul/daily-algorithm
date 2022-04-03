import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

class Main {
    public static String reverse(char[] charArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length; 0 < i; i--) {
            sb.append(charArray[i - 1]);
        }
        sb.append("\n");
        return sb.toString();
    }

    public static List<String> inputStrings(int num, BufferedReader br) throws IOException {
        List<String> lists = new ArrayList<>();
        // int n = Character.getNumericValue(num);

        for (int i = 0; i < num; i++) {
            char[] chars = br.readLine().toCharArray();
            lists.add(reverse(chars));
        }
        return lists;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<String> lists = inputStrings(num, br);
        br.read()
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String s : lists) {
            bw.append(s);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}