package com.aplication.controller;

import com.aplication.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
    private final LogService logService;

   @Autowired
    public FileUploadController(LogService logService) {
        this.logService = logService;
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        logService.processLogFile(file);
        return "redirect:/";
    }
}