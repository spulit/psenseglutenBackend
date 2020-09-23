package com.psensegluten.backend.Mapper;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.psensegluten.backend.Dto.SectionDto;
import com.psensegluten.backend.Entity.SectionEntity;

@Service
public class SectionMapper {

    public List<SectionDto> entityToDtoAll(Iterable<SectionEntity> all) {
        final List<SectionDto> popupList = new ArrayList<>();

        all.forEach(section -> { popupList.add(entityToDto(section));
        });
        return popupList;
    }

	public SectionDto entityToDto(SectionEntity section) {
		return SectionDto.builder()
                .id(section.getId())
                .title(section.getTitle())
                .descriptionUpper(section.getDescriptionUpper())
                .descriptionFooter(section.getDescriptionFooter())
                .image(section.getImage())
                .build();
	}

}
