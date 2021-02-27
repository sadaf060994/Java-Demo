
public class StringDemo {

	public static void main(String[] args) {
		
		//Reverse a String
		
	//	String t= "";
//		char[] a=input.toCharArray();
		
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			t = t + s.charAt(i);
//		}
//		System.out.println(t);
//		
//		if(s.equalsIgnoreCase(t))
//		{
//			System.out.println(s+ " is palindrome string");
//		}
		String s= "Life is Awesome";
		String[] words = s.split(" ");
		String reversedString = "";
		for(int i=0; i < words.length;i++)
		{
			String word = words[i];
			String reveredWord = "";
			for(int j= word.length()-1; j>=0; j--)
			{
				reveredWord = reveredWord + word.charAt(j);
			}
			
			reversedString = reversedString +  reveredWord + " ";
		}
		
		System.out.println(reversedString);
	}

}
