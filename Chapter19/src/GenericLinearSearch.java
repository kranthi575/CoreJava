public class GenericLinearSearch {
    public static void main(String[] args) {
        Integer[] arrayOfInt={2,3,-4,5,6,-1,-10};

        int searchVal=3;

        int result= linearSearch(arrayOfInt,searchVal);
        if(result>0){
            System.out.println("find the value at "+result);

        }else{
            System.out.println("value not found");
        }
    }



    public static int linearSearch(Integer[] arrayOfNum,int searchVal){

       for(int i=0;i<arrayOfNum.length;i++)
       {
           if(arrayOfNum[i]==searchVal){
               return i;
           }
       }
        return 0;

    }
}
