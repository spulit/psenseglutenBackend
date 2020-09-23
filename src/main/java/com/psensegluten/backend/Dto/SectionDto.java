package com.psensegluten.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SectionDto {
    private String id;
    private String title;
    private String descriptionUpper;
    private byte[] image;
    private String descriptionFooter;
}

