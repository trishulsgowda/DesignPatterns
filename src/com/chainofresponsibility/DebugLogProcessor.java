package com.chainofresponsibility;

public class DebugLogProcessor extends LogProcessor {

	public DebugLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}
	
	@Override
	public void log(String logLevel, String message) {
		if("DEBUG".equals(logLevel)){
			System.out.println("Print debug log");
		}else{
			super.log(logLevel, message);
		}
	}

}
