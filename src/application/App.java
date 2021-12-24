package application;

public class App {

	public static void main(String[] args) {

		// var can be used for arrays
		// can't use it for nested arrays
		// unless you do it this way

		var texts = new String[][] {
				// String[][] texts = {
				{ "one", "two", "three" }, 
				{ "four", "five", "six" }, 
				{ "seven", "eight", "nine" } };

		// can use this to access elements without
		// having to loop through


		for (int i = 0; i < texts.length; i++) {

			String[] subArray = texts[i];

			for (int j = 0; j < subArray.length; j++) {
				System.out.printf("%s\t", subArray[j]);
			}
			System.out.println();
		}

		System.out.println(texts[1][1]);
		
		//Another way of iterating
		for (int k = 0; k < texts.length; k++) {

			for (int m = 0; m < texts[k].length; m++) {
				System.out.printf("%s\t", texts[k][m]);
			}
			System.out.println();
		}
	}

}
