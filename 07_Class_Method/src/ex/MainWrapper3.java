package ex;

import java.util.Arrays;

public class MainWrapper3 {

  public static void ex01(int[] a) {   // int[] a = 0x100000000
    
    System.out.println(Arrays.toString(a));
    a[0] = 100;
    System.out.println("ex01의 배열 a = " + Arrays.toString(a));
    
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int [] a = {10, 20, 30};
    ex01(a);            //배열전달        // ex01(0x100000000);
    System.out.println("main의 배열 a = " + Arrays.toString(a));
  }

}
