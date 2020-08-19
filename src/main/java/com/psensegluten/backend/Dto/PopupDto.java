package com.psensegluten.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PopupDto {
    private String id;
    private String title;
    private String descriptionUpper;
    private String image;
    private String descriptionFooter;
}

