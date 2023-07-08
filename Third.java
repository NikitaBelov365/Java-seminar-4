import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Third {
    public static void main(String[] args) {
        LinkedList<String> my_List = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            my_List.add("Igor" + i);
        }

        Stack<String> my_Stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            my_Stack.push(my_List.get(i));
        }
        System.out.println(my_Stack.toString());

        Queue<String> my_Queue = new LinkedList<>(); 
        for (int i = 0; i < 10; i++) {
            my_Queue.add(my_List.get(i));
        }
        System.out.println(my_Queue.toString());

    }
}
