
public class Positionable
{
	protected int[] pos = new int[2];
	
	public Positionable(int[] p){
		if (p.length == 2)
			pos = p;
	}
	
	public int[] getPosition(){
		return pos;
	}
}
