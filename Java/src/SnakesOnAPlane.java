import java.util.ArrayList;
import java.util.Random;


/*
Snakes on a Plane.	maybe move into ArrayList exercises
	Create a Randomness class with two static methods;
	Write a method that randomly returns true or false.
	Write a method that randomly returns a number between 1 and 10.
	Create a Snake class with member variables int viciousness & boolean venomous.
	Also create a Snake constructor and getters for the member variables.
	Create a Plane class with member variable int numberOfPassengers and an ArrayList to hold the Snakes
	In the Plane class, create 100 snakes with random viscousness, that are randomly venomous.
Calculate the probability of death based on the following formula…
probability of death = (venomous snakes * viciousness) / number of passengers
Make a chart on the whiteboard to document the output of each student’s program.
*/

public class SnakesOnAPlane {
	public static void main(String[] args) {
		Plane p = new Plane();
		
		int percentageDead = 0;
		int venomousSnakes = 0;
		int venomousSnakeViciousness = 0;
		int viciousness = 0;
		int numberOfPassengers = p.numOfPassengers;
		
		for (int i = 0; i < p.snakes.size(); i++) {
			
			System.out.println(p.snakes.get(i).viciousness + ", " + p.snakes.get(i).venomous);
			if (p.snakes.get(i).venomous) {
				venomousSnakes++;
				venomousSnakeViciousness += p.snakes.get(i).viciousness;
			}
			else {
				viciousness += p.snakes.get(i).viciousness;
			}
		}
		venomousSnakes++;
		System.out.println("venomousSnakes " + venomousSnakes);
		System.out.println("viciousness " + viciousness);
		System.out.println("numberOfPassengers " + numberOfPassengers);
		percentageDead = (venomousSnakeViciousness + ((p.snakes.size()-venomousSnakes) * viciousness))/ numberOfPassengers;
		System.out.println("probability of death is " + percentageDead + "%");
	}
}
class Randomness{
	boolean trueFalse;
	Randomness(){
	}
	public boolean TF(){
		Random rand = new Random();
		int x = rand.nextInt(2);
		switch (x) {
		case 0:
			trueFalse = true;
			break;
			
		case 1:
			trueFalse = false;
			break;
			
		default:
			break;
		}
		return trueFalse;
	}
	public int oneToTen(){
		Random rand = new Random();
		return rand.nextInt(10)+1;
	}
	public int randomNum(){
		Random rand = new Random();
		return rand.nextInt(200)+1;
	}
}
class Snake{
	int viciousness;
	boolean venomous;
	Snake(){
	}
	Snake(int viciousness, boolean venomous){
		this.viciousness = viciousness;
		this.venomous = venomous;
	}
	public void setViciousness(int viciousness){
		this.viciousness = viciousness;
	}
	public void setVenomous(boolean venomous){
		this.venomous = venomous;
	}
	public int getViciousness(){
		return viciousness;
	}
	public boolean getVenomous(){
		return venomous;
	}
}
class Plane{
	int numOfPassengers;
	public ArrayList<Snake> snakes = new ArrayList<>();
	Plane() {
		Randomness rand = new Randomness();
		numOfPassengers = rand.randomNum() + 1;
		for (int i = 0; i < 100; i++) {
			Snake s = new Snake();
			s.setVenomous(rand.TF());
			s.setViciousness(rand.oneToTen());
			snakes.add(s);
		}
	}
}