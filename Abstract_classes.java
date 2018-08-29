abstract class animals {
	String breed,colour,name;
	abstract void eat();
	void speak() {
		System.out.println("Speaking....");
	}
}
class dog extends animals{
	dog(String breed,String colour,String name){
	this.breed=breed;
	this.colour=colour;
	this.name=name;
	}
	void me() {
		System.out.println("Name is : "+name);
		System.out.println("Breed is : "+breed);
		System.out.println("Colour is : "+colour);
	}

	void eat(){
		System.out.println("I eat pedigree.");
			}

}
class cat extends animals{
	cat(String breed,String colour,String name){
	this.breed=breed;
	this.colour=colour;
	this.name=name;
	}
	void me() {
		System.out.println("Name is : "+name);
		System.out.println("Breed is : "+breed);
		System.out.println("Colour is : "+colour);
	}

	void eat(){
		System.out.println("I eat fish.");
			}

}

public class Abstract_classes {

	public static void main(String[] args) {
		
     animals an=new dog("Pit bull","Black","Tommy");
	dog d=new dog("Retriever","Brown","Scooby");
	 d.me();
    an.eat();
	an.speak();
	cat c=new cat("Normal","white","tom");
    c.me();
    an.eat();
	an.speak();
	}

}