package ai.jobiak.enumexample;

public enum Direction {

	EAST,WEST,NORTH,SOUTH;
     

public static void main(String[] args)
{
	Direction d= Direction.WEST;
	Direction obj=Direction.valueOf("SOUTH");
	
	for(Direction dir:Direction.values()) {
		
		System.out.println(dir);
	}
	System.out.println(d==obj);
	//System.out.println(d.equals(obj));
}
}