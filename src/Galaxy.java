
public class Galaxy {

	public static void main(String[] args) {
		
		
		ItemElement[] items= new ItemElement[]{new Asteroid(1900,type.c),
							new Asteroid(5000,type.m),
							new Asteroid(3000,type.s),
							new Asteroid(2700,type.c),
							new Asteroid(3400,type.c),
							new Asteroid(2100,type.m),
							new Asteroid(1150,type.c)};
		
		int totalmass=calculateTotalMass(items);
		System.out.println("Total mass is:"+totalmass);
		
		
		
		
		
		
		

	}

	private static int calculateTotalMass(ItemElement[] items) {
		GalaxyVisitor visitor=new GalaxyVisitorImpl();
		int total=0;
		for(ItemElement item: items)
			total=total+item.accept(visitor);
		return total;
			
	}

}
