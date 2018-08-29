interface Animals {
    void speak();
    void eat();
}
class Dog implements Animals{
	public void speak() {
		System.out.println("dogs bark.");
	}
	public void eat() {
		System.out.println("dogs eat bones.");
	}
 }
 class cat implements Animals{
		public void speak() {
			System.out.println("cats meow.");
		}
		public void eat() {
			System.out.println("cats eat fish.");
		}
}
class Interface_implement
{
  public static void main(String[] args) 
   {	
      Dog d=new Dog();
      d.speak();
      d.eat();
      cat c=new cat();
      c.speak();
      c.eat();
   }

}
 