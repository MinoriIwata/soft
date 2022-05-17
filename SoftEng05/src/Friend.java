public class Friend {

	 private String name;
	 private String phone;
	 private String email;
	
	public Friend()
	 {
		 
	 }
	 public Friend(String name,String phone,String email)
	 {
		 this.name=name;
		 this.phone=phone;
		 this.email=email;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 
	 public void setName(String n)
	 {
		 if(n.equals("")||n==null)
		 {
			 System.out.println("名前がありません。名無しで登録します");
			 this.name="noname";
		 }
		 else
		 {
			 this.name=n;
		 }
	 }
	 
	 public String getPhone()
	 {
		 return phone;
	 }
	 
	 public void setPhone(String p)
	 {
		 if(p.equals("")||p==null)
		 {
			 System.out.println("電話番号がありません。0で登録します");
			 this.phone="0";
		 }
		 else
		 {
			 this.phone=p;
		 }
	 }
	 
	 public String getEmail()
	 {
		 return email;
	 }
	 
	 public void setEmail(String e)
	 {
		 if(e.equals("")||e==null)
		 {
			 System.out.println("メールアドレスがありません。notfoundで登録します");
			 this.email="notfound";
		 }
		 else
		 {
			 this.email=e;
		 }
	 }
	 
     
	 public String toString()
	 {
		return "名 前:  " + name+"\n" + "電 話:  " + phone + "\n"+"メール:  " + email + "\n";
	}
}
