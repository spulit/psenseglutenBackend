package com.psensegluten.backend.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;
    private String descriptionUpper;
    @Lob
    private byte[] image;
    private String descriptionFooter;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;
    private Boolean active;
	
    public SectionEntity(String title, String descriptionUpper, byte[] image, String descriptionFooter,
			LocalDateTime timeStart, LocalDateTime timeEnd, Boolean active) {
		super();
		this.title = title;
		this.descriptionUpper = descriptionUpper;
		this.image = image;
		this.descriptionFooter = descriptionFooter;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.active = active;
	}
    
    

}
