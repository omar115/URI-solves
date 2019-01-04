import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();
        double MEDIA = ((A*2)+(B*3)+(C*5))/(2+3+5);
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}
