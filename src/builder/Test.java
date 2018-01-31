package builder;

import builder.dto.ActiveDTO;
import builder.model.Active;
import builder.model.ActiveRW;

public class Test {

	/**
	 * @desc 建造者模式
	 * @desc 1、建造接口：
	 * @desc 定义建造的步骤，即建造接口方法；
	 * @desc 定义一个建造的总方法，里面的建造过程由具体实现该接口的类，去组装;
	 * @desc 2、实现建造接口：
	 * @desc 聚合方式，定义要建造的对象；并提供一个构造方法，参数为这个对象，由外部使用者创建传入;
	 * @desc 按自己的需要实现建造接口的方法，在总方法里面去实现组装，自由组合，体现了高可扩展性；
	 * @desc 3、Test：
	 */
	@org.junit.Test
	public void test1() {
		System.out.println("建造者模式...");
		System.out.println("只需修改具体的实现类,其他代码不需要改变");
		
		Active active = new ActiveRW();
		ActiveBuilder builder = new ActiveRWConstructBuilder(active);
//		Active active = new ActiveWPDH();
//		ActiveBuilder builder = new ActiveWPDHConstructBuilder(active);
		
		ActiveDTO activeDTO = new ActiveDTO();
		activeDTO.setCode("code20180212");
		activeDTO.setName("圣诞抽奖");
		builder.buliderActive(activeDTO);
		System.out.println(active.getType());
	}
	
	public static void main(String[] args) {
		
	}
}
