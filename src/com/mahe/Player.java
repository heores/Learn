package com.mahe;
import java.util.Scanner;
public class Player {
 
     
    String name;//����
    private int score;//����.
    public String getName() {
    	//Scanner input = new Scanner(System.in);
		//System.out.print("�������������֣� ");
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