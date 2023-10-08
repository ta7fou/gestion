public class TestTableau {

    public static void main(String[] args) {
        int [] tab=new int[3];
        System.out.println(tab);
        //tab[0]=1;
        System.out.println(tab[0]);
        //tab[1]=5;
        //tab[2]=12;

        for (int i=0;i<3;i++)
            System.out.print(tab[i]+" ");

        for(int t:tab)
            System.out.println(t);

        int [] tab1={12,5,7};
        for (int i=0;i< tab1.length;i++)
            System.out.println(tab1[i]);
       float [] tab2=new float[2];
        System.out.println("tableau de float");
       for (int i=0;i<2;i++)
           System.out.println(tab2[i]);
       String [] tab3=new String[3];
       tab3[0]="abc";
       tab3[1]="test";
       tab3[2]="3A40";

       for(int i=0;i<3;i++)
           System.out.println(tab3[i]);

       String [] tab4={"test1","test2"};

       for (int i=0;i<tab4.length;i++)
           System.out.println(tab4[i]);

       Animal [] taban=new Animal[3];

       Animal a1=new Animal(1,"chat");
       Animal a2=new Animal(2,"chien");

       taban[0]=a1;
       taban[1]=a2;
       for(int i=0;i<3;i++)
        System.out.println(taban[i]);

        System.out.println(a1.toString());
        System.out.println(a1);
        System.out.println("affichage animal");
        a1.display();



    }

}
