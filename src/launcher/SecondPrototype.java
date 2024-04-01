package launcher;

public class SecondPrototype extends ConcretePrototype{

	public String c;
	public Prototype d;
	public SecondPrototype() {
		
	}
	
	public SecondPrototype(SecondPrototype sp) {
		super(sp);
		this.c=sp.c;
		this.d=sp.d.clone();
	}
	
	
	public Prototype clone() {
		return new SecondPrototype(this);
	}
	
	
}
