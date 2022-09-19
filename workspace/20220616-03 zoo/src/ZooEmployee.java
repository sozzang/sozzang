//동물원종사자클래스(부모클래스)

public class ZooEmployee {
	private String role;
	private String name;
	private String animals;

	public ZooEmployee(String role, String name) {
		super();
		this.role = role;
		this.name = name;

	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimals() {
		return animals;
	}

	public void setAnimals(String animals) {
		this.animals = animals;
	}

}

//사육사클래스(자식)
class Zookeeper extends ZooEmployee {
	private String animalKeeper;

	public Zookeeper(String role, String name, String animalKeeper) {
		super(role, name);
		this.animalKeeper = animalKeeper;
	}

}

//경영자클래스(자식)
class Manager extends ZooEmployee {
	private String manager;

	public Manager(String role, String name) {
		super(role, name);
		this.manager = manager;
	}

}