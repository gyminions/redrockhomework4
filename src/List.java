import java.util.List
import java.util.Iterator;

public class List {
        public static void main(String args[]){
            java.util.ArrayList <String> strings =new java.util.ArrayList<String>();
            strings.add("A");
            strings.add("B");
            strings.add("C");
            strings.add("D");
            strings.add("E");
            strings.add("F");
            strings.add("G");
            System.out.printf("for循环遍历\n");
            for (int i=0;i<strings.size();i++){
                System.out.println(strings.get(i));
            }
            System.out.printf("Iterator遍历\n");
            Iterator<String> strings2=strings.iterator();
            while (strings2.hasNext())
            {
                System.out.println(strings2.next());
            }
        }

    }
