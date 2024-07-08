public class Box<E> {

    private E thing;

    public Box(){

    }

    public E look(){
        return thing;
    }

    public void Empty(){
        this.thing=null;
    }

    @Override
    public String toString(){
        return thing.toString();
    }

    public void fill(E obj){
        this.thing=obj;
    }

}
