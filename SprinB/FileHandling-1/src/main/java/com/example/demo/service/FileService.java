package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.FileData;

public interface FileService {

	void saveFileData(MultipartFile file);
	
	FileData getFileDataUsingId(int id);
}
