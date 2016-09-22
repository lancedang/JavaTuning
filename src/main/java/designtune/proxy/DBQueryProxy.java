package designtune.proxy;

public class DBQueryProxy implements IDBQuery{
	private DBQuery dbQuery;
	@Override
	public String request() {
		// TODO Auto-generated method stub
		if (dbQuery == null) {
			dbQuery = new DBQuery();
		}
		return dbQuery.request();
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		if (dbQuery == null) {
			dbQuery = new DBQuery();
		}
		return dbQuery.getContent();
	}

}
