package com.composite2;

import java.util.List;

public class Directory implements FileSystem {
	
	String name;
	List<FileSystem> directory;
	
	public Directory(String name, List<FileSystem> directory) {
		this.name = name;
		this.directory = directory;
	}

	@Override
	public void ls() {
		System.out.println("Inside directory:"+ this.name);
		for(FileSystem fs : directory){
			fs.ls();
		}

	}

}
