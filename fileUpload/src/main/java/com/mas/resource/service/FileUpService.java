package com.mas.resource.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


public class FileUpService {
	@PostMapping("/upload")
	public ResponseEntity uploadToLocalFileSystem(@RequestParam("file") MultipartFile file) {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		Path path = Paths.get(fileBasePath + fileName);
		try {
			Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
				.path("/files/download/")
				.path(fileName)
				.toUriString();
		return ResponseEntity.ok(fileDownloadUri);
	}


}
