import java.util.*;
import java.io.*;
public class RemoveLL
{
 public static void main(String[] args) {
 LinkedList<String> l_list = new LinkedList<String>();
 l_list.add("Enjoy");
 l_list.add("the");
 l_list.add("little");
 l_list.add("things");
 System.out.println("The Original linked list: " + l_list);
 l_list.clear();
 System.out.println("The New linked list: " + l_list);
 }
}