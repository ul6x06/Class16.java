package Java08;

class CSphere {
	private int x; // ��ߪ� x �y��
	private int y; // ��ߪ� y �y��
	private int z; // ��ߪ� z �y��
	private int radius; // ��y���b�|

	void setLocation(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	void setRadius(int r) {
		radius = r;
	}

	double surfaceArea() {
		return 4 * 3.14 * radius * radius * radius;
	}

	double volume() {
		return (0.75 * 3.14 * radius * radius * radius);
	}

	void showCenter() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}

public class Class16 {

	public static void main(String[] args) {
		CSphere cs = new CSphere();

		cs.setLocation(3, 4, 5);
		cs.setRadius(1);
		System.out.println("surface area=" + cs.surfaceArea());
		System.out.println("volume=" + cs.volume());
		cs.showCenter();
	}

}
