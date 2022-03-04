package test.main;

//import test.my.Level;

public class Test {

	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(test.main.Test.class.getName());
	public static void main(String[] args) {
		      log.log(test.my.Level.FATAL," Level.FATAL log");
		      log.log(test.my.Level.ERROR," Level.ERROR log");
		      log.log(test.my.Level.WARNING," Level.WARNING log");
		      log.log(test.my.Level.SEVERE," Level.SEVERE log");
		      log.log(test.my.Level.UM_INFO," Level.UM_INFO log");
		      log.log(test.my.Level.INFO," Level.INFO log");
		      log.log(test.my.Level.CONFIG," Level.CONFIG log");
		      log.log(test.my.Level.FINE," Level.FINE log");
		      log.log(test.my.Level.FINER," Level.FINER log");
		      log.log(test.my.Level.FINEST," Level.FINEST log");
		      log.log(test.my.Level.DEBUG," Level.DEBUG log");
		      log.log(test.my.Level.TRACE," Level.TRACE log");
		      log.log(test.my.Level.ALL," Level.ALL log");
	}

}
