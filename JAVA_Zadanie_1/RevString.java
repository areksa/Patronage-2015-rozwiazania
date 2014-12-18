public class RevString 
{

	public static void main(String[] args) 
	{
		
		if(args.length == 1)
		{
			StringBuffer string = new StringBuffer(args[0]);
			string.reverse();
			System.out.println(string.toString());
		}
		else
		{
			System.out.println("Blad: brak parametru lub wiecej ni¿ jeden parametr");
		}
	}

}
