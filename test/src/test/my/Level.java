package test.my;


public class Level extends org.apache.log4j.Level {
	  private static final long serialVersionUID = 1L;
	  public static final int UM_INFO_INT = 350;
	  public static final int SEVERE_INT = 320;
	  public static final int CONFIG_INT = 410;
	  public static final int FINE_INT = 420;
	  public static final int FINER_INT = 430;
	  public static final int FINEST_INT = 440;
	  public static final int WARN_INT=300;

	  public static final Level TRACE = new Level(TRACE_INT, "TRACE", 7);
	  public static final Level FINE = new Level(FINE_INT, "FINE", 8);
	  public static final Level FINEST = new Level(FINEST_INT, "FINEST", 10);
      public static final Level OFF = new Level(OFF_INT, "OFF", -1);
	  public static final Level FATAL = new Level(FATAL_INT, "FATAL", 1);
	  public static final Level ERROR = new Level(ERROR_INT, "ERROR", 3);
	  public static final Level WARNING = new Level(WARN_INT, "WARNING", 4);
	  public static final Level SEVERE = new Level(SEVERE_INT, "SEVERE", 2);
	  public static final Level INFO = new Level(INFO_INT, "INFO", 6);
	  public static final Level CONFIG = new Level(CONFIG_INT, "CONFIG", 5);
	  public static final Level FINER = new Level(FINER_INT, "FINER", 9);
	  public static final Level DEBUG = new Level(DEBUG_INT, "DEBUG", 7);
	  public static final Level ALL = new Level(ALL_INT, "ALL", 7);
	  public static final Level UM_INFO = new Level(UM_INFO_INT, "UM_INFO", 11);

	  private Level(int paramInt1, String paramString, int paramInt2)
	  {
	      super(paramInt1, paramString, paramInt2);
	      org.apache.logging.log4j.Level.forName(paramString, paramInt1);
	  }
	
}
