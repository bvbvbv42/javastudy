package ex06_Member;

public class Contact {

  private String homeTel;
  private String mobile;
  private Address address;
  
  
  public Contact() {
    
  }
  
  // Setter
  public void sethomeTel(String homeTel) {
    this.homeTel = homeTel;
  }
  
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  
  public void setAddress(Address abc) {
    this.address = abc;
  }
  
  // Getter
  public String getHomeTel() {
    return homeTel;
  }
  
  public String getMobile() {
    return mobile;
  }
  
  public Address getAddress() {
    return address;
  }
  
}
