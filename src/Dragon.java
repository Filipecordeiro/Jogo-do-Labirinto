
public class Dragon extends Movable
{	
protected boolean state;
	public Dragon(int[] p){
		super(p);
		state=true;
	}
	public void setState(){
		state=false;
	}
	public boolean getState(){
		return state;
	}
}
