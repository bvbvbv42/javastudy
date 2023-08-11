package naver.api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverApiSearchBook {
  
  
  private static final String CLIENT_ID = "RTJMyHb54a63lvLzPh7A";
  private static final String CLIENT_SECRET = "0xR9yv0oo3";
  
  private void generateImage(String spec) {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
    try {
      
      String spec = "https://openapi.naver.com/v1/search/book.json";
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      bin = new BufferedInputStream(con.getInputStream());
      
      File dir = new File("C:/download");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, System.currentTimeMillis() + ".jpg");
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      byte[] b = new byte[1024];
      int readByte = 0;
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
        
      
      
      // 파라미터 String spec에는 다운로드 받을 이미지 파일의 URL이 전달된다.
      // 해당 URL의 이미지 파일을 다운로드 받는다.
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) bout.close();
        if(bin != null) bin.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public void getSearchList() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    
    try {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("책관련 검색어를 입력하세요: ");
      String value = sc.next();
      sc.close();
      
      String spec = "https://openapi.naver.com/v1/search/book.json";
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
   
      
      
      
      
      
      // 책 검색 OpenAPI를 사용해서 응답 결과 중 이미지(image) 결과만 추출하여
      // generateImage 메소드에 전달한다.
      // 10번의 generateImage 메소드 호출이 필요하다.
      
      
    } catch (Exception e) {
      
      // 예외 발생 시 로그파일을 만든다.
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a h:mm:ss");
      String time = dtf.format(now);
      
      String message = e.getMessage();
      
      String clazz = e.getClass().getName();
      
      File dir = new File("C:/download");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "log.txt");
      
    } finally {
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
        
        bw.write(time + " " + message + " " + clazz);
        bw.newLine();
        
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
        
        System.out.println(file.getPath() + " 파일에 예외 처리 완료");
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
}