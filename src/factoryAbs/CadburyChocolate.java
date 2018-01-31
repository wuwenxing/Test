package factoryAbs;

public class CadburyChocolate extends Chocolate{

	@Override
	public void getName() {
		System.out.println("名称：吉百利传统风味巧克力");
	}

	@Override
	public void getTradeMark() {
		System.out.println("商标：吉百利");
	}
	
}
