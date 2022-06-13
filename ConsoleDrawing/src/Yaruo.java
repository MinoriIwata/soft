
public class Yaruo extends AsciiArt{

	private String line;
	
	public Yaruo()
	{
		
	}
	public Yaruo(String line)
	{
		this.setLine(line);
	}
	@Override
	public void draw() {
		System.out.println("　　／⌒　　⌒＼");
		System.out.println("　／（ ●）（●）＼");
		System.out.println("／::⌒（__人__）⌒::＼　"+getLine());
		System.out.println("|　　　 |r┬-|　　 　|");
		System.out.println("＼  　   `ー'´ 　 ／　<");
		System.out.println("===============================");
		
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}

}
