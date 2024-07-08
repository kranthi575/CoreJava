

public class Name implements Comparable<Name> {

    private String first;
    private String last;

    public Name(String first,String last){
        this.first=first;
        this.last=last;
    }

    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }

    public String toString(){
        return "Name: "+first+" "+last;
    }
    public int compareTo(Name name){

        if(first.compareTo(name.first) == 0){
            if(last.compareTo(name.last)==0){
                return 0;
            }
            else if(last.compareTo(name.last) > 0){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(first.compareTo(name.first)>0)
        {
            return 1;
        }
        else {
        return -1;}
    }


    public static void main(String args[]){

        Name[] arrayofNames={new Name("john","smart"),
                              new Name("Able","Barker"),
                                new Name("Able","smart")};

        java.util.Arrays.sort(arrayofNames);

        for(Name name:arrayofNames){
            System.out.println(name);
        }
    }
}
