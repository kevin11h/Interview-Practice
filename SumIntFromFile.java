import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumIntFromFile {
	public static void main(String[] args) {
		String fname = args[0];
		int result = 0;

	        BufferedReader br = null;
	        String line = "";

		try {
			br = new BufferedReader(new FileReader(fname));
			line = br.readLine();

			while (line != null) {
				int n = Integer.parseInt(line);
				result += n;
				line = br.readLine();
			}
                        
                        br.close();
		}
		catch (IOException ex) {
			System.out.println("Problem reading from file!");
		}

		System.out.println(result);
	}
}
