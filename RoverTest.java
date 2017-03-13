package ssn.sort;

import java.util.Scanner;
/*
 * @author 
 */
public class RoverTest {
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  String str1 = null, instruction = null;
	  int x = 0, y = 0;
	  int coordinateX = 0, coordinateY = 0;
	  char dir = ' ';
	  String[] str;
	  
	  System.out.println("Test input:");
	  // set up the upright coordinates
	  /* */
	   do{
	  str1 = input.nextLine();
	  x = Integer.parseInt(str1.split(" ")[0]);
	  y = Integer.parseInt(str1.split(" ")[1]);
	  } while(x < 0 || y < 0);
	    
	  while (true) {
	  str = (input.nextLine()).split(" ");
	  try {
	  coordinateX = Integer.parseInt(str[0]);
	  coordinateY = Integer.parseInt(str[1]);
	  
	  dir = (str[str.length -1]).charAt(0);
	  
	  
	  if(coordinateX > x || coordinateY > y || 
			  !(dir != 'N' || dir != 'E' || dir != 'W' || dir != 'S'))
			 throw new Exception("invalid input");
	  
	  instruction = input.nextLine();
	  
	  for(int i = 0; i < instruction.length(); i++){
		  if(!(instruction.charAt(i) == 'L' || instruction.charAt(i) == 'R'
			  || instruction.charAt(i) == 'M'))
				throw new Exception("invalid direction");
	  }
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());
		  continue;
	  }
	  
	  
	  Rover rover = new Rover(coordinateX, coordinateY, dir);
	  //rover.moveForward();
	  rover.move(instruction);
	  System.out.println(rover);
	  }
	  
  }
}

class Rover{
	private int coordinateX;
	private int coordinateY;
	private char direction;
	//private String instruction;
	
	public Rover(){
		
	}
	
	public Rover(int x, int y, char dir){
		coordinateX = x;
		coordinateY = y;
		direction = dir;
		//instruction = ins;
	}
	
	public int getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}
	public int getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}
	public char getDirection() {
		return direction;
	}
	public void setDirection(char direction) {
		this.direction = direction;
	}
	
	
	public void move(String ins){
		for(int i=0; i<ins.length(); i++){
			if(ins.charAt(i) == 'L')
				turnLeft();
			else if(ins.charAt(i) == 'R')
				turnRight();
			else 
				goForward();
			
		}
	}
	
	public void turnLeft(){
		switch(this.direction){
		case 'N': 
			this.direction = 'W'; 
			break;
		case 'E': this.direction = 'N'; break;
		case 'S': this.direction = 'E'; break;
		case 'W': this.direction = 'S'; 
		}
	}
	
	public void turnRight(){
		switch(this.direction){
		case 'N': this.direction = 'E'; 
		        break;
		case 'E': this.direction = 'S'; 
				break;
		case 'S': this.direction = 'W'; 
				break;
		case 'W': 
			this.direction = 'N';
		}
	}
	
	public void goForward(){
		switch(this.direction){
		case'N': coordinateY += 1; 
		        break;
		case'E': coordinateX += 1; 
				break;
		case'S': coordinateY -= 1; 
				break;
		case 'W': 
			coordinateX -= 1;
	}
 }
	@Override 
	public String toString(){
		return coordinateX + " " + coordinateY + " " + Character.toString(direction);
	}
	
}

