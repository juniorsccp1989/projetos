
public class Test {
	
	Test(int x, int y) {
		System.out.println("x = " + x + " y = " + y);
	}

	Test(int x, float y) {
		System.out.println("x = " + x + " y = " + y);
	}

	public static void main(String args[]) {
		byte x = 30;
		byte y = 65;
		Test test = new Test(x, y);
	}
}

