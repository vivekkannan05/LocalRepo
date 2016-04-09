package com.IOExample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesnPaths {

	public static void main(String[] args) {
		
		Path path1 = Paths.get("c:/users/vivek/documents/file.csv");
		Path path2 = Paths.get("C:", "users","vivek","documents","test.txt");
		
		try(RandomAccessFile file = new RandomAccessFile(path1.toFile(), "r");) {
		
	FileChannel ch = file.getChannel();
	
	ByteBuffer buf = ByteBuffer.allocate(255);
	int byteRead = ch.read(buf);
	while(byteRead!= -1){
		System.out.println("Read"+byteRead);
	}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(path1.toString());
		System.out.println(path2.toString());
		
		
		
		
		
	}

}
