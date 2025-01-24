package com.composite2;

import java.util.ArrayList;
import java.util.List;

public class FileSystemTest {

	public static void main(String[] args) {
		FileSystem f1 = new File("Bhajarangi");
		FileSystem f2 = new File("Jogi");
		FileSystem f3 = new File("Mufti");
		
		FileSystem f4 = new File("Gandadhagudi");
		FileSystem f5 = new File("Appu");
		FileSystem f6 = new File("Rajakumara");
		
		List<FileSystem> shivannaMovies = new ArrayList<>();
		shivannaMovies.add(f1);
		shivannaMovies.add(f2);
		shivannaMovies.add(f3);
		
		List<FileSystem> appuMovies = new ArrayList<>();
		appuMovies.add(f4);
		appuMovies.add(f5);
		appuMovies.add(f6);
		
		
		FileSystem directory1 = new Directory("Shivanna Movies", shivannaMovies);
		FileSystem directory2 = new Directory("Appu Movies", appuMovies);
		
		List<FileSystem> movies = new ArrayList<>();
		movies.add(directory1);
		movies.add(directory2);
		
		FileSystem fileSystem = new Directory("Movies", movies);
		fileSystem.ls();
	}
}
