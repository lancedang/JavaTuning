package designtune.dynaproxy;

public class DBQuery implements IDBQuery{
	public DBQuery() {
		// TODO Auto-generated constructor stub
		try {
			System.out.println("new DBQuery spends too long time, begin: ");
			Thread.sleep(10000);
			System.out.println("new DBQuery ends: ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String request() {
		// TODO Auto-generated method stub
		return "DBQuery request string";
	}
	
	@Override
	public String getContent() {
		return "content from DBQuery";
	}

}
