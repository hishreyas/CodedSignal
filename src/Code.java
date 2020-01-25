public class Code
{
	private int base;

	
	public enum Language{
		
		q,w,e,r,t,y,u,i,o,p,a,hix
		,six,f,g,h,j,k,l,z,x,c,v,b,n,m,_;

		private String getstr(Language l)
		{

			return l.toString();
		}
	}
	
	public Language getEqive(Character ch)
	{
		int getindex;
		
		if(ch.isUpperCase(ch))
		{
			base='A';
		}
		else if(ch.isLowerCase(ch))
		{
			base='a';
		}
		else
		{
			return Language._;
		}
		
		getindex=(int)ch-base;

			return Language.values()[getindex];
		
	}
	
	public char  getDeEquive(Character cc,Character oc)
	{
		int ci;
		
		if(oc.isUpperCase(oc))
		{
			base='A';
		}
		else if(oc.isLowerCase(oc))
		{
			base='a';
		}
		else{
			return ' ';
		}
		ci=getindexcode(cc)+base;
		
		
		return (char)ci;
	}
	
	public int getindexcode(Character ch)
	{
		int i=0;
		for(Language l:Language.values())
		{
			if(l.getstr(l).equals(ch.toString()))
			{
				
				break;
			}
			
			i++;
		}
		
		return i;
	}
	
}
