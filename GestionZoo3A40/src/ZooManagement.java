public class ZooManagement {
    public static void main(String [] args)
    {
        Animal lion=new Animal();
        lion.name="lion";
        System.out.println("lion");
        System.out.println("family :"+lion.family);
        System.out.println("name :"+lion.name);
        System.out.println("Age :"+lion.age);
        System.out.println("type :"+lion.isMammal);
Animal chat=new Animal(1,"chat",null,false);
System.out.println("Chat");
        System.out.println("family :"+chat.family);
        System.out.println("name :"+chat.name);
        System.out.println("Age :"+chat.age);
        System.out.println("type :"+chat.isMammal);
        System.out.println("Chien");
Animal chien=new Animal(2,"chie");
       // System.out.println("family :"+chien.family);
        System.out.println("name :"+chien.name);
        System.out.println("Age :"+chien.age);
       // System.out.println("type :"+chien.isMammal);

chien.display();
chat.display();
lion.display();

System.out.println(lion.toString());
System.out.println(lion);

Zoo z1=new Zoo(20,20,"belveder","tunis");
        System.out.println(z1.addAnimal(lion));
        System.out.println(z1.addAnimal(chat));
        System.out.println(z1.addAnimal(lion));
        System.out.println("Affichage Zoo");
        z1.display();

        System.out.println(z1.searchAnimal(lion));
        System.out.println(z1.searchAnimal(chien));
        System.out.println(z1.searchAnimal(chat));
        System.out.println("toString");
        //System.out.println(lion);
        System.out.println(z1);

        System.out.println("test supression");
        System.out.println(z1.removeAnimal(lion));
        System.out.println(z1);
        Zoo z2=new Zoo(13,3,"naa","tunis");
        z2.addAnimal(chat);
        z2.addAnimal(lion);
        System.out.println("Le nombre total"+Zoo.getTotalAnimal());
        System.out.println("Comparer Zoo");
        System.out.println(z1.comparerZoo(z2));
Zoo z3=new Zoo();
        System.out.println(Zoo.comparerZoo(z1,z2));
        Aquatic dolphin = new Dolphin("Ocean", 25.5f);
        Aquatic penguin = new Penguin("Antarctic", 10.2f);
        Terrestrial Lion = new Terrestrial(4, "Savannah");
        Aquatic aquaticAnimal = new Aquatic("Water");
        

        aquaticAnimal.swim(); // Output: This aquatic animal is swimming.
        dolphin.swim(); // Output: This dolphin is swimming.
        penguin.swim(); // Output: This penguin is swimming.
    }
}
