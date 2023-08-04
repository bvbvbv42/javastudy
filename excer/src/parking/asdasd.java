package parking;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class asdasd {

  public static void main(String[] args) {
    // 디렉터리 생성/삭제
    
    String sep = File.separator;
    
    // File 객체 선언
    File dir;
    
    // File 객체 생성
    dir = new File("C" + sep + "abc");    // C드라이브 아래에 있는 storage 디렉터리
    
    // C:\storage 디렉터리가 없으면 만들고, 있으면 지우기
    if(dir.exists()) {
    // dir.deleteOnExit();      // Java 실행이 끝나면 지운다.
      dir.delete();             // 지금 당장 지운다.
      System.out.println("C:\\storage 디렉터리 삭제 완료");
    } else {
      dir.mkdirs();             // 디렉터리 내부에 또 다른 디렉터리도 만들 수 있다.
      System.out.println("C:\\storage 디렉터리 생성 완료");
    }
    
    
}
}