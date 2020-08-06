package thinking_in_java;

class WithInner{
    class Inner{}
}

public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner withInner){
        withInner.super();
    }

    public static void main(String[] args) {
        WithInner withInner=new WithInner();
        InheritInner inheritInner=new InheritInner(withInner);
    }
}
