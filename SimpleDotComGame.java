import java.util.Scanner;

public class SimpleDotComGame {

	public static void main (String[] args){

		int numOfGuesses = 0;
		
		SimpleDotCom dot = new SimpleDotCom();

		int location = (int) (Math.random()*5);
		
		int [] locations = {location, location+1, location+2};
		
		dot.setLocationCells(locations);	

		boolean isAlive = true;
	
		while(isAlive){

			System.out.println("Введите координаты:");

			String result = dot.checkYourself(new Scanner(System.in).nextLine());

			numOfGuesses++;
	
			if(result == "ПоТоПиЛ"){

				isAlive = false;
				System.out.println("Количества попыток:"+numOfGuesses);
				
			}
		}	

	}

}