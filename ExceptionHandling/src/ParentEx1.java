import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.nio.file.FileAlreadyExistsException;

class Demo2{
	
	
	public void disp()  throws IOException{
		System.out.println("Parent method overridden method");
	}
}

class Demo1 extends Demo2{
	
	public void disp() throws ArithmeticException{
		System.out.println("child method overriding method");
	}
}


public class ParentEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
