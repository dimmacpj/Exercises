public class newdog{
	String name;
	public void bark(){
		System.out.println(name + " says Ruff!");
	}
	public static void main(String[] args){
		newdog dog1 = new newdog();
		dog1.bark();
		dog1.name = "Bart";
		
		newdog[] dogs = new newdog[3];
		dogs[0] = new newdog();
		dogs[1] = new newdog();
		dogs[2] = dog1;
		
		dogs[0].name = "Fred";
		dogs[1].name = "Marge";
		
		System.out.print("Last dog's name is ");
		System.out.println(dogs[2].name);
		
		int x = 0;
		while (x < dogs.length) {
			dogs[x].bark();
			x = x + 1;
		}
	}
}