package day17;

public class ProxySubject extends Subject {

    private RealSubject realSubject; //代理角色引用真实角色
    @Override
    public void request() {
        this.preRequest();
        if(realSubject==null){
            realSubject=new RealSubject();
        }
        realSubject.request();
        this.postRequest();
    }

    private void preRequest(){
        System.out.println("Pre request");
    }

    private void postRequest(){
        System.out.println("Post request");
    }
}
