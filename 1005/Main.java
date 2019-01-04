import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        float A = input.nextFloat();
        float B = input.nextFloat();
        double MEDIA = ((A*3.5)+(B*7.5))/(3.5+7.5);
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}
