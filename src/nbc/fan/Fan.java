package nbc.fan;

public class Fan {
	private int speed;
	
	public Fan(int speed) {
		super();
		this.speed = speed;
	}

	public void increaseSpeed() {
		speed=speed>1?0:speed+1;
	}
	public void reverse() {
		speed=-1*speed;
	}
	public int getSpeed() {
		return speed;
	}
	
}
