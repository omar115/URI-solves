import java.io.*;

public class Main {
    
    public static void main (String[] args) throws IOException {
        
        BufferedReader f = new BufferedReader (new InputStreamReader (System.in));
        
        int a = Integer.parseInt(f.readLine());
        int b = Integer.parseInt(f.readLine());
        int x = a * b;
        
        System.out.printf("PROD = %d\n",x);
        
    }
    
}
