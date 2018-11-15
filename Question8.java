import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		int array2[] = new int[10];
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter array elements:");
		for (int index = 0; index < 10; index++) {
			array2[index] = scanner1.nextInt();
		}

		for (int index = 0; index < 10; index++) {

			for (int index1 = 0; index1 < 10 - index - 1; index1++) {

				if (array2[index1] > array2[index1 + 1]) {
					int temp = array2[index1];
					array2[index1] = array2[index1 + 1];
					array2[index1 + 1] = temp;

				}

			}
		}
		for (int index = 0; index < 10; index++) {
			System.out.println(array2[index]);
		}

	}

}
