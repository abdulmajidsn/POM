 package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
private static Logger log=  Logger.getLogger(Log.class.getName());
public static void info (String message) {
	log.info(message);
}
public static void error (String message) {
	Log.error(message);
}

}
