
public class GalaxyVisitorImpl implements GalaxyVisitor {

	@Override
	public int visit(Asteroid asteroid) {
		int mass=0;
		if(asteroid.getType()==type.c)
			mass=asteroid.getMass();
		return mass;
		
	}
	
	

}
