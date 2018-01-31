package prototype;

/**
 * 猫对象、有名称、年龄、颜色等属性
 * @author wayne
 *
 */
public class Cat implements Cloneable {

	private String name;
	
	private String age;
	
	private String color;

	/**
	 * 猫的子对象-所在地区-用于模拟浅拷贝
	 */
	private Address address;

	/**
	 * 猫的子对象-所在地区-用于模拟深拷贝
	 */
	private Address2 address2;
	
	public Cat(String name, String age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
	@Override
	public Cat clone() throws CloneNotSupportedException {
		// 1、不对address对象处理，则是浅拷贝
		// 2、实现对address2对象的深拷贝
		Cat cat = (Cat)super.clone();
		if(null != address2){
			cat.address2 = new Address2(this.address2.getCountry(), this.address2.getArea());
		}
		return cat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address2 getAddress2() {
		return address2;
	}

	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}
	
}
