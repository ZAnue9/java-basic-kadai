package text.kadai_015;

public class Car_Chapter15 {

	private int gear = 0;
	private int speed = 0;

	public Car_Chapter15(int gear, int speed) {

		this.gear = gear;
		this.speed = speed;

		System.out.println("現在のギア: " + this.gear + "速");
		System.out.println("現在の速度: " + this.speed + "m/h");
	}

	public void gearChange(int afterGear) {
		if (1 == afterGear) {
			this.gear = 1;
			this.speed = 10;
		} else if (2 == afterGear) {
			this.gear = 2;
			this.speed = 20;
		} else if (3 == afterGear) {
			this.gear = 3;
			this.speed = 30;
		} else if (4 == afterGear) {
			this.gear = 4;
			this.speed = 40;
		} else if (5 == afterGear) {
			this.gear = 5;
			this.speed = 50;
		} else {
			this.speed = 10;
		}
	}
	public void run() {
		System.out.println("ギア1から" + this.gear + "に切り替えました");
		System.out.println("速度は時速 " + this.speed + " kmです。");
	}
	
}
