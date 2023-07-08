import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Second {

    public static LinkedList<String> add_to_list(LinkedList<String> my_list, String text, int numb) {
        my_list.add(numb, text);
        return my_list;
    }
    public static void main(String[] args) {
        LinkedList<String> my_List = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("qq: ");
        String my_String = iScanner.next();
        iScanner.close();
        String[] my_Arr  = my_String.split("~");
        String text = my_Arr[0];
        int num = Integer.parseInt(my_Arr[1]);
        if (my_Arr[0] == "print") {
            my_List.remove(my_Arr[1]);
        } else {
            my_List = add_to_list(my_List, text, num);
        }
        
        System.out.println(my_List.toString());
    }
}
