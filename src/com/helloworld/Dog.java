package com.helloworld;

public class Dog {
	String breed; // Ʒ�֧�
	int age; // ����
	String color; // ��ɫ
    String sleep;// �Ƿ�˯��
    String hungry;// �Ƿ񼢶�
    String baring;// �Ƿ�ͽ�
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
		//System.out.println("�Ҽ�С����Ʒ��Ϊ : " + breed );
		//System.out.println("�Ҽ�С������ɫΪ : " + color );
		
    }

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	//�Ǿ�̬����
	public int fig(int a, int b) {
		int c = a * b;
		return c;
	}
	//��̬����
	public static int tig(int a, int b) {
		int c = a * b;
		return c;
	}

	
	public static void main(String[] args) {
		Dog my1Dog = new Dog("̩��Ȯ","��ɫ");
		my1Dog.setAge(3);
		my1Dog.setSleep("˯��");
		my1Dog.setHungry("����");
		System.out.println("�Ҽ���С��С��������" + my1Dog.age + "��");
		System.out.println("Ʒ����:" + my1Dog.breed );
		System.out.println("��ɫ�� :" + my1Dog.color );
		System.out.println("������ :" + my1Dog.getSleep());
		System.out.println("������ :" + my1Dog.getHungry());
		System.out.println("\n" );
		
		Dog my2Dog = new Dog("����Ȯ","��ɫ");
		my2Dog.setAge(5);
		System.out.println("�Ҽ��еȵ�С��������" + my2Dog.age + "��");
		System.out.println("Ʒ����:" + my2Dog.breed );
		System.out.println("��ɫ�� :" + my2Dog.color );
		System.out.println("\n" );
		
		Dog my3Dog = new Dog("��ʿ��","��ɫ");
		System.out.println("�Ҽ�����С����������" +Dog.tig(2, 5) + "��");//��̬���������ֱ�ӵ��� 
		System.out.println("�Ҽ�����С����������" +my3Dog.tig(2, 5) + "��");//��̬����������ʵ��ֱ�ӵ��� 
		System.out.println("�Ҽ�����С����������" +tig(2, 5) + "��");//��̬��������ֱ�ӵ���
		//System.out.println("�Ҽ�����С����������" +fig(2, 5) + "��");//�Ǿ�̬����������ֱ�ӵ��û����
		System.out.println("�Ҽ�����С����������" +my3Dog.fig(2, 5) + "��");//�Ǿ�̬����ͨ��ʵ������
		System.out.println("Ʒ����:" + my3Dog.breed );
		System.out.println("��ɫ�� :" + my3Dog.color );
	}
	

}


