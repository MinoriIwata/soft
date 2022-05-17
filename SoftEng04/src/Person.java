public class Person {

	String name, birthday;
	double height, weight;

	static int numberOfPersons=0;

	public Person() {

	}

	public Person(String name, String birthday, double height, double weight) {

		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
		++numberOfPersons;
	}

	public void showPerson(Person a) {

		System.out.println(a.name + "さんの生年月日は" + a.birthday + ",身長は" + a.height + ",体重は" + a.weight + "です.");

	}

	public double getBMI(Person a) {
		double m=a.height/100;
		double bmi=a.weight/(m*m);
		
		return bmi;

	}

	public void showObesity(Person a) {
		
		double BMI=getBMI(a);
		double []criterion= {18.5,25,30,35,40,500};
		int t=0;
		String []rank= {"低体重（痩せ）","普通体重","肥満（1度）","肥満（2度）","肥満（３度）","肥満(4度)"};
		while(BMI>=criterion[t]) {
			++t;
		};
		System.out.println(a.name + "さんのBMI値は" +BMI + "," + rank[t] + "です.");

		

	}

	public static int getNumberOfPersons() {

		return numberOfPersons;

	}

}