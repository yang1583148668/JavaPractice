package day11;

import java.math.BigDecimal;

public class Triangle {
	private double base;
	private double height;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(double base,double height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double countArea() {
		BigDecimal base1 = new BigDecimal(Double.toString(base));
		BigDecimal height1 = new BigDecimal(Double.toString(height));
		double area = base1.multiply(height1).divide(new BigDecimal(2)).doubleValue();

		return area;
	}

}
