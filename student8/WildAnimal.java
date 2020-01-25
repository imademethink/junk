
interface WildAnimal  
{
   public void eat();
   public void travel();
}
class Mammal implements WildAnimal
{
		public void eat() 
		{
		 System.out.println("Mammal eats");
		}
		public void travel()
		{
		  System.out.println("Mammal travels");
		} 
		public static void main(String args[])
		{
		      Mammal m = new Mammal();
		      m.eat();
		      m.travel();
		}
		
} 

