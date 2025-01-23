package com.chainofresponsibility;

public class InfoLogProcessor extends LogProcessor{

	public InfoLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}
	
	@Override
	public void log(String logLevel, String message) {
		if("INFO".equals(logLevel)){
			System.out.println("Print info log");
		}else{
			super.log(logLevel, message);
		}
	}
}
