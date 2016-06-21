/**
 * 
 */

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 * 
 *
 * 2016年6月21日
 */
public class Test {
	public static void main(String[] args) {
		Person person = new Person(18,"zhangsan","---");
		System.out.println(person);
		OtherPerson otherPerson = new OtherPerson();
		System.out.println(otherPerson);
		BeanCopyUtil.copy(person, otherPerson);
		System.out.println(otherPerson);
	}
}


class Person {
	
	
	/**
	 * @param age
	 * @param name
	 * @param other
	 */
	public Person(int age, String name, String other) {
		super();
		this.age = age;
		this.name = name;
		this.other = other;
	}
	private int age;
	private String name;
	private String other;
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the other
	 */
	public String getOther() {
		return other;
	}
	/**
	 * @param other the other to set
	 */
	public void setOther(String other) {
		this.other = other;
	}
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", other=" + other + "]";
	}
	
	
}

class OtherPerson {
	private int age;
	private String name;
	
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
}

