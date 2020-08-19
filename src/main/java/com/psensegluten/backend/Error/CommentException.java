package com.psensegluten.backend.Error;

public class CommentException extends Exception {

	private static final long serialVersionUID = -2730111931833397903L;

	public CommentException() {
		super("Comment not Found");
	}

	public CommentException(Long id) {
		super("Comment not found for " + id);
	}
	
	public CommentException(String message) {
		super(message);
	}
	
}
