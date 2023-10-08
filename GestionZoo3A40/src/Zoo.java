public class Zoo {

    String name,city;
    int nbrCages;
    Animal [] animals;

    int nbrAnim;

    private static int totalAnimal;
    public  Zoo(int nbrAnimal,int nbrCages,String name,String city)
    {
        animals=new Animal[nbrAnimal];
        this.city=city;
        this.name=name;
        this.nbrCages=nbrCages;
    }

    public boolean addAnimal(Animal a)
    {if(searchAnimal(a)!=-1)
        return false;
        if(nbrAnim<animals.length){
      animals[nbrAnim]=a;
      nbrAnim++;
        totalAnimal++;
        }
    return true;
    }
    public static int getTotalAnimal()
    {
        return totalAnimal;
    }

    public void display()
    {
        System.out.println("name :"+name+" city :"+city+" nbre cages :"+nbrCages);
        for(int i=0;i<nbrAnim;i++)
        {
            System.out.println(animals[i]);
        }}

        /*public String toString()
        {
            String str="Les animaux \n";
          for (int i=0;i<nbrAnim;i++)
              str+=animals[i]+"\n";

          return "name :"+name+" city :"+city+" nbre cages :"+nbrCages+str;

        }*/

public Zoo(){}

    public int searchAnimal(Animal a){

        for (int i=0;i<nbrAnim;i++)
        {
            if(animals[i].name==a.name)
                return i;

        }
        return -1;
    }

    public boolean removeAnimal(Animal a)
    {

        int index=searchAnimal(a);
        if (index==-1)
            return false;

        for (int i=index;i<nbrAnim;i++)
        {
            animals[i]=animals[i+1];
            animals[nbrAnim]=null;
            nbrAnim--;
        }

        return true;
    }
    public Zoo comparerZoo(Zoo z1){

        if(this.nbrAnim>z1.nbrAnim)
            return this;
        else if (this.nbrAnim< z1.nbrAnim) {
            return z1;
        }
        return null;
    }
    public static Zoo comparerZoo(Zoo zo1,Zoo zo2)

    {

        if(zo1.nbrAnim> zo2.nbrAnim)
            return zo1;
        else if (zo1.nbrAnim<zo2.nbrAnim) {
            return zo2;
        }
        return null;
    }


}
