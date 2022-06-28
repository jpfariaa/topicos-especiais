package com.example.crudpizzaria.web.controller;

import com.example.crudpizzaria.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.io.Resource;

@CrossOrigin("http://localhost:8081")
@Controller
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private ExcelService service;

    @GetMapping("/download")
    public ResponseEntity<Resource> getFile() {
        String filename = "pedidos.xlsx";
        InputStreamResource file = new InputStreamResource(service.load());
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
                .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
                .body(file);
    }
}
