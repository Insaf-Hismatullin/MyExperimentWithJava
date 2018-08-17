import java.util.ArrayList;

public class DotCom {

	private ArrayList<String> locationCells;
	private String name;

	public DotCom(String name){
	
		this.name = name; 
	
	}

	public void setLocationCells(ArrayList<String> loc) {

		locationCells = loc;
		
	}

	public String getName() {
		
		return name;
	}

	public String checkYourself(String userInput) {

		String result = "MIMO";

		int index = locationCells.indexOf(userInput);
		
		if(index >= 0 ) {

			locationCells.remove(index);

			if(locationCells.isEmpty()){
			
				result = "ѕо“оѕиЋ";
				System.out.println("ќй! ¬ы потопили " + name + " :(");

			}else result = "ѕоѕал";
		}
		
		return result;

	}

}