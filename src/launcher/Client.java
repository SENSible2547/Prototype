package launcher;

public class Client {
	public static void main(String[] args) {
		
		ConcretePrototype p1=new ConcretePrototype();
		p1.a=12;
		p1.b="Perdí patrones";
				
		ConcretePrototype q=(ConcretePrototype) p1.clone();
		
		SecondPrototype s1=new SecondPrototype();
		s1.a=115;
		s1.b="Hola";
		s1.c="Mundo";
		s1.d=q.clone();
		
		
		SecondPrototype s2=new SecondPrototype(s1);
		
		SecondPrototype s3=(SecondPrototype) s1.clone();
		
		
		System.out.println("tú sabé mucho!");

	}
}
