/*
 * 创建一个生日的类
 * 
 */
class BirthDate {
	private int day;
	private int month;
	private int year;

	public BirthDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "BrathDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public void display(){
		System.out.println(day+"-"+month+"-"+year);
	}
}


public class Ch1_3_9{
	public static void main(String []args){
		Ch1_3_9 test = new Ch1_3_9();
		int date = 9;
		BirthDate d1 = new BirthDate(7,7,1970);
		BirthDate d2 = new BirthDate(1,1,2000);
		d2.setMonth(2);
		test.change1(date);
		test.change2(d1);
		test.change3(d2);
		System.out.println("date="+date);
		d1.display();
		d2.display();
	}
	public void change1(int i){
		i=1234;
		System.out.println("i的值为"+i);
	}
	public void change2(BirthDate b){
		b = new BirthDate(22,2,2004);
		System.out.println("b的值为"+b);
	}
	public void change3(BirthDate b){
		b.setDay(22);
		System.out.println("b的值为"+b);
	}
}
