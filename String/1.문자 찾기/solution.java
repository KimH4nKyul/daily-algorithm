import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine().toUpperCase();
        char check = Character.toUpperCase((char) br.read());

        int count = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == check)
                count++;
        }
        System.out.println(count);
    }
}