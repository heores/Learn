package com.learn;

public class Point {
	private int xpoint;
	private int ypoint;
	private int zpoint;
	/*public Point(int xpoint, int ypoint, int zpoint) {
		super();
		this.xpoint = xpoint;
		this.ypoint = ypoint;
		this.zpoint = zpoint;
	}*/
	
	public Point(int x,int y,int z){
		xpoint = x;
		ypoint = y;
		zpoint = z;
	}
	
	public void setXpoint(int xpoint){
		this.xpoint = xpoint;
	}
	public int getXpoint(){
		return xpoint;
	}
	
	public void setYpoint(int ypoint){
		this.ypoint = ypoint;
	}
	public int getYpoint(){
		return ypoint;
	}
	
	public void setZpoint(int zpoint) {
		this.zpoint = zpoint;
	}
	public int getZpoint() {
		return zpoint;
	}

	public int square(Point b){
		return b.xpoint*b.xpoint+b.ypoint*b.ypoint+b.zpoint*b.zpoint;
		
	}
	public int square1(){
		return xpoint*xpoint+ypoint*ypoint+zpoint*zpoint;
		
	}
	
	public int getDistance(Point b){
		return (xpoint-b.xpoint)*(xpoint-b.xpoint)+(ypoint-b.ypoint)*(ypoint-b.ypoint)+
				(zpoint-b.zpoint)*(zpoint-b.zpoint);
		
	}
	public String toString() {
		return String.valueOf(xpoint+" " + ypoint+" " +zpoint);
	}
	public void display(){
		int x=xpoint*xpoint+ypoint*ypoint+zpoint*zpoint;
		System.out.println(x);
		//System.out.println(xpoint*xpoint+ypoint*ypoint+zpoint*zpoint);
	}
	public static void main(String []args){
		Point a0 = new Point(0, 0, 0);
		Point a1 = new Point(10, 10, 10);
		System.out.println(a1.square1());
		System.out.println(a0.getDistance(a1));
		System.out.println(a1.getDistance(a0));
		a1.setXpoint(12);
		a1.setYpoint(13);
		a1.setZpoint(15);
		System.out.println("a1对象的三个坐标值 "+a1.xpoint+" "+a1.ypoint+" "+a1.ypoint);
		//打印a1对象的三个坐标值
		System.out.println("square方法返回值 "+a1.square(a1));
		//打印方法返回值
		System.out.println("getDistance方法返回值  "+a1.getDistance(a0));
		//打印方法返回值
		a1.setYpoint(14);
		System.out.println("a1对象的新三个坐标值 "+a1.toString());//打印出来方法返回值
		a1.toString(); //不会打印出来
		a1.display(); //方法本身会打印
	}
}
