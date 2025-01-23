package com.chainofresponsibility;

public class ErrorLogProcessor extends LogProcessor {

	public ErrorLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}
	
	@Override
	public void log(String logLevel, String message) {
		if("ERROR".equals(logLevel)){
			System.out.println("Print error log");
		}else{
			super.log(logLevel, message);
		}
	}
}
