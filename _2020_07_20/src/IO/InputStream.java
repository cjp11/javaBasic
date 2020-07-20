package IO;
/*
 * IOStream		-> 영상 데이터 처리도 가능(binary 형태이므로)
 * fileReader, fileWriter  -> 주로 '문서' 처리 용도
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("Exam11.dat");
		byte[] bytes = new byte[1024];		// 1024바이트 단위로 처리
		
		int i = 0;
		int b;
		while(true) {
			b = in.read();
			if(b==-1) {		// 더 읽을 데이터가 없다면 
				break;
			}
			bytes[i++] = (byte)b;
		}
		
		in.close();
		System.out.println("읽었습니다.");
		
		for(int x = 0 ; x < i; x++) {
			System.out.printf("%d ", bytes[x]);
		}
		System.out.println();
	}

}
