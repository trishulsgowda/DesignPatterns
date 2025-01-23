package com.chainofresponsibility;

public abstract class LogProcessor {
	
	LogProcessor nextLogProcessor;

	public LogProcessor(LogProcessor nextLogProcessor) {
		this.nextLogProcessor = nextLogProcessor;
	}
	
	public void log(String logLevel, String message){
		if(nextLogProcessor != null){
			nextLogProcessor.log(logLevel, message);
		}
	}
}
