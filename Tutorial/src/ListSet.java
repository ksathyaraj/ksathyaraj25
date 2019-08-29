import java.util.*;

public class ListSet {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Set<Integer> set = new HashSet<Integer>();
        set.add(4);
        set.add(5);
        set.add(6);
        iterateObject(list);
        iterateObject(set);
        sendObject(list);
        sendObject(set);
    }


    private static void sendObject(Object object){

        Collection<Integer> collection = null;
        if (object instanceof List){
            List<Integer> list = (ArrayList)object;
            collection = list;
            for(Integer i:list){
                System.out.println("i am List " + i);
            }
        } else if (object instanceof Set){
            Set<Integer> list = (HashSet)object;
            collection = list;
            for(Integer i:list){
                System.out.println("i am set "+ i);
            }
        }
    }

    private static void iterateObject(Object object) {

        Collection<Integer> collection = (Collection) object;

        for (Integer i : collection) {
            System.out.println("collection  " + i);
        }

    }
}
