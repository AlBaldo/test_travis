package logic;

import java.util.logging.Logger;

public class JtTest {
	
	public static void main(String[] arg) {
		//System.out.println("Hello Travis!");
		Logger mlog = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		mlog.info("Hello travis!"); 
	}
}
