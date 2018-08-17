import java.util.ArrayList;

public class DotComBust {

	private	GameHelper helper = new GameHelper();

	private	ArrayList<DotCom> dotComsList = new ArrayList<DotCom>(); //список объектов DotCom (изначально три)

	private int numOfGuesses =  0; // кол=во ходов пользователя

	/*
		метод setUpGame предназначенный для создания объектов DotCom  и
		присвоения им име и адресов.
	*/

	private void setUpGame(){

		//Созданим несколько "сайтов" и присвоим им адреса
		DotCom dot1 = new DotCom("Pet.com");
		DotCom dot2 = new DotCom("W3.org");
		DotCom dot3 = new DotCom("WOW.WWW");
		dotComsList.add(dot1); 
		dotComsList.add(dot2); 
		dotComsList.add(dot3); 

		System.out.println("Ваша цель - потопить три \"сайта\" ");
		System.out.println(dot1.getName()+" "+dot2.getName()+" "+dot3.getName()+" ");
		System.out.println("Попытайтесь потопить из за мнимальное количество ходов");

		for(DotCom dotComToSet : dotComsList){

			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
	
		}	

	}

	/*
		метод startPlaying запрашивает у пользователя ход и вызывает метод
		checkUserGuess, пока все объекты DotCom не выведены из игры
	
	*/

	private void startPlaying() {

		while(!dotComsList.isEmpty()){
					
			String userGuess = helper.getUserInput("Введите координаты:");
			checkUserGuess(userGuess);
		}

		finishGame();

	}

	/*
		метод checkUserGuess который просматривает все остальные объекты
		DotCom и вызывает каждый объект DotCom метода checkYourself
	
	*/

	private void checkUserGuess(String userGuess){
		
		numOfGuesses++;
		String result = "MIMO";

		for(DotCom dotComtToTest : dotComsList) {

			result = dotComtToTest.checkYourself(userGuess);
		
			if(result.equals("ПоПал")) break;
			if(result.equals("ПоТоПиЛ")){
				dotComsList.remove(dotComtToTest);
				break;
			}

		}
		
		System.out.println(result);

	}

	/*
		метод finishGame который выводит на экран сообщение об успехах 
		пользователя  основываясь на том, за сколько ходов тот потопил все
		объекты DotCom
	*/

	private void finishGame() {
		System.out.println("Все \" сайты \" ушли ко дну! Ваши акции теперь ничего не стоят.  ");
		if(numOfGuesses <=18) {
			System.out.println("Это занято у вас всего " + numOfGuesses + " попыток.");		
			System.out.println("Вы успели выбраться до того, как ваши вложения утонули. ");		
		} else {
			System.out.println("Это заняло у вас довольно много времени.  " + numOfGuesses + " попыток.");		
			System.out.println("Рыбы водят хороводы вокруг ваших вложений. ");		
		}

	}			

	public static void main (String [] args){

		DotComBust  game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}