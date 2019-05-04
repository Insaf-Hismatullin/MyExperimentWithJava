public class ExTestDrive{

	public static void main(String[] args){

		String test = args[0];
		
		System.out.print("t");
		
		try{
		
			doRisky(test);
			System.out.print("r");
			System.out.print("o");	
		
	
		}catch(myEx ex){
			
			System.out.print("a");			

		}finally{

			System.out.print("w");
			System.out.print("s");

		}

	}

	public static void doRisky(String t) throws myEx{

		System.out.print("h");
	
		if("yes".equals(t)){
			throw new myEx();
		}

	}

}