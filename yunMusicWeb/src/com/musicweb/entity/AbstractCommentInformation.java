package com.musicweb.entity;

import java.sql.Timestamp;

/**
 * AbstractCommentInformation entity provides the base persistence definition of
 * the CommentInformation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCommentInformation implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private MusicInformation musicInformation;
	private UserInformation userInformation;
	private String commentContent;
	private Timestamp commentTime;

	// Constructors

	/** default constructor */
	public AbstractCommentInformation() {
	}

	/** full constructor */
	public AbstractCommentInformation(MusicInformation musicInformation, UserInformation userInformation,
			String commentContent, Timestamp commentTime) {
		this.musicInformation = musicInformation;
		this.userInformation = userInformation;
		this.commentContent = commentContent;
		this.commentTime = commentTime;
	}

	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public MusicInformation getMusicInformation() {
		return this.musicInformation;
	}

	public void setMusicInformation(MusicInformation musicInformation) {
		this.musicInformation = musicInformation;
	}

	public UserInformation getUserInformation() {
		return this.userInformation;
	}

	public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Timestamp getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Timestamp commentTime) {
		this.commentTime = commentTime;
	}

}