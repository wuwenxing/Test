package bridge;

/**
 * 正方形
 * @author wayne
 *
 */
public class Square extends Shape {

	public Square(Color color){
		super.setColor(color);
	}

	@Override
	public void draw() {
		super.getColor().bepaint();
		System.out.println("正方形");
	}
}
