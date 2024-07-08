import java.util.ArrayList;

public class GenericStack1<E>{

    private ArrayList<E> stack=new ArrayList<>();

    //adding element to stack
    public void push(E val){
        stack.add(val);
    }

    //removing top element of the stack
    public E pop(){

        E pop_val=stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return pop_val;
    }

    //getting top element of the stack without removing element from stack
    public E peek(){

        return stack.get(stack.size()-1);
    }

}
