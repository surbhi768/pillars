class Animal
{
public int breed;
public int color;
public void speak()
{
System.out.println("languages");
}
}
class Dog extends Animal
{
public void speak()
{
System.out.println("bhaoo..");
}
}
class Cat extends Animal
{
public void speak()
{
System.out.println("meow..");
}
}
class main
{
public static void main(String args[])
{
Animal a=new Animal();
a.speak();
a=new Dog();
a.speak();
a=new Cat();
a.speak();
}
}

