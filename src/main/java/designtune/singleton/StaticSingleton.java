package designtune.singleton;

/**
 * 最好的方法，用内部类实现单例，加载主类时，内部类 不会初始化，只有当调用getInstance时才初始化内部类
 * 并且 单例的初始化是在 类加载时 生成的，故 天生对多线程友好，线程同步
 * @author Dangdang
 *
 */
public class StaticSingleton {
	private StaticSingleton() {
	}

	private static class SingletonHolder {
		private static StaticSingleton staticSingleton = new StaticSingleton();
	}

	public static StaticSingleton getInstance() {
		return SingletonHolder.staticSingleton;
	}
}
