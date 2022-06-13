
public class Main {

	public static void main (String[] args)
	{
		Drawable box=new Box(14,3);
		Drawable pikachu = new Pikachu("サトシのピカチュウ");

		System.out.println(pikachu);
		pikachu.draw();
		System.out.println();
		System.out.println(box);
		box.draw();
	}
}
