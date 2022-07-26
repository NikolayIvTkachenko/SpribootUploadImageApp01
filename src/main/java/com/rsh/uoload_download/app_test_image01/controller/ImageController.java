package com.rsh.uoload_download.app_test_image01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rsh.uoload_download.app_test_image01.service.ImageService;

@RestController
@RequestMapping("api/v1/")
public class ImageController {

	
	private ImageService imageService;
	
	@Autowired
	public ImageController(ImageService imageService) {
		this.imageService = imageService;
	}
	
//    @RequestMapping("/start")
//    @ResponseBody
//    public String home(){
//        return "start";
//    }
	
	@PostMapping("/uploadImage") // , headers=("content-type=multipart/*"),method=RequestMethod.POST
	public String uploadImage(@RequestParam("imageFile") MultipartFile imageFile) {
		String returnValue = "";
		
		try {
			imageService.saveImage(imageFile);
			returnValue = "Image Saved";
		} catch (Exception e) {
			
			e.printStackTrace();
			returnValue = "Error";
		}
		
		return returnValue;
	}
	
	
}
