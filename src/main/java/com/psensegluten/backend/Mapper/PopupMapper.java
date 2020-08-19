package com.psensegluten.backend.Mapper;


import com.psensegluten.backend.Dto.PopupDto;
import com.psensegluten.backend.Entity.PopupEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PopupMapper {
    public List<PopupDto> entityToDto(List<PopupEntity> allEntities){

        return null;
    }

    public List<PopupDto> entityToDto(Iterable<PopupEntity> all) {
        final List<PopupDto> popupList = new ArrayList<>();

        all.forEach(popup -> { popupList.add(PopupDto.builder()
                .id(popup.getId())
                .title(popup.getTitle())
                .descriptionUpper(popup.getDescriptionUpper())
                .descriptionFooter(popup.getDescriptionFooter())
                .image(popup.getImage())
                .build());
        });
        return popupList;
    }
}
