package day13;

public class ObjectFoo {
    private Object foo;

    public Object getFoo() {
        return foo;
    }

    public void setFoo(Object foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        ObjectFoo foo1=new ObjectFoo();
        ObjectFoo foo2=new ObjectFoo();

        foo1.setFoo(new Boolean(false));
        foo2.setFoo(new Integer(10));

        Boolean b=(Boolean) foo1.getFoo();
        Integer integer=(Integer) foo2.getFoo();

        ObjectFoo foo3=new ObjectFoo();
        foo3.setFoo(new Boolean(false));

        String str=(String) foo3.getFoo();





    }
}
