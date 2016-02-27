
public class Dragon extends Movable
{	
	public Dragon(int[] p){
		super(p);
	}
	public void setState(){
		state=false;
	}
	public boolean getState(){
		return state;
	}
}
