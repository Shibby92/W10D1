import java.io.*;
import java.nio.CharBuffer;

public class Streaming {

	public static void main(String[] args) {
		InputStream dis = new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(read);
		BufferedInputStream bis= new BufferedInputStream(dis);
		byte[] buffer = new byte[4];
		CharBuffer javaCharBuffer= CharBuffer.allocate(4);
		int numBytesRead;
		try {
//			dis.mark(4);
//			while ((numBytesRead = dis.read(buffer)) >= 0) {
//				System.out.println("procitali: " + numBytesRead + " bytea\n"
//						+ new String(buffer));
//				for(byte meh: buffer){
//					meh=0;
//				}
//				dis.reset();
//			while(read.read(javaCharBuffer)>=0){
//				
//			}
			String line="";
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
			System.out.println("END");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
