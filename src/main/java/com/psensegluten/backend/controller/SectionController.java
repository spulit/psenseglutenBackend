package com.psensegluten.backend.controller;


import com.psensegluten.backend.Dto.SectionDto;
import com.psensegluten.backend.Dto.SectionDto;
import com.psensegluten.backend.Error.SectionNotFoundException;
import com.psensegluten.backend.Service.api.SectionServiceInterface;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/psensegluten")
public class SectionController {

	private static final Logger logger = LoggerFactory.getLogger(SectionController.class);
	
    private SectionServiceInterface sectionService;

    @GetMapping(value = "/allsections")
    private ResponseEntity<?> getPopup(){

        return ResponseEntity.status(HttpStatus.OK).body(sectionService.getAllSections());
    }

//    @PostMapping("/section/upload")
//    public ResponseEntity<?> upload(@RequestParam("archivo") MultipartFile archivo, @RequestParam("id") String id) throws IOException{
//    	
//    	Map<String, Object> response = new HashMap<>();
//    	SectionDto savedSection = sectionService.saveSection(archivo, id);
//    	return ResponseEntity.status(HttpStatus.CREATED).body(savedSection);
//    }
    
    @PostMapping("/section/uploadImproved")
	public ResponseEntity<?> uploadImproved(@RequestParam MultipartFile file, @RequestParam String title, 
			  @RequestParam String textUpper, @RequestParam String textFooter) throws IOException{
    	
    	Map<String, Object> response = new HashMap<>();
    	SectionDto sectionDto = new SectionDto(null, textUpper, textFooter, file.getBytes(), title) ;
		SectionDto savedSection = sectionService.saveSection(file, sectionDto);
    	return ResponseEntity.status(HttpStatus.CREATED).body(savedSection);
    }
    
    @GetMapping("/section/{id}")
    public ResponseEntity<?> get(@PathVariable("id") String id) throws IOException, SectionNotFoundException{
    	
    	SectionDto sectionDto = sectionService.getSectionById(id);
    	return ResponseEntity.status(HttpStatus.FOUND).body(sectionDto);
    }
}
