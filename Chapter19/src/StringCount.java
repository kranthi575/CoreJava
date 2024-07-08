import java.sql.SQLOutput;

public class StringCount {

    public static <E> int toStringCount(E x){
        String s=x.toString();
        int count = s.length();
        return count;
    }
    public static void main(String[] args){

        Integer a=555;
        Double b= 123.456;
        String str= "Good morning!";

        System.out.println(" a has "+ toStringCount(a));
        System.out.println(" b has "+toStringCount(b));
        System.out.println(" str has "+toStringCount(str));
    }
}


