package com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(9999);
		Socket s = ss.accept();
		InputStream in = s.getInputStream();
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		byte[] buf=new byte[1024];
		
		int len = in.read(buf);
		String data=new String(buf,0,len);
		System.out.println(data);
		
		pw.println(data);
		pw.flush();
		
		s.close();
		ss.close();
		
	}
}







