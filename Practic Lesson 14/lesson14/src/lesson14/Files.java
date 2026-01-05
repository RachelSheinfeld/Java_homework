package lesson14;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;

public class Files {
	public static void writeToFile(Collection<?> collection, String fileName) {
		try {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(fileName));
		for (Object obj : collection) {
			Class<?> clazz =obj.getClass();
			Field[] fields=clazz.getDeclaredFields();
			for (Field f : fields) {
				f.setAccessible(true);
				Object value = f.get(obj);
			    dos.writeBytes(String.valueOf(value) + ",");
            }
            dos.writeBytes("\n");
		}
	      dos.close(); 
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
