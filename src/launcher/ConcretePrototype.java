package launcher;

public class ConcretePrototype implements Prototype{
	
	public int a;
	public String b;
	
	
	public ConcretePrototype() {
		
	}
	
	public ConcretePrototype(ConcretePrototype p) {
		
		this.a=p.a;
		this.b=p.b;
		
	}
	
	
	
	public Prototype clone() {
		return new ConcretePrototype(this);
	}

	@Override
	public void setA(int a) {
		this.a=a;
		
	}
}
