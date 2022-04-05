import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int recent = 0;
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < target; i++) {
            int t = Integer.parseInt(br.readLine());
            lists.add(t);
            // if (lists.isEmpty() || (t < recent)) {
            // recent = t;
            // lists.add(t);
            // }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(lists.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}