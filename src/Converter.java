public class Converter {
	public static void main(String[] args) throws Exception {

		int decimal = 123;
		System.out.println("Decimal number:\n\t" + decimal);

		String binary = decimalToBinary(decimal);
		System.out.println("Converted binary number:\n\t" + binary);
	}

	public static String decimalToBinary(int decimal) throws Exception {
		MyStack<Integer> stack = new MyStack<>();
		do {
			stack.push(decimal % 2);
			decimal = decimal / 2;
		} while (decimal > 0);

		String binary = "";
		while (!stack.isEmpty()) {
			binary += stack.pop();
		}
		return binary;
	}
}
