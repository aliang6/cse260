public class Person {
	public enum Sex {
		MALE, FEMALE
	}
	String name;
	int age;
	Sex gender;
	String emailAddress;

	public Person(String name, int age, int gender, String emailAddress){
		this.name = name;
		this.age = age;
		this.gender = Sex.values()[gender];
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Sex getGender() {
		return gender;
	}
}