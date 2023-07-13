package ex;

public class MainWrapper {

  public static void main(String[] args) {
    
    
    // TODO Auto-generated method stub
    // 초 -> 분/초
    int second = 90;
    //int m = ??;  // 1
    //int s = ??;  // 30
    int hour = 60;
    int sec = 60;
     
    int m = second / hour;
    int s = second % sec;
    
    System.out.println(m); 
    System.out.println(s); 
    
    //선생님답
    int second1 = 90;
    int m1 = second / 60;  // 1
    int s1 = second % 60;  // 30
    System.out.println(second1 + "초는 " + m1 + "분" + s1 + "초입니다.");
    
    // x와 y값을 교환
    int x = 10;
    int y = 20;
    int temp;

    temp = x;
    x = y;
    y = temp;
    
    System.out.println(x + ", " + y);
    
    
    
    
    // 5% 이자받으면 통장잔액이 얼마?(소수 이하는 버림)
    long balance = 123456L;  // 통장잔액
    double pct = 0.05;  // 5%
    //balance = balance + balance * pct;
    //balance = balance * (1 + pct);
    balance *=(1 + pct);
    // 90점대 점수이면 true, 아니면 false
    System.out.println(balance);
    
    int score1 = 95;
    boolean result1 = (score1 >= 90) && (score1 < 100);  // true
    int score2 = 75;
    boolean result2 = (score2 / 10) == 9;  // false
    System.out.println(result1);
    System.out.println(result2);
    
    // n의 "짝수", "홀수" 여부 출력
    int n = 3;
    String res1 = (n % 2) == 0 ? "짝수" : "홀수";  // "홀수"
    System.out.println(res1);
    

    // num의 "짝수", "홀수", "3의배수" 여부 출력
    int num = 3;
    String res2 = (num % 3) == 0  ? "3의배수" : (num % 2) == 0 ? "짝수" :"홀수" ;  // "3의배수"
    System.out.println(num + "은(는)" + res2 + "입니다");
  }

}
