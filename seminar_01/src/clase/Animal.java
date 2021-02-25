package clase;

public abstract class Animal {
	// clasa abstracta = clasa care nu poate fi instantiata
	// o putem folosi ca refference type
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
}
