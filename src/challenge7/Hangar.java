package challenge7;

public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car seat = new Car("seat", 22);
		Car renault = new Car("renault", 34);
		Boat suzuki = new Boat("suzuki" , 70);
		Boat nissan = new Boat("nissan", 52);
		Boat peugeot = new Boat("peugeot", 47);
		
		System.out.println(seat.doStuff());
		System.out.println(renault.doStuff());
		System.out.println(suzuki.doStuff());
		System.out.println(nissan.doStuff());
		System.out.println(peugeot.doStuff());
	}

}
