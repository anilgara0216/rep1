package Pack1;

import java.util.HashSet;

public class ForEachMethod {
	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("Anil", 24));
		hs.add(new Person("Madhuri", 25));
		hs.add(new Person("Gowri", 40));
		hs.add(new Person("Polisu", 45));
		hs.add(new Person("Satish", 28));
		hs.add(new Person("___", 20));
		
		for(Person p : hs) {
			System.out.print("Name: " +p.getName() +" ");
			System.out.println("Age: " + p.getAge());
			System.out.println();
		}
	}
}

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

