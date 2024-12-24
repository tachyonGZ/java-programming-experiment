public class exp3_12{
	public static void main(String args[]){
		MyPoint pa = new MyPoint();
		MyPoint pb = new MyPoint(3.0, 4.0);
		System.out.println(pa.distance(pb));
		System.out.println(pb.distance(pa.x, pa.y));
	}
}

public class MyPoint{
	public double x;
	public double y;
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void setX(double x){
		this.x = x;
	}
	public double getX(){
		return this.x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getY(){
		return this.y;
	}
	public double distance(MyPoint p){
		return Math.sqrt(
			Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2)
		);
	}
	public double distance(double x, double y){
		return Math.sqrt(
			Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)
		);
	}
}