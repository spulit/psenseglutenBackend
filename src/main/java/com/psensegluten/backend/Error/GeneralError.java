package com.psensegluten.backend.Error;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class GeneralError {

	@NonNull
	private HttpStatus state;
	
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime date;

	@NonNull
	private String message;

}
