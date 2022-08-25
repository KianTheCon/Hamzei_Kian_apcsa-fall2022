//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   char b[] = a.toLowerCase().toCharArray();
	   if(b[0] == 'a' || b[0] == 'e' || b[0] == 'i' || b[0] == 'o' || b[0] == 'u' || b[a.length() - 1] == 'a' || b[a.length() - 1] == 'e' || b[a.length() - 1] == 'i' || b[a.length() - 1] == 'u') {
		   return "yes";
	   }
		return "no";
	}
}