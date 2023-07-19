package ex02_return;

public class MainWrapper2 {
  // 메소드 = 기능 , 하고싶은 기능을 하나마다 메소드를 생성
  /*
   void 메소드의 return
   1. 반환값이 없는 메소드는 void 키워드를 사용한다.
   2. 이런 경우 return; 키워드를 이용해서 메소드 실행을 종료할 수 있다.
   3. return 키워드만 작성해야 한다.
   4. void 메소드에서만 사용할 수 있다.
   */

  public static void main(String[] args) {
    positivePrint(10);
    positivePrint(-10);
    
  }
  
  // 전달된 인수가 양수면 출력하고 아니면 출력하지 않는 positiviPrint 메소드
  public static void positivePrint(int a) {
    if(a <= 0 ) {
      return;                           //리턴뒤에 값이 없으면 종료하는 함수다.
    }
    System.out.println(a);
  }
}
