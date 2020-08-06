package thinking_in_java;


class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk");
        }
    }
    public Egg(){
        System.out.println("New Egg");
        y=new Yolk();
    }
}
public class BigEgg extends Egg{
    public class Yolk{

    }

}
