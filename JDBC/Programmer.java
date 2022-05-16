public class Programmer{
import java.util.*;
public static void main(String[] args) throws Exception
	{
	   //	JDBC jdbc=new MySQL(); 
	   //创建对象，通过反射机制
	   ResourceBundle bundle=ResourceBundle.getBundle("jdbc");
	   String className=bundle.getString("className");
	   Class c=Class.forName(className);
		JDBC jdbc=(JDBC)c.newInstance();
		jdbc.getConnection();

	}
}  

	
 
