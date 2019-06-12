import java.util.Scanner;

public class SumAB {
    
    public static void main(String[] args){

    	System.out.println("Введите число А:");
    	double A = new Scanner(System.in).nextDouble();
    	System.out.println("Введите число B: ");
    	double B = new Scanner(System.in).nextInt();
    
    	System.out.println("Сумма чисел А и В:");
    	System.out.println((int)A+B);
    
    }
    
}
