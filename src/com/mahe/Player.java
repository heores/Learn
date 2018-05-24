package com.mahe;
import java.util.Scanner;
public class Player {
 
     
    String name;//姓名
    private int score;//积分.
    public String getName() {
    	//Scanner input = new Scanner(System.in);
		//System.out.print("请输入您的名字： ");
		//name = input.next();
        return name;
    }
     
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getName()+":"+this.getScore();
    }
     
     
     
}