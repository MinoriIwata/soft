
public class Main {
	public static void main(String[] args) {
  RegularStudent a=new RegularStudent();
  InternationalStudent b=new InternationalStudent();
  WorkingStudent c=new WorkingStudent();
  RobotStudent d=new RobotStudent();
  
  
  a.setName("中村");
  a.setId("12345678X");
  a.setCredit(134);
  
  b.setName("Jackson");
  b.setId("18992311X");
  b.setCredit(84);
  b.setCountry("アメリカ");
  b.setKokuhi(false);
  
  c.setName("鈴木");
  c.setId("19435211X");
  c.setCredit(48);
  c.setCompany("神大商事");
  
  d.setName("ジョーチ");
  d.setId("2243313X");
  d.setCredit(188);
  d.setVendor("神戸重工");
  d.setAlgorithm("ニューラルネット");
  
  System.out.println("〇自己紹介をします");
  a.hello();
  b.hello();
  c.hello();
  d.hello();
  
  System.out.println("〇卒業要件を確認します");
  a.graduate();
  b.graduate();
  c.graduate();
  d.graduate();
  
  System.out.println("〇50単位足します");
  a.addCredit(50);
  b.addCredit(50);
  c.addCredit(50);
  d.addCredit(50);
  
  
  System.out.println("〇卒業要件を確認します");
  a.graduate();
  b.graduate();
  c.graduate();
  d.graduate();
  
  return ;
  
  
	}
 
}
