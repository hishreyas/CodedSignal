public class CodedSignal
{
	private String original;
	private Code coder;
	private String encoded="";
	private String decoded="";
	public CodedSignal(String code)
	{
		this.original=code;
		coder=new Code();
	}
	
	public String encodeSignal()
	{
	    Character c;
		if(encoded!=""){
			return decoded;
		}
		for(int i=0;i<original.length();i++)
		{
			c=original.charAt(i);
			encoded +=coder.getEqive(c);
		}
	
		return encoded;
	}
	
	public String decodeSignal(CodedSignal signal)
	{
		Character coded,orgcode;
	
		if(decoded!=""){
			return decoded;
		}
		
		for(int i=0;i<signal.getSignalSize();i++)
		{
			coded=signal.getEncodedSignal().charAt(i);
			orgcode=signal.getOrignalSignal().charAt(i);
			
			decoded+=coder.getDeEquive(coded,orgcode);
		}
		return decoded;
	}
	
	public String getOrignalSignal()
	{
		return original;
	}
	
	public String getEncodedSignal()
	{
		return encoded;
	}
	
	public  int getSignalSize()
	{
		return original.length();
	}
	public String getDecodedSignal(){
		return decoded;
	}
	public void  hi()
	{
		
	}
	
	
}
