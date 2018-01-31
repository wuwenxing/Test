package bridge;

/**
 * 形状抽象类，包含颜色属性，调用桥接口
 * @author wayne
 *
 */
public abstract class Shape {

	// 颜色
	private Color color;

	// 画图动作
	public abstract void draw();
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
