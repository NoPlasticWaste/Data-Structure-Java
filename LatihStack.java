import java.util.*;
public class LatihStack{
    public static void main (String[] args) {
        LinkedList L = new LinkedList();
        L.add("E");
        L.add("W");
        L.add("Z");
        L.add("E");
        L.add("N");
        L.add("O");
        L.add("Y");
        L.add("X");
        L.add(3, "X");
        L.remove(0);
        for (Object stackList : L) {
            System.out.println(stackList+"->");
        }
    }
}