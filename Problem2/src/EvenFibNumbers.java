public class EvenFibNumbers {

	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int fourMil = 4000000;

		while (fibonacci(i) < fourMil) {
			if (fibonacci(i) % 2 == 0) {
				sum = sum + fibonacci(i);
			}
			i++;
		}

		System.out.println(sum);
	}
}
