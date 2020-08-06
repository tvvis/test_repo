package thinking_in_java;

public class Parcel1 {
    private static class ParcelContents implements Contents{
        private int i=11;
        @Override
        public int value() {
            return i;
        }
    }

    protected static class  ParcelDestination implements Destination{
        private String label;

        private ParcelDestination(String whereTo){
            label=whereTo;
        }
        @Override
        public String readLabel() {
            return null;
        }
        public static void f(){}
        static int x=10;
        static class anotherLevel{
            public static void f(){}
            static int x=10;
        }
    }
    public static Destination dest(String s){
        return new ParcelDestination(s);
    }
    public static Contents cont(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c=cont();
        Destination d=dest("China" );
    }
}
