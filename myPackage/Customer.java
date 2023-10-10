package myPackage;

public class Customer {
  private int id;
  String name;
  protected String address;
  public String contact;

  protected void print(){
    System.out.printf("Id=%s,Name =%s,Address=%s,Conact=%s",id,name,address,contact);
  }

}