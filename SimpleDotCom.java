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

				result = "�������";

			} else {
			
				result = "�����";
		
			}
					
		}	

		return result;

	}	

}


/*
	int[] locationCells; //������������� ������ ��� �������� ������ �����
	int numOfHits=0;	//���������� ���������

	ArrayList list = new ArrayList();

	 ����� checkYourself(), ��������� ��� ����������� � �������� ���������
	String, ��������� ��� � ���������� ���������: "�����", "����" ��� "�������"
	
	
	String checkYourself(String userGuess){

		int guess = Integer.parseInt(userGuess);
			
		String result = "����";

		for(int cell : locationCells){


			if(list.contains(guess)){

				
				System.out.println("���������� ��� �������!");
				
				break;

			}

			list.add(guess);

			if(guess == cell) { 
 				
				numOfHits++;			

				result = "�����";

				break;

			}			
				
		}		

		if(numOfHits==locationCells.length) {

			result = "�������";
		
		}
		
		System.out.println(result);
		
		return result;
			
	}

	 ������ setLocationCells, ��������� ������������� ������ � ������������� 
	���������� �������� ����, ��������� ������ ����� 

	void setLocationCells( int[] cellLocations){
				
		locationCells =  cellLocations;	

	}

*/
