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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> problems = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();

        int len = Integer.parseInt(br.readLine());
        String[] values = br.readLine().split(" ");
        
        if((len < values.length) || values.length < len) {
            System.exit(-1);
        }


        for(int i=0; i<values.length; i++) {
            problems.add(Integer.parseInt(values[i]));
        }
       
        answers.add(problems.get(0));
        for(int i=1; i<problems.size(); i++) {
            if(problems.get(i) > problems.get(i-1)) {
                answers.add(problems.get(i));
            }
        }

        for(int i=0; i<answers.size(); i++) {
            bw.append(String.valueOf(answers.get(i)) + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}