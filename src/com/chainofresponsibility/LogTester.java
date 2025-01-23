package com.chainofresponsibility;

public class LogTester {

	public static void main(String[] args) {
		LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		
		logger.log("ERROR", "dabba program");
		logger.log("INFO", "olle code maga");
		logger.log("DEBUG", "yen code guru");
	}
}
