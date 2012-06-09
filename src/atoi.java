import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class atoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String inputString = reader.readLine();
			int inputNumber = 0;
			for (int iChar=0; iChar < inputString.length(); iChar++) {
				if (inputString.charAt(iChar) >= '0' && inputString.charAt(iChar) <= '9') {
					inputNumber = (inputNumber*10) + (inputString.charAt(iChar) - '0');
				}
			}
			System.out.println(inputNumber);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
