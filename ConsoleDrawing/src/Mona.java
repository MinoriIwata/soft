
public class Mona extends AsciiArt{

	private String line;
	public Mona()
	{
		
	}
	public Mona(String line)
	{
		this.setLine(line);
	}
	@Override
	public void draw() {
		System.out.println("　∧＿∧　   ／￣￣￣￣￣");
		System.out.println("（ ´∀｀）＜　"+getLine());
		System.out.println("（　　 　）  ＼＿＿＿＿＿");
		System.out.println(" ｜ ｜　||");
		System.out.println("（_＿）＿）");
		System.out.println("===============================");
		
	}
	@Override
	public String toString() {
		return "セリフ「" + line + "」";
	}

	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	

}
