import java.util.*;
public class LatihList{
    public static void main (String[] args) {
        LinkedList L = new LinkedList();
        L.add("O");
        L.add("N");
        L.add("E");
        for(Object stackList : L) {
            System.out.print(stackList+"->");
        }
    }
}