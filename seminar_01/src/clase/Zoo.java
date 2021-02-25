package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> lista;
	
	private Zookeeper keeper;

	public Zoo(List<Animal> lista, Zookeeper keeper) {
		super();
		this.lista = lista;
		this.keeper = keeper;
	}

	public Zoo() {
		super();
		this.lista = new ArrayList<Animal>();
		this.keeper = new Zookeeper(null);
	}
	
	
	
	public List<Animal> getLista() {
		return lista;
	}

	public void setLista(List<Animal> lista) {
		this.lista = lista;
	}

	public Zookeeper getKeeper() {
		return keeper;
	}

	public void setKeeper(Zookeeper keeper) {
		this.keeper = keeper;
	}

	public void add(Animal animal) {
		lista.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal animal : lista) {
			keeper.feed(animal);
		}
	}
}
