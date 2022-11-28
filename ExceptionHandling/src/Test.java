class Test
{
    String str = "a";
 
    void A()
    {
        try
        {
            str +="b";
            System.out.println("Try block :: A");
            B();
        }
        catch (Exception e)
        {
        	System.out.println("Catch :: A");
            str += "c";
        }
    }
 
    void B() throws Exception
    {
        try
        {
            str += "d";
            System.out.println("Try Block :: B");
            C();
        }
        catch(Exception e)
        {
            throw new Exception();
        }
        finally
        {
        	System.out.println("Finally block :: B");
            str += "e";
        }
 
        str += "f";
 
    }
     
    void C() throws Exception
    {
    	System.out.println("Method :: C()");
        throw new Exception();
    }
 
    void display()
    {
        System.out.println(str);
    }
 
    public static void main(String[] args)
    {
        Test object = new Test();
        object.A();
        object.display();
    }
 
}