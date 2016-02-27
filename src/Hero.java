
public class Hero extends Movable
{
	protected boolean state;
	public Hero(int[] p){
		super(p);
		state=false;	
	}
	public void setState()
	{
		state =true;
	}
	public boolean getState(){
		return state;
	}
}
