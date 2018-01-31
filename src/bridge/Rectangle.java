package bridge;

/**
 * 长方形
 * @author wayne
 *
 */
public class Rectangle extends Shape {

	public Rectangle(Color color){
		super.setColor(color);
	}
	
	@Override
	public void draw() {
		super.getColor().bepaint();
		System.out.println("长方形");
	}

}
