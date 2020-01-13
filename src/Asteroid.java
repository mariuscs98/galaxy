
public class Asteroid implements ItemElement{
	
	
	private int mass; //gigatone
	private type type;
	
	public Asteroid(int m, type t) {
		mass=m;
		type=t;
	}

	public int getMass() {
		return mass;
	}

	public type getType() {
		return type;
	}

	@Override
	public int accept(GalaxyVisitor visitor) {
		return visitor.visit(this);
	}
	
	

}
