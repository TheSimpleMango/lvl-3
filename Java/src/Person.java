
public class Person {
	private String name;
	private String superPower;
	Person(){}
	Person(String name, String superPower){
			this.name = name;
			this.superPower = superPower;
		}
		public String getname(){
			return name;
		}
		public String getSuperPower(){
			return superPower;
		}
		public void setName(String name){
			this.name = name;
		}
		public void setSuperPower(String superPower){
			this.superPower = superPower;
		}
		public String toString(){
			return"name: " + name + "; superPower: " + superPower;
		}
	public static void main(String[] args) {
		Person[] superHeroes = new Person[4];
		superHeroes[0] = new Person("a", "a");
		superHeroes[1] = new Person("b", "b");
		superHeroes[2] = new Person("c", "c");
		superHeroes[3] = new Person("d", "d");
		for (int i = 0; i < superHeroes.length; i++) {
			System.out.println(superHeroes[i]);
		}
		/*
		Person person = new Person("qwerty", "stuff");
		person.setName("asdf");
		person.setSuperPower("idk man");
		System.out.println(person.getname() + " has the superpower, "
							+ person.getSuperPower());
		System.out.println(person);
		*/
	}
}
