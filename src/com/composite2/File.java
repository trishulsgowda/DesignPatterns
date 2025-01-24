package com.composite2;

public class File implements FileSystem {
	
	String name;
	
	public File(String name) {
		this.name = name;
	}

	@Override
	public void ls() {
		System.out.println("Filename:" + this.name);
	}

}
