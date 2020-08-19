package com.psensegluten.backend.Service;

import com.psensegluten.backend.Dto.PopupDto;
import com.psensegluten.backend.Mapper.PopupMapper;
import com.psensegluten.backend.Repository.PopupRepository;
import com.psensegluten.backend.Service.api.PopupServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PopupService implements PopupServiceInterface {

    private PopupRepository popupRepository;
    private PopupMapper popupMapper;

    @Override
    public List<PopupDto> getAllPopups() {
        return popupMapper.entityToDto(popupRepository.findAll());

    }

    @Override
    public void getPopupById() {

    }

    @Override
    public void getPopupByDate() {

    }

    @Override
    public void postPopup() {

    }

    @Override
    public void deletePopup() {

    }
}
