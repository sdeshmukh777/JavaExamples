package SwapNumber;
import java.lang.*;
public class SwapNumber1 {
	
	//Swap two number without using third variable

	public static void main(String[] args) {
		
		int a=10,b=20;
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		System.out.println("Before swap a is ="+a+"and b is =" + b  );
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		
		b= a+b-(a=b);
		System.out.println("After swap a is ="+a+"and b is =" + b  );
		

	}

}
