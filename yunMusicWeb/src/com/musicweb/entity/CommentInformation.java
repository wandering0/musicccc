package com.musicweb.entity;

import java.sql.Timestamp;

/**
 * CommentInformation entity. @author MyEclipse Persistence Tools
 */
public class CommentInformation extends AbstractCommentInformation implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CommentInformation() {
	}

	/** full constructor */
	public CommentInformation(MusicInformation musicInformation, UserInformation userInformation, String commentContent,
			Timestamp commentTime) {
		super(musicInformation, userInformation, commentContent, commentTime);
	}

}
