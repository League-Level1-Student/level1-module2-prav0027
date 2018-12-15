
public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
	public void Person (String name, boolean isWoman, boolean isKnighted){
		this.name = name;
		this.isWoman=isWoman;
		this.isKnighted = isKnighted;
	}
public String welcome() {
	if(isWoman==false||isKnighted==true) {
		return "Sir "+name;
	}
	if(isWoman==false||isKnighted==false) {
		return "Mr. "+name;
	}
	if(isWoman==true||isKnighted==true) {
		return "Lady "+name;
	}
	if(isWoman==true||isKnighted==false) {
		return "Ms. "+name;
	}
	return " ";
}
}
