public class Projet {

    String name;

    Developpeur dev;

    public Projet(String name,Developpeur dev)
    {
        this.name=name;
        this.dev=dev;
    }
    public Projet(String name)
    {
        this.name=name;
    }
    public String toString()
    {

        return "name :"+name+" Deve :"+dev;
    }
}
