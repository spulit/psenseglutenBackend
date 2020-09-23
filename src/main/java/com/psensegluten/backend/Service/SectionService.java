package com.psensegluten.backend.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.psensegluten.backend.Dto.SectionDto;
import com.psensegluten.backend.Entity.SectionEntity;
import com.psensegluten.backend.Error.SectionNotFoundException;
import com.psensegluten.backend.Mapper.SectionMapper;
import com.psensegluten.backend.Repository.SectionRepository;
import com.psensegluten.backend.Service.api.SectionServiceInterface;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SectionService implements SectionServiceInterface {

    private SectionRepository sectionRepository;
    private SectionMapper sectionMapper;

    @Override
    public List<SectionDto> getAllSections() {
        return sectionMapper.entityToDtoAll(sectionRepository.findAll());
    }

    @Override
    public SectionDto saveSection(MultipartFile file, SectionDto sectionDto) throws IOException {
  	  
  	  SectionEntity sectionEntity = new SectionEntity(sectionDto.getTitle(),sectionDto.getDescriptionUpper(), file.getBytes(), sectionDto.getDescriptionFooter(),null ,null, true);
  	  return sectionMapper.entityToDto(sectionRepository.save(sectionEntity));
  	  
    }
    public Optional<SectionEntity> getFile(String fileId) {
  	  return sectionRepository.findById(fileId);
    }
    
    public List<SectionEntity> getFiles(){
  	  return (List<SectionEntity>) sectionRepository.findAll();
    }
    
	@Override
    public SectionDto getSectionById(String id) throws SectionNotFoundException {
		
    	Optional<SectionEntity> sectionEntity = this.getFile(id);
    	if (sectionEntity.isPresent()) {
    		return sectionMapper.entityToDto(sectionEntity.get());
    	}
    	
    	throw new SectionNotFoundException();
    }

    @Override
    public void getSectionByDate() {

    }

    @Override
    public void postSection() {

    }

    @Override
    public void deleteSection() {

    }
}
