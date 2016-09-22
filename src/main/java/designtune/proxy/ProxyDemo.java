package designtune.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDBQuery idbQuery = new DBQueryProxy();
		String str = idbQuery.request();
		System.out.println(str);
		String content = idbQuery.getContent();
		System.out.println(content);
	}

}
