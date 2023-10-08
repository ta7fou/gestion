package TestStatic;

public class Personne {
    int id;
    String nom;
    private static int comp;


    public static int getComp()
    {
        return comp;
    }

    public Personne(){

        comp++;
    }
    public Personne(int id)
    {
        this.id=id;
        comp++;
    }
    public Personne(int id,String n)
    {
        this.id=id;
        nom=n;
        comp++;
    }

}
