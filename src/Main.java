import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] arrayOfInts = new int[100];

	for (int i = 0; i < arrayOfInts.length; i++) {
	    arrayOfInts[i] = (int)(Math.random() * 5 + 1);
    }

	Scanner input = new Scanner(System.in);

	System.out.println("Please enter an index of the array between 0 to 99");
	int userIndex = input.nextInt();

		try
		{
			System.out.println("Item at that index is: " + arrayOfInts[userIndex]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

    }
}
