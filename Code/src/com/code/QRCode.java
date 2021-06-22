package com.code;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.image.ImageType;

public class QRCode {

	public static void main(String[] args) throws Exception {
		String details="WELCOME!!!\n\n"
				+ "My name is Aditya Singh. I belong to Mumbai .There are total 4 members in my Family and I am the youngest one . I am persuing my graduation in Engineering from St.John College .Currently I am in my final year of Engineering specialized in Computer Branch.In my Engineeing life I have developed many sills like Java,C,HTML,CSS,Javascript and also done the courses of that through Coursera. Among this I like Java the most. Talking about my experience, my final year project is Mobile Price Prediction using Feature Selection Algorithm. I have also worked with an Event Management Team so as to develop my non-technical skills like Teamwork and Leadership. About my hobbies I like playing Cricket and Football. "
				+ "\n\n For More Information you can click on this link to check my Resume:-        https://drive.google.com/file/d/1lO0e7q8DGjmNYgGlegOn16bwftOY4dY3/view?usp=sharing";
		
		
	//		create image          	 (Class name)    method         		out object only 
	//			|	 	         |         |  				takes stream
		ByteArrayOutputStream out=net.glxn.qrgen.QRCode.from(details).to(ImageType.JPG).stream();

		File f=new File("E:\\Projects\\Output QRCode\\RESUMESSAMPLE.jpg");
		FileOutputStream fos=new FileOutputStream(f); 
		fos.write(out.toByteArray());
		fos.flush();
	}

}
