package bridge;

/**
 * 三角形
 * @author wayne
 *
 */
public class Triangle extends Shape {
	
	public Triangle(Color color){
		super.setColor(color);
	}

	@Override
	public void draw() {
		super.getColor().bepaint();
		System.out.println("三角形");
	}
	
}
