package day14;

public class WrapperFoo<T> {

    private GenericFoo<T> foo;

    public GenericFoo<T> getFoo() {
        return foo;
    }

    public void setFoo(GenericFoo<T> foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        GenericFoo<Integer> foo=new GenericFoo<Integer>();
        foo.setFoo(new Integer(10));

        WrapperFoo <Integer>wrapperFoo=new WrapperFoo<Integer>();
        wrapperFoo.setFoo(foo);

        GenericFoo<Integer> g=wrapperFoo.getFoo();

    }
}


class GenericFoo<T>{
    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }
}