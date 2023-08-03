package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {

  private String name;
  private List<Car> cars = new ArrayList<Car>();
  private final int MAX = 5;
  private Scanner sc = new Scanner(System.in);
  int number =0;
  
  public ParkingLot(String name) {
    this.name = name;
  }
  
  public void addCar() {
    try {
    
    if(number < MAX)
    {
    System.out.println("현재 등록된 차량 : " + number+ "대");
    number++;
    System.out.println("차량번호 입력 >>> ");
    String car1 = sc.next();
    System.out.println("모델 입력 >>> ");
    String mod1 = sc.next();
    cars.add(new Car(car1, mod1));
    System.out.println("차량번호 " +  car1 + " 차량이 등록 되었습니다.");
    } 
    else {
      System.out.println("현재 등록된 차량 :" + number + "대");
      System.out.println("만차입니다. 더 이상 차량 등록이 불가능합니다.");
    
    }
    }catch(Exception e) {
      
    }
    
  }
  public void deleteCar() {
    try {
    
      
      
    System.out.println(("삭제할 차량번호 입력 >>> "));
    String car1 = sc.next();
    for(Car car : cars) {
      if(car1.equals(car.getCarNo())) {
        cars.remove(car);
        System.out.println(car + "삭제됐습니다.");
      }
    }
  }catch(Exception e) {
    
  }
  }
  public void searchCar() {
    
  }
  
  public void printAllCars() {
    try {
    int size = cars.size();
    for(int i = 0; i<=5; i++) {
      System.out.println((i+1) + "번째 차량 : Car" + cars.get(i));
    }
    }catch(Exception e) {
      
    }
  }
  
  public void manage() {
    while(true) {
      System.out.print("1.추가 2.삭제 3.조회 4.전체조회 0.종료 >>> ");
      String choice = sc.next();
      switch(choice) {
      case "1": addCar(); break;
      case "2": deleteCar(); break;
      case "3": searchCar(); break;
      case "4": printAllCars(); break;
      case "0": System.out.println("주차관리 프로그램을 종료합니다."); return;
      default: System.out.println("존재하지 않는 메뉴입니다.");
      }
    }
  }
  
}