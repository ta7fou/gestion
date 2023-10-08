

public class Animal {

    protected String habitat;

    public Animal(String habitat) {
        this.habitat = habitat;
    }
    String family,name;
    int age;
    boolean isMammal;

public Animal(int age,String na,String fam,boolean isMa){
    this.age=age;
    this.name=na;
    this.family=fam;
    this.isMammal=isMa;
}
public Animal(){}

public Animal(int ag,String na)
{
 age=ag;
 name=na;
}
public Animal(String family,int age)
{
    this.family=family;
    this.age=age;
}
    public Animal(String family,int age,String name)
    {
        this.family=family;
        this.age=age;
        this.name=name;
    }
    public void display()
    {
      System.out.println("name :"+name+"family :"+family+"age :"+age+"is Mamal"+isMammal);

    }

   public  String toString()
    {
    return "name :"+name+"family :"+family+"age :"+age+"is Mamal"+isMammal;

    }
}