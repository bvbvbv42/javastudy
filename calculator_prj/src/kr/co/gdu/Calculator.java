package kr.co.gdu;

/**
 * 
 * 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 제공하는 계산기 클래스
 * 
 * @author 김태준
 * @since  2023.07.19
 * @version 1.0.0
 * 
 */
public class Calculator {         //클래스에 있는 메소드를 부를때 : 클래스를 변수로 바꾸는것을 객체(실제계산기)라고 한다. 그 객체를 이용해 메소드를 부름
                                   //현재 Calculator는 계산기의 설계도라고 할 수 있다.
    
    
    /**
     * 
     * 실수 2개를 전달 받아서 그 합을 반환하는 메소드
     * 
     * @param a 실수
     * @param b 실수
     * @return 파라미터 2개를 더한 결과
     * 
     */
  public double addition(double a, double b) {
    return a + b;
  }

    /**
     * 
     * 실수 2개를 전달 받아서 뺄셈을 반환하는 메소드
     * 
     * @param a
     * @param b
     * @return 파라미터 2개를 뺀 결과
     */
  
  public double subtraction(double a, double b) {
    return a - b;
  }
  
    /**
     * 
     * 실수 2개를 전달 받아서 곱셈을 반환하는 메소드
     * 
     * @param a
     * @param b
     * @return 파리미터 2개를 곱한 결과
     */
  public double multiplication(double a, double b) {
    return a * b;
  }
  
   /**
   * 
   * 실수 2개를 전달 받아서 나눗셈을 반환하는 메소드
   * 
   * @param a
   * @param b
   * @return 파라미터 2개를 나눈 결과
   */
  
  
  public double division(double a, double b) {
    return a / b;
  }
  
  
  
  
  
  
  
  
  
}
