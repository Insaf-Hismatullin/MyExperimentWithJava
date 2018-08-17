import java.util.ArrayList;

public class DotComBust {

	private	GameHelper helper = new GameHelper();

	private	ArrayList<DotCom> dotComsList = new ArrayList<DotCom>(); //������ �������� DotCom (���������� ���)

	private int numOfGuesses =  0; // ���=�� ����� ������������

	/*
		����� setUpGame ��������������� ��� �������� �������� DotCom  �
		���������� �� ��� � �������.
	*/

	private void setUpGame(){

		//�������� ��������� "������" � �������� �� ������
		DotCom dot1 = new DotCom("Pet.com");
		DotCom dot2 = new DotCom("W3.org");
		DotCom dot3 = new DotCom("WOW.WWW");
		dotComsList.add(dot1); 
		dotComsList.add(dot2); 
		dotComsList.add(dot3); 

		System.out.println("���� ���� - �������� ��� \"�����\" ");
		System.out.println(dot1.getName()+" "+dot2.getName()+" "+dot3.getName()+" ");
		System.out.println("����������� �������� �� �� ���������� ���������� �����");

		for(DotCom dotComToSet : dotComsList){

			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
	
		}	

	}

	/*
		����� startPlaying ����������� � ������������ ��� � �������� �����
		checkUserGuess, ���� ��� ������� DotCom �� �������� �� ����
	
	*/

	private void startPlaying() {

		while(!dotComsList.isEmpty()){
					
			String userGuess = helper.getUserInput("������� ����������:");
			checkUserGuess(userGuess);
		}

		finishGame();

	}

	/*
		����� checkUserGuess ������� ������������� ��� ��������� �������
		DotCom � �������� ������ ������ DotCom ������ checkYourself
	
	*/

	private void checkUserGuess(String userGuess){
		
		numOfGuesses++;
		String result = "MIMO";

		for(DotCom dotComtToTest : dotComsList) {

			result = dotComtToTest.checkYourself(userGuess);
		
			if(result.equals("�����")) break;
			if(result.equals("�������")){
				dotComsList.remove(dotComtToTest);
				break;
			}

		}
		
		System.out.println(result);

	}

	/*
		����� finishGame ������� ������� �� ����� ��������� �� ������� 
		������������  ����������� �� ���, �� ������� ����� ��� ������� ���
		������� DotCom
	*/

	private void finishGame() {
		System.out.println("��� \" ����� \" ���� �� ���! ���� ����� ������ ������ �� �����.  ");
		if(numOfGuesses <=18) {
			System.out.println("��� ������ � ��� ����� " + numOfGuesses + " �������.");		
			System.out.println("�� ������ ��������� �� ����, ��� ���� �������� �������. ");		
		} else {
			System.out.println("��� ������ � ��� �������� ����� �������.  " + numOfGuesses + " �������.");		
			System.out.println("���� ����� �������� ������ ����� ��������. ");		
		}

	}			

	public static void main (String [] args){

		DotComBust  game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}