package com.helloworld;

public class Dog {
	String breed; // 品种
	int age; // 年龄
	String color; // 颜色
    String sleep;// 是否睡觉
    String hungry;// 是否饥饿
    String baring;// 是否吠叫
    String flag;
    
	public void setBaring(String baring) {
		this.baring=baring;
		
	}
	public String getBaring() {
		return baring;
		
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public void setHungry(String hungry) {
		this.hungry=hungry;
		
	}
	
	public String getHungry(){
		return hungry;
	}

	 public void setSleep(String sleep) {
		this.sleep=sleep;
	}
	 
	public String getSleep() {
		return sleep;
	}
	
	
	public Dog(String Breed,String Color){
		breed=Breed;
		color=Color;
		//System.out.println("我家小狗的品种为 : " + breed );
		//System.out.println("我家小狗的颜色为 : " + color );
		
    }

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	//非静态方法
	public int fig(int a, int b) {
		int c = a * b;
		return c;
	}
	//静态方法
	public static int tig(int a, int b) {
		int c = a * b;
		return c;
	}

	
	public static void main(String[] args) {
		Dog my1Dog = new Dog("泰迪犬","金色");
		my1Dog.setAge(3);
		my1Dog.setSleep("睡觉");
		my1Dog.setHungry("饥饿");
		System.out.println("我家最小的小狗年龄是" + my1Dog.age + "岁");
		System.out.println("品种是:" + my1Dog.breed );
		System.out.println("颜色是 :" + my1Dog.color );
		System.out.println("它正在 :" + my1Dog.getSleep());
		System.out.println("它现在 :" + my1Dog.getHungry());
		System.out.println("\n" );
		
		Dog my2Dog = new Dog("牧羊犬","黑色");
		my2Dog.setAge(5);
		System.out.println("我家中等的小狗年龄是" + my2Dog.age + "岁");
		System.out.println("品种是:" + my2Dog.breed );
		System.out.println("颜色是 :" + my2Dog.color );
		System.out.println("\n" );
		
		Dog my3Dog = new Dog("哈士奇","灰色");
		System.out.println("我家最大的小狗的年龄是" +Dog.tig(2, 5) + "岁");//静态方法类可以直接调用 
		System.out.println("我家最大的小狗的年龄是" +my3Dog.tig(2, 5) + "岁");//静态方法不建议实例直接调用 
		System.out.println("我家最大的小狗的年龄是" +tig(2, 5) + "岁");//静态方法可以直接调用
		//System.out.println("我家最大的小狗的年龄是" +fig(2, 5) + "岁");//非静态方法不可以直接调用会出错
		System.out.println("我家最大的小狗的年龄是" +my3Dog.fig(2, 5) + "岁");//非静态方法通过实例访问
		System.out.println("品种是:" + my3Dog.breed );
		System.out.println("颜色是 :" + my3Dog.color );
	}
	

}


