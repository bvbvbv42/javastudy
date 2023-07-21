package ex06_Member;

public class MainWrapper {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
    
    Address address = new Address();
    // 정보 추가 (Setter 활용) 
    address.setPostcode("1234");
    address.setRoadAddr("경기도 광명시 ");
    address.setJibunAddr("광명동 158-900");
    address.setDetailAddr(" 광명사거리 공영주차장");
    
    Contact contact = new Contact();
    // 정보 추가 (Setter 활용)
    
    contact.sethomeTel("1234-5678"); 
    contact.setMobile("010-1234-5678"); 
    contact.setAddress(address);

    
    
    
    Member member = new Member();
    // 정보 추가 (Setter 활용)
    member.setName("김태준");
    member.setContact(contact);

    // Member member 객체 정보 확인 (Getter 활용)
    
    System.out.println("이름 " + member.getName());
    System.out.println("집전화 " + member.getContact().getHomeTel());
    System.out.println("모바일: " + member.getContact().getMobile());
    System.out.println("우편번호: " + member.getContact().getAddress().getPostCode());
    System.out.println("도로명: " + member.getContact().getAddress().getRoadAddr());
    System.out.println("지번: " + member.getContact().getAddress().getJibunAddr());
    System.out.println("상세주소 : " + member.getContact().getAddress().getDetailAddr());
  
  }

}
