package StringPractice11;

public class ImmutableMethod
{

	public static void main(String[] args)
{
		 //Length method
        String str="pooja";
        str.length();
        System.out.println(+str.length()); 
        
        //reverse method
		StringBuffer s1=new StringBuffer("Pooja");
		s1.reverse();
        System.out.println(s1); 
        
        //insert method
        StringBuffer s2=new StringBuffer("Pooja");
        s2.insert(5, "miss");
        System.out.println(s2); 
        
        //append method
        StringBuffer sb=new StringBuffer("Buffer");
        sb.append("String");
        System.out.println(sb);
}

}
