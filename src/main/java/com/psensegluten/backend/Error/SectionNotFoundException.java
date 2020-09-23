package com.psensegluten.backend.Error;

public class SectionNotFoundException extends Exception {

	private static final long serialVersionUID = -2730111931833397903L;

	public SectionNotFoundException() {
		super("Section not Found");
	}

	public SectionNotFoundException(Long id) {
		super("Section not found for " + id);
	}
	
	public SectionNotFoundException(String message) {
		super(message);
	}
	
}
