import java.util.Scanner;

public class triangleCount{
	
	public static void main(String... args){
		
		new triangleCount().go();
		
	}
		
	public void go(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите кол-во треугольника");
		int n = scanner.nextInt();
		int count = triangle(n);
		System.out.println("Kол-во треугольника "+count);
		
	}	
	
	public int triangle(int n){
		if(n==1) return 1;
		else return( n + triangle(n-1) ); 
	}

		
}