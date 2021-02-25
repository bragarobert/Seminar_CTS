package seminar01;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		Zoo zoo = new Zoo();
		Zookeeper keeper = new Zookeeper("Robert");
		zoo.setKeeper(keeper);
		
		
		Zebra zebra1 = new Zebra("zebra 1");
		Zebra zebra2 = new Zebra("zebra 2");
		zoo.add(zebra1);
		zoo.add(zebra2);
		
		//zoo.feedAllAnimals();
		
		Girafa girafa1 = new Girafa("girafa 1 ");
		Girafa girafa2 = new Girafa("girafa 2 ");
		zoo.add(girafa2);
		zoo.add(girafa1);
		zoo.feedAllAnimals();

	}

}
