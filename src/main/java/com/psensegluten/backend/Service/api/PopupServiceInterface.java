package com.psensegluten.backend.Service.api;

import com.psensegluten.backend.Dto.PopupDto;

import java.util.List;

public interface PopupServiceInterface {

    List<PopupDto> getAllPopups();
    void getPopupById();
    void getPopupByDate();
    void postPopup();
    void deletePopup();
}
