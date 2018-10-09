package Dev_04_10_18;

public class extractIntegerfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="vinod 1234 Bangalore";
		for(Character ch:str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				System.out.print(ch);
			}
			
		}

	}

}
