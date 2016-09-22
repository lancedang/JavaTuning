package designtune.singleton;

/**
 * 饿汉式，加载时就初始化单例对象，当仅仅调用该类的其他静态方法（若存在)时，
 * 就会同时产生单例对象（此刻不需要）造成垃圾对象，好处是线程安全，因为不管你调不调用，
 * 只要虚拟机启动，应用中就存在这一个对象，有点像观察者模式反面那样，一直在后台运行某个服务，等着别人来用
 * 殊不知这样费事费力，还不如需要的时候给我发个消息呢
 * 
 * @author Dangdang
 *
 */
public class MySingleton {
	/**
	 * 静态变量在 加载时就被放到内存方法区，供类共享使用
	 */
	private static MySingleton mySingleton = new MySingleton();

	private MySingleton() {
		System.out.println("This is my Singleton private construction method.");
	}

	public static MySingleton getInstance() {
		return mySingleton;
	}

	public static void show() {
		System.out.println("My Singleton static show method.");
	}

}
