package com.psensegluten.backend.Service.api;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.psensegluten.backend.Dto.SectionDto;
import com.psensegluten.backend.Error.SectionNotFoundException;

public interface SectionServiceInterface {

    List<SectionDto> getAllSections();
    void getSectionByDate();
    void postSection();
    void deleteSection();
	public SectionDto saveSection(MultipartFile file, SectionDto sectionDto) throws IOException;
	public SectionDto getSectionById(String id) throws SectionNotFoundException;
}
