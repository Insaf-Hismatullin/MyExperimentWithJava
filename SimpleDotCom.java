import java.util.ArrayList;

public class SimpleDotCom {

	private ArrayList<String> locationCells; 	

	public void setLocationCells(ArrayList<String> loc){

		locationCells = loc;

	}

	public String checkYourself(String userInput){

		String result = "MIMO";
		
		int index = locationCells.indexOf(userInput);

		if (index >= 0) {

			locationCells.remove(index);
			
			if(locationCells.isEmpty()){

				result = "ПоТоПиЛ";

			} else {
			
				result = "ПопаЛ";
		
			}
					
		}	

		return result;

	}	

}


/*
	int[] locationCells; //целочисленный массив для хранения адреса ячеек
	int numOfHits=0;	//количества попаданий

	ArrayList list = new ArrayList();

	 метод checkYourself(), принимает ход пользовател в качестве параметра
	String, проверяет его и возвращает результат: "Попал", "Мимо" или "Потопил"
	
	
	String checkYourself(String userGuess){

		int guess = Integer.parseInt(userGuess);
			
		String result = "МИМО";

		for(int cell : locationCells){


			if(list.contains(guess)){

				
				System.out.println("Координаты уже введины!");
				
				break;

			}

			list.add(guess);

			if(guess == cell) { 
 				
				numOfHits++;			

				result = "ПоПаЛ";

				break;

			}			
				
		}		

		if(numOfHits==locationCells.length) {

			result = "ПоТоПиЛ";
		
		}
		
		System.out.println(result);
		
		return result;
			
	}

	 сеттер setLocationCells, принимает целочисленный массив и присваиеваеть 
	полученный параметр полю, хранящему адреса ячеек 

	void setLocationCells( int[] cellLocations){
				
		locationCells =  cellLocations;	

	}

*/
