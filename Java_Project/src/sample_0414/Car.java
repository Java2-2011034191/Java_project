package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;

	// public�� ���Ͽ� private�� �����Ѵ�!!!!!!!!!!!!!!!!!!!!! <-���� �߿�!!!
	public void setMan(int man) {
		this.man = man;
	} // man���� �޾��ִ� �� -> this.man�� field�� man. ���� man�� ��ü�� ���Ե� man(��������) -> ��
		// ������ ������ �ٸ���

	public int getMan() {
		System.out.println(man);
		return man;
	} // man���� �����ִ� ��. ��¹��� ���ų־����.

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getTire() {
		System.out.println(tire);
		return tire;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		System.out.println(color);
		return color;
	}

	/*
	 * public all_setting(int tire, String color) { this.tire = tire; this.color
	 * = color; }
	 */

	public void xx(int man, int tire, String color) {
		this.man = man;
		this.tire = tire;
		this.color = color;
	}

	void pr() {
		System.out.println("man :" + man + " /  tire : " + tire + " /  color : " + color);
	}
}
