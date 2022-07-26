package com.rsh.uoload_download.app_test_image01.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	void saveImage(MultipartFile imageFile) throws Exception;
	
}
