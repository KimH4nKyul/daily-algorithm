import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    static String reverse(String target) {
        char[] cArray = target.toCharArray();
        int lt = 0;
        int rt = cArray.length - 1;
        while (lt < rt) {

            if (!(Character.isAlphabetic(cArray[lt])))
                lt++;
            else if (!(Character.isAlphabetic(cArray[rt])))
                rt--;
            else {
                char temp = cArray[lt];
                cArray[lt] = cArray[rt];
                cArray[rt] = temp;
                lt++;
                rt--;
            }

        }
        return String.valueOf(cArray);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        String result = reverse(target);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(result);
        bw.flush();
        bw.close();
        br.close();
    }
}