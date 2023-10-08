package TestStatic;

public class Test {
    public static void main(String[] args) {
        Personne p1=new Personne();

        System.out.println(Personne.getComp());

        Personne p2=new Personne(3);
        System.out.println(Personne.getComp());

        Personne p3=new Personne(4,"n");
        System.out.println(Personne.getComp());
        Personne p4=new Personne();
        System.out.println(Personne.getComp());

        System.out.println(p1.getComp());




    }
}
