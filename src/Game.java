import java.io.IOException;

public class Game {
	
	private static Hero hero = new Hero(new int[]{1,1});
	private static Dragon dragon = new Dragon(new int[]{3,1});
	private static Sword sword = new Sword(new int[]{8,1});
	private static Exit exit = new Exit(new int[]{5,9});
	
	private static boolean[][] maze =
		{{true,true,true,true,true,true,true,true,true,true},
		{true,false,false,false,false,false,false,false,false,true},
		{true,false,true,true,false,true,false,true,false,true},
		{true,false,true,true,false,true,false,true,false,true},
		{true,false,true,true,false,true,false,true,false,true},
		{true,false,false,false,false,false,false,true,false,false},
		{true,false,true,true,false,true,false,true,false,true},
		{true,false,true,true,false,true,false,true,false,true},
		{true,false,true,true,false,false,false,false,false,true},
		{true,true,true,true,true,true,true,true,true,true}};
	
	public static void main(String[] args) {
		int dir;

		while(true){
			displayMaze();
			do{
				dir = getInput();
				
				}while(dir == -1);
			moveHero(dir);
		}
	}
	
	public static void displayMaze(){
		
		int[] heroPos = hero.getPosition();		
		int[] dragonPos = dragon.getPosition();		
		int[] swordPos = sword.getPosition();		
		int[] exitPos = exit.getPosition();

		for(int i = 0; i < maze.length; i++){
			for(int j = 0; j < maze[i].length; j++){
				if (heroPos[0] == i && heroPos[1] == j)
					System.out.print('H');
				else if (dragonPos[0] == i && dragonPos[1] == j)
					System.out.print('D');
				else if (swordPos[0] == i && swordPos[1] == j)
					System.out.print('E');
				else if (exitPos[0] == i && exitPos[1] == j)
					System.out.print('S');
				else if (maze[i][j])
					System.out.print('X');
				else System.out.print(' ');
			}
			System.out.println();
		}		
	}
	
	public static boolean moveHero(int dir){
		int[] pos = hero.getPosition().clone();
		switch(dir){
		//UP
		case 0:
			pos[0]--;
			break;
		//DOWN
		case 1:
			pos[0]++;
			break;
		//LEFT
		case 2:
			pos[1]--;
			break;
		//RIGHT
		case 3:
			pos[1]++;
			break;		
		}	
		if (maze[pos[0]][pos[1]])
			return false;
		hero.setPosition(pos);
		return true;
	}
	
	public static int getInput(){
	    int inChar;
	    System.out.println("Enter a Character:");
	    try {
	    	inChar = System.in.read();
	    	System.in.skip(1000);
	    	switch(inChar){
	    	//a
	    	case 97:
	    		return 2;
	    		//A
	    	case 65:
	    		return 2;
	    		//W
	    	case 119:
	    		return 0;
	    		//w
	    	case 87:
	    		return 0;
	    		//S
	    	case 115:
	    		return 1;
	    		//s
	    	case 83:
	    		return 1;
	    		//D
	    	case 100:
	    		return 3;
	    		//d
	    	case 68:
	    		return 3;
	    	default:
	    		return -1;
	    	}
	    }
	    catch (IOException e){
	      System.out.println("Error reading from user");
	    }    
		return -1;
	}	
	
}
