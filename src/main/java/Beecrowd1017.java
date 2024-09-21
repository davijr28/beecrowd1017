import java.util.Scanner;
public class Beecrowd1017 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int time,speed;
        float liters;
        
        //ler as variáveis
        time = leitor.nextInt();
        speed = leitor.nextInt();
        
        liters = (float) ((speed*time)/12.0);
        
        //mostrar resultado no console
        System.out.printf("%.3f%n" , liters);
    }
}