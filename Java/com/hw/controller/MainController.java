package com.hw.controller;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MainController {
	
	@RequestMapping("main.do")
	public String main() {
		return "main";
	}
	
	
	@RequestMapping("file.do")
	public void file(MultipartFile uploadFile) {
		FileOutputStream fos=null;
		String filename="";
		try {
			filename = uploadFile.getOriginalFilename();
			byte filedata [] = uploadFile.getBytes();
			
			fos = new FileOutputStream(filename);
			System.out.println(fos.toString());
			fos.write(filedata);
		}catch(Exception e){
			e.getStackTrace();
		}finally {
			if (fos!=null) {
				try {
					fos.close();
				}catch(Exception e) {
					e.getStackTrace();
				}
			}
		}
	}
}
