package ex01_branch;

public class MainWrapper {

public static void ex01() {
  //점수에 따른 학점(if문)
  int score = 40;
  char grade;  // 'A', 'B', 'C', 'D', 'F'
  
  if(score>=90) {
    grade = 'A';
  } else if(score>=80) {
    grade = 'B';
  } else if(score>=70) {
  grade = 'C';
} else if(score>=60) {
  grade = 'D';
} else {
  grade = 'F';
}
  System.out.println(score + "점은" + grade + "입니다" );
   }


public static void ex02() {
//점수에 따른 학점(switch문)
int score = 80;
char grade;  // 'A', 'B', 'C', 'D', 'F'

switch(score/10) {
case 10: 
case 9:
  grade = 'A';
break;
case 8:
  grade = 'B';
break;
case 7:
  grade = 'C'; 
break;
case 6:
  grade = 'D';
break;
default:
  grade = 'F';
break;
}
  System.out.println(score + "점은" +  grade + "등급입니다");
}

public static void ex03() {
  //점수와 학년에 따른 학점
  //1~3학년 : 60점 이상 합격, 아니면 불합격
  //4~6학년 : 70점 이상 합격, 아니면 불합격
  int score = 50; // 점수
  int scYear = 1;  // 학년
  String pass;  // "합격", "불합격"
  
  if(scYear <= 3) {
    if(score >= 60) {
      pass = "합격";
    } else {
      pass = "불합격";
    }
  }
    else {
      if(score >= 70) {
        pass = "합격";
      } else {
        pass = "불합격";
      }
    }
    
  
 System.out.println(pass);

}
public static void ex03_2(){   //if 중첩이아니라 if 두개사용
  //점수와 학년에 따른 학점
  //1~3학년 : 60점 이상 합격, 아니면 불합격
  //4~6학년 : 70점 이상 합격, 아니면 불합격
  int score = 50; // 점수
  int scYear = 1;  // 학년
  String pass;  // "합격", "불합격"
  
  int passScore;  //합격의 최소점수
  if(scYear <= 3) {
    passScore = 60;
  } else {
    passScore = 70;
  }
  if(score >= passScore) {
    pass = "합격";
  }else {
    pass = "불합격";
  }
  System.out.println(pass);
  
  
}
public static void ex04() {
  //if문에서 if(order == "아메리카노"") <<문자열은 연산자로 비교가 되지않는다.
  //메뉴에 따른 가격
  //아메리카노 : 2000
  //카페라떼 : 2500
  //밀크티 : 3000
  //기타 : 5000
  String order = "아메리카노";
  int price;
  switch(order) {
  case "아메리카노": price = 2000; break;
  case "카페라떼": price = 2500; break;
  case "밀크티": price = 3000; break;
  default: price = 5000; break;
  }
  System.out.println("주문하신 " + order + "은(는)" + price + "원입니다." );
}
  public static void main(String[] args) {
    // TODO Auto-generated method stub
 //ex01();
 //ex02();\
   ex03();
   ex03_2();
   ex04();
  }

}
