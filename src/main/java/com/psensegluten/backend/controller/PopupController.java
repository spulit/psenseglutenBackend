package com.psensegluten.backend.controller;


import com.psensegluten.backend.Service.api.PopupServiceInterface;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/psensegluten")
public class PopupController {

    private PopupServiceInterface popupService;

    @GetMapping(value = "/allpopups")
    private ResponseEntity<?> getPopup(){

        return ResponseEntity.status(HttpStatus.OK).body(popupService.getAllPopups());
    }

}
