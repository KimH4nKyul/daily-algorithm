import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Main2 {
    public static void main(String[] args) throws IOException {
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int current = 0;
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < target; i++) {
            int t = Integer.parseInt(br.readLine());
            if (lists.isEmpty() || lists.size() < 3) {
                lists.add(t);
                current = t;
            } else {
                if (current < t) {
                    lists.add(t);
                }
                current = t;
            }
        }
        lists.remove(1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(lists.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}