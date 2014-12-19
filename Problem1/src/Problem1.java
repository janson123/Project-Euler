public class Problem1 {

	public void findSum(int maxValue) {
		int sum = 0;
		for (int i = 0; i < maxValue; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of all the multiples of 3 or 5 below "
				+ maxValue + " is " + sum);
	}

	public static void main(String[] args) {
		Problem1 idk = new Problem1();
		idk.findSum(1000);

	}

}
