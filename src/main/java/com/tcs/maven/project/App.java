package com.tcs.maven.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import lombok.SneakyThrows;

public class App 
{
	public static void main( String[] args )
    {
    	readFile();
    }

	@SneakyThrows
	private static void readFile() {
		BufferedReader br  = new BufferedReader(new FileReader(new File("D:/index.html")));
    	String line = null;
    	while((line =br.readLine())!= null) {
    		System.out.println(line);
    	}
	}
	
}
