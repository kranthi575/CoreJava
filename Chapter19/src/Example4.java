import java.util.ArrayList;
import java.util.Arrays;

//finding max of arraylist
public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(14);
        list1.add(24);
        list1.add(4);
        list1.add(42);
        list1.add(5);

        System.out.println("the biggest element of Integer array "+maxArray(list1));

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Z");
        list2.add("A");
        list2.add("A");

        System.out.println("The biggest element of String Array "+maxArray(list2));
    }

    public static Integer max(ArrayList<Integer> arrayList){

        Integer max=arrayList.get(0);
        for(Integer num:arrayList){
            if(num>max){
                max=num;
            }
        }
        return max;

    }

    //writing generic method to find max of array of any type

    public static <E extends Comparable<E>> E maxArray(ArrayList<E> list){
        E largest= list.get(0);

        for(E ele:list){
           if(largest.compareTo(ele)<0){
               largest = ele;
           }
        }

        return largest;
    }
}
