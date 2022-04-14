package Ch20;

public class NestedLoop {

	public static void main(String[] args) {
		int dan = 2;
		int count = 1;
		
		while(dan <= 9) {
			
			
			while (count <= 9) {
				System.out.println(dan + "x" + count + "=" + dan*count);
				count++;
			}
			
		}
		System.out.println();
	}

}
