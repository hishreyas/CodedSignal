import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String text="";
		Scanner scanner=new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter String :");
	    text=scanner.nextLine();
		CodedSignal c=new CodedSignal(text);
		
		System.out.print("\n Enter Choice \n 1.Orignal Signal \n 2.Encoded Signal \n 3.Decoded Signal\n\n");
		
		do
		{
			switch(scanner.nextInt())
			{
				case 1:
					System.out.println("Original Signal :"+c.getOrignalSignal());
					count++;
					
				break;
				
				case 2:
					
				    System.out.println("Encoded Signal :"+c.encodeSignal());
				    count++;
					
				break;
				
				case 3:
					System.out.println("Decoded Signal :"+c.decodeSignal(c));
					count++;
					
				break;
		}
		}while(count!=2);
		
	}
}

