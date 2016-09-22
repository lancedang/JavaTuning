package designtune.dynaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkDBQueryHandler implements InvocationHandler {
	private IDBQuery iDbQuery;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if (iDbQuery == null) {
			iDbQuery = new DBQuery();
		}
		return iDbQuery.request();
	}

}
