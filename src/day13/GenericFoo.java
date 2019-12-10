package day13;

public class GenericFoo<T> {
    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        GenericFoo<Boolean> foo1=new GenericFoo<Boolean>();
        GenericFoo<Integer> foo2=new GenericFoo<Integer>();

        foo1.setFoo(new Boolean(false));
        foo2.setFoo(new Integer(321));
        Boolean b=foo1.getFoo();
        Integer integer=foo2.getFoo();

        GenericFoo genericFoo=new GenericFoo();

    }
}
