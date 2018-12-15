

public class RunnerPerson {
public static void main(String[] args) {
	Person p1 = new Person();
	Person p2 = new Person();
	Person p3 = new Person();
	p1.setSuperpower("invisibility");
	p1.setName("Sarah");
	p2.setSuperpower("telepathy");
	p2.setName("Mary");
	p3.setSuperpower("teleportation");
	p3.setName("Sophie");
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
}
}
