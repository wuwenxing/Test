package prototype;

public class Test {

	/**
	 * @desc 未使用模式
	 * @desc 构造多个猫，必须使用new构造，依次设置属性值
	 */
	@org.junit.Test
	public void test1() {
		System.out.println("未使用模式...");
		Cat cat1 = new Cat("黑猫警长", "10", "黑色");
		// System类中out是默认调用toString方法
		System.out.println(cat1);

		Cat cat2 = new Cat("黑猫警长", "8", "白色");
		System.out.println(cat2);

		Cat cat3 = new Cat("猫队员", "10", "白色");
		System.out.println(cat3);

		Cat cat4 = new Cat("猫队员", "8", "黑色");
		System.out.println(cat4);
	}

	/**
	 * @desc 使用原型模式-clone方法复制
	 * @desc 当类属性非常多，而且需要构造多个对象且只有部分不同的属性，不可能每个都去set属性、这时考虑使用原型模式、进行复制
	 * @desc jdk的提供了一个接口，可实现cloneable接口的clone方法，进行复制
	 * @desc 构造多个猫，使用new构造
	 */
	@org.junit.Test
	public void test2() throws Exception {
		System.out.println("使用原型模式-clone方法复制...");

		Cat cat1 = new Cat("黑猫警长", "10", "黑色");
		System.out.println(cat1);

		Cat cat2 = cat1.clone();
		System.out.println("为false则不为同一个对象，则说明是重新构造了一个对象：" + (cat1 == cat2));
		cat2.setAge("8");
		cat2.setColor("白色");
		System.out.println(cat2);

		Cat cat3 = cat1.clone();
		cat3.setName("猫队员");
		cat3.setColor("白色");
		System.out.println(cat3);

		Cat cat4 = cat1.clone();
		cat4.setName("猫队员");
		cat4.setAge("10");
		System.out.println(cat4);
	}

	/**
	 * @desc 使用原型模式-浅拷贝
	 * @desc 浅拷贝指，调用clone方法时，对象的子对象属性不会一同复制，子对象是共用一个对象，改变了子对象的值，所有都会跟着变化，这不是想要的结果
	 */
	@org.junit.Test
	public void test3() throws Exception {
		System.out.println("浅拷贝指，调用clone方法时，对象的子对象属性不会一同复制，子对象是共用一个对象，改变了子对象的值，所有都会跟着变化，这不是想要的结果");

		Cat cat1 = new Cat("黑猫警长", "10", "黑色");
		Address address = new Address("美国", "华盛顿");
		cat1.setAddress(address);
		System.out.println(cat1 + ";1==address=" + cat1.getAddress());

		Cat cat2 = cat1.clone();
		System.out.println(cat1 + ";2==address=" + cat1.getAddress());
		System.out.println(cat2 + ";2==address=" + cat2.getAddress());
		cat2.getAddress().setCountry("中国");
		cat2.getAddress().setArea("北京");
		System.out.println(cat1 + ";3==address=" + cat1.getAddress());
		System.out.println(cat2 + ";3==address=" + cat2.getAddress());

	}

	/**
	 * @desc 使用原型模式-深拷贝
	 * @desc 深拷贝指，调用clone方法时，对象的子对象属性也会一同复制，改变了子对象的值，不影响其他的对象
	 */
	@org.junit.Test
	public void test4() throws Exception {
		System.out.println("深拷贝指，调用clone方法时，对象的子对象属性也会一同复制，改变了子对象的值，不影响其他的对象");

		Cat cat1 = new Cat("黑猫警长", "10", "黑色");
		Address2 address = new Address2("美国", "华盛顿");
		cat1.setAddress2(address);
		System.out.println(cat1 + ";1==address=" + cat1.getAddress2());

		Cat cat2 = cat1.clone();
		System.out.println(cat1 + ";2==address=" + cat1.getAddress2());
		System.out.println(cat2 + ";2==address=" + cat2.getAddress2());
		cat2.getAddress2().setCountry("中国");
		cat2.getAddress2().setArea("北京");
		System.out.println(cat1 + ";3==address=" + cat1.getAddress2());
		System.out.println(cat2 + ";3==address=" + cat2.getAddress2());
	}

	public static void main(String[] args) {
		
	}
}
