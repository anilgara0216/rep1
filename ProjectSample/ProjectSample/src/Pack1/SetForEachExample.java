package Pack1;

import java.util.LinkedList;

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name= name;
		this.age= age;
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

public class SetForEachExample {
	public static void main(String[] args) {
		LinkedList<Person> set = new LinkedList<>();
		set.add(new Person("Anil", 24));
		set.add(new Person("Madhuri", 25));
		set.add(new Person("Gowri", 45));
		set.add(new Person("Polisu", 55));
		
		for(Person p : set) {
			System.out.print("name: " + p.getName() + " ");
			System.out.println("age: " + p.getAge());
		}
		
		set.forEach((person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
	}

}
