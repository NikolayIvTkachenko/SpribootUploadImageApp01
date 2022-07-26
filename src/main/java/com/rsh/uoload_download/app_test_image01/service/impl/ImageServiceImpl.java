package com.rsh.uoload_download.app_test_image01.service.impl;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.rsh.uoload_download.app_test_image01.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {

	@Override
	public void saveImage(MultipartFile imageFile) throws Exception{
		//Version 1 not work
//		String folder = "C:\\photos";
//		byte[] bytes = imageFile.getBytes();
//		
//		Path path = Paths.get(folder + imageFile.getOriginalFilename());
//		Files.write(path, bytes);
		
		
		//Version 2 work, create file, but empty
	       	final String OUT_PATH = "C:\\photos";
	        File file = new File(OUT_PATH);

	        System.out.println("Executable: " + file.canExecute());
	        System.out.println("Readable: " + file.canRead());
	        System.out.println("Writable: " + file.canWrite());
		
	        byte[] bytes1 = imageFile.getBytes();
	        Path path1 = Paths.get(OUT_PATH, imageFile.getOriginalFilename());
	        Files.write(path1, bytes1);
	        
	        System.out.println(path1.toString());
	        
	     //Version 3
	        
	        
	        
	}

}
