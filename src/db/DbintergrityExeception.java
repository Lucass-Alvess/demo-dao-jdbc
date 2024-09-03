package db;

public class DbintergrityExeception extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbintergrityExeception(String msg) {
		super(msg);
	}
}
