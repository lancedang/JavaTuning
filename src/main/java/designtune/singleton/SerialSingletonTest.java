package designtune.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.junit.Assert;
import org.junit.Test;

public class SerialSingletonTest {

	@Test
	public void test() {
		SerialSingleton s1 = null;
		SerialSingleton s2 = SerialSingleton.getInstance();
		OutputStream outputStream;
		ObjectOutputStream objectOutputStream;
		ObjectInputStream objectInputStream;
		try {
			outputStream = new FileOutputStream("E:\\SerialSingleton.ser");
			objectOutputStream = new ObjectOutputStream(outputStream);

			objectOutputStream.writeObject(s2);
			objectOutputStream.flush();
			objectOutputStream.close();

			objectInputStream = new ObjectInputStream(new FileInputStream("E:\\SerialSingleton.ser"));
			s1 = (SerialSingleton) objectInputStream.readObject();
			objectInputStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals(s2, s1);

	}

}
