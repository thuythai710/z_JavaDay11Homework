package homework;

public class DoubleTotal {

	public static void main(String[] args) {

		int myTotal = sumDouble(2, 2);
		System.out.println(myTotal);

		int myTotal1 = sumDouble(3, 2);
		System.out.println(myTotal1);
	}

	public static int sumDouble(int valueOne, int valueTwo) {

		int result = 0;

		if (valueOne == valueTwo) {
			result = valueOne * 2 + valueTwo * 2;
		} else {
			result = valueOne + valueTwo;
		}

		return result;
	}

}
