
public class vararguments {

	public static void main(String ... args) {
		// TODO Auto-generated method stub
    
		vararg va=new vararg();
		va.show(1,2,3,4);
	}

}

class vararg{
	
	public void show(int ...i)
	{
		for (int j : i) {
			System.out.println(j);
		}
		
	}
}