import java.util.*;
class LatihQueue {
    public static void main(String[] args) {
        List Q = new ArrayList();
        Q.add("D");
        Q.add("O");
        Q.add("N");
        Q.add("E");
        Q.remove(0);
        System.out.println("List Java");
        for (Object queueList : Q) {
            System.out.println(queueList+"->");
        }
    }
}