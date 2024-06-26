package com.example.Blog_App.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Blog_App.services.FIleService;
@Service
public class FileServiceImpl implements FIleService {

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		
		//file name
		String name= file.getOriginalFilename();
		
		//random name generate file
		String randomId = UUID.randomUUID().toString();
		String fileName1 = randomId.concat(name.substring(name.lastIndexOf(".")));
		
		
		//full path
		String filePath = path+ File.separator+name;
		
		
		//create folder if not created
		File f = new File(path);
		if(!f.exists()) {
			f.mkdir();
		}
		
		//file copy
		Files.copy(file.getInputStream(),Paths.get(filePath));
		
		return name;
	}
	public InputStream getResource(String path, String fileName) throws FileNotFoundException{
		String fullPath = path+File.separator+fileName;
		InputStream is = new FileInputStream(fullPath);
		//db logic to return 
		return is;
	}
}
