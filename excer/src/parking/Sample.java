package parking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
 
public class Sample {
 
  public static void main(String[] args) {
 
    try {
 
////////////////// 파일 스트림을 이용한 파일에 내용을 기록하는 예제 입니다.
 
      // 기존의 파일이 없으면 만들어지고 있으면 덮어쓰게 되어 기존 파일내용이 지워진다.
      FileOutputStream fos = new FileOutputStream("c:/temp/java/test/test.txt");
      
      //기존 파일에 내용을 추가 할려면 두번째 인자로 true를 적어 준다. true를 추가해도 없으면 만든다.
      //FileOutputStream fos1 = new FileOutputStream("c:/temp/java/test/test.txt",true);
 
      // 파일에 저장할 내용
      String strText = " 파일에 저장될 문자열 입니다.\n Hellow world !!";
 
      // 문자열을 바이트배열로 변환해서 파일에 저장한다.
      fos.write(strText.getBytes());
 
      // 사용이 끝나면 파일 스트림을 닫습니다.
      fos.close();
 
////////////////////기록한 파일을 FileInputStream 을 이용해 출력하는 예제 입니다.
 
      // file open..
      FileInputStream fis = new FileInputStream("c:/temp/java/test/test.txt");
 
      // 파일의 내용을 byte단위로 읽어옵니다.그래서
      // 읽어서 저장할 버퍼 byte 배열 설정
      byte[] byteBuff = new byte[9999];
 
      // 파일을 읽고 읽은 크기를 nRLen 에 저장한다.
      int nRLen = fis.read(byteBuff);
 
      // 출력을 위해서 byte배열을 문자열로 변환
      String strBuff = new String(byteBuff, 0, nRLen);
 
      // 읽은 내용을 출력 합니다.
      System.out.printf("읽은 바이트수[%d] : \n읽은 내용 :  \n%s \n", nRLen, strBuff);
 
      // 사용이 끝나면 파일 스트림을 닫습니다.
      fis.close();
 
    } catch (Exception e) {
 
    }
 
  }
}
//결과는 :
 
//읽은 바이트수[46] : 
//읽은 내용 :  
// 파일에 저장될 문자열 입니다.
// Hellow world !! 