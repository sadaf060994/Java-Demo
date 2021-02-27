//class
public class StaticVar 
{	
	String name;  //Instance Variables
	String address;  //Instance Variables
	static String city = "Bareilly"; //Class Variable
	int i=0;
	
	//Constructor
	public StaticVar(String name, String address) 
	{	
		this.name = name;
		this.address = address;
	}
	
	//method
	public void getAddress() 
	{
		System.out.println(address + " " + city+" " +i);
		i++;
		
	}
	
	public static void getCity() 
	{
		System.out.println(city);
		
	}

	//main method
	public static void main(String[] args) 
	{
		StaticVar a = new StaticVar("Sadaf", "R.N."); //objects
		StaticVar b = new StaticVar("Sana", "B.N.");
		a.getAddress();
		b.getAddress();
		StaticVar.getCity();
	}

}
