import java.sql.SQLOutput;

public class TestBox {

    public static void main(String[] args) {

        Box<Integer> b1=new Box<>();

        b1.fill(5);

        System.out.println("This box is filled up with "+b1.look().getClass().getName()+" : value is "+b1.toString());


    }
}
