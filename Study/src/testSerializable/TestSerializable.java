package testSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	final static String FILENAME = "Serializable.txt";

	public static void main(String[] args) {

		Language language = new Language("japanese", "japan");
		Serialize(language);
		System.out.println(Deserialize().toString());
	}

	private static void Serialize(Object object) {
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
			objectOutputStream.writeObject(object);
			objectOutputStream.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Language Deserialize() {
		Language language = null;
		try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILENAME))){
			language = (Language) objectInputStream.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return language;
	}

}
