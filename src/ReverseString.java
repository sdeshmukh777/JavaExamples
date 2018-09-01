
public class ReverseString {

	public static void main(String[] args) {
		// Reverse string
		String s = "Swapnil";
		
		// Reverse String with for loop
		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Revrese String :" + rev);
		
		//reverse string with inbuild function
		StringBuffer st=new StringBuffer(s);
		System.out.println(st.reverse());

	}

}
