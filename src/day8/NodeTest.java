package day8;

public class NodeTest {
    public static void main(String[] args) {
        Node []nodes=new Node[3];
        int index=0;
        for (int i = 0; i <3 ; i++) {
            nodes[i]=new Node("node"+i);
        }

//
//        for (Node node2 : nodes) {
//            node2=new Node("node"+index);
//            index+=1;
//        }
        nodes[0].next=nodes[1];
        nodes[1].next=nodes[2];
        for (Node node : nodes) {
            System.out.println(node.data);
            System.out.println(node.next);
        }

    }
}
