package collections;

public class CnvtStrToChr {

	public static void main(String[] args) {
		
		String str ="MEGHA";
		System.out.println(str);
		System.out.println();
		
		char[] c=str.toCharArray();//String to char
		
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i]);
		}

	}

}
