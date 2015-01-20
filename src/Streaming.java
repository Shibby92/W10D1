import java.io.*;

public class Streaming {

	public static void main(String[] args) {
		Reader read = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(read);
		File f = new File("/Users/harisarifovic/Desktop/osoba");
		PrintWriter pw = new PrintWriter(System.out);
		Person test= new Person ("Haris","Arifovic",22);
		
		try (OutputStream os= new FileOutputStream (f);
				DataOutputStream dos= new DataOutputStream(os) ){
			dos.writeUTF(test.toString());
			String line = "";
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			pw.println((sb.toString()));
			pw.flush();
			pw.println(test);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}