package IO;

import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("test03.dat");
		
		/*
		 * 1) write(int)
		 * -> 파라미터 값이 유니코드라고 가정한다.
		 * 	  FileOutputStream과 다르게 4바이트 파라미터 값중에서 끝 2바이트를 출력한다.
		 * 	   단, 다음 공식에 따라 출력한다.
		 * 	  --> 유니코드를 OS 기본 문자집합으로 변환하여 출력한다.
		 * 	  ex) A => 0x0041(유니코드) => 0x41(출력값)
		 *    ex) 가 => 0xAC00(유니코드) => 0xEAB080(UTF-8), 0xB0A1(MS949)
		 *    
		 */					//	값                    Window OS(MS949)	  MacOs(UTF-8)
		out.write(100);		// 0x00000064 => 0x64				, 0x64
		out.write(256);		// 0x00000100 => 0x3f				, 0xC480
		out.write(100);		// 0x00000064 => 0x64				, 0x64
		out.write(180243);	// 0x0002c013 => 0x97D3				, 0xEC8093
		// Window, Mac의 값들은 100, 245 , 100, 180243 을 문자로 보고 나온 값들임
		
		out.close();
		System.out.println("저장하였습니다.");
	}

}
