public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int towerOfHanoi(int num) {
		if (num < 3) {
			return -1;
		} else if (num == 3) {
			return 7;
		}

		return towerOfHanoi(num - 1) * 2 + 1;
	}
}
