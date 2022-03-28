import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] target = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char t : target) {
            if (Character.isLowerCase(t))
                sb.append(Character.toUpperCase(t));
            if (Character.isUpperCase(t))
                sb.append(Character.toLowerCase(t));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}