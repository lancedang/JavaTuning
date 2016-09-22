package designtune.singleton;

import java.io.Serializable;

public class SerialSingleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private SerialSingleton() {
		name = "SerialSingleton";
		System.out.println("This is Singleton constructor.");
	}

	private static SerialSingleton serialSingleton = new SerialSingleton();

	public static SerialSingleton getInstance() {
		return serialSingleton;
	}

	public static void show() {
		System.out.println("This is another static method.");
	}
	/**
	 * readResolve 阻止产生新的实例，保证 单例唯一，去掉的话，反序列化会产生新的 单例， 不一样
	 * @return
	 */
	private Object readResolve() {
		return serialSingleton;
	}
	
}
