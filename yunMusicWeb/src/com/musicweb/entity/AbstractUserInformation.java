package com.musicweb.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUserInformation entity provides the base persistence definition of
 * the UserInformation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserInformation implements java.io.Serializable {

	// Fields

	private Integer userId;
	private PicInformation picInformation;
	private String userName;
	private String userPassword;
	private Timestamp userBirthdate;
	private String userSex;
	private String userHabit;
	private Set musiclistInformations = new HashSet(0);
	private Set commentInformations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUserInformation() {
	}

	/** minimal constructor */
	public AbstractUserInformation(PicInformation picInformation, String userName, String userPassword) {
		this.picInformation = picInformation;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	/** full constructor */
	public AbstractUserInformation(PicInformation picInformation, String userName, String userPassword,
			Timestamp userBirthdate, String userSex, String userHabit, Set musiclistInformations,
			Set commentInformations) {
		this.picInformation = picInformation;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userBirthdate = userBirthdate;
		this.userSex = userSex;
		this.userHabit = userHabit;
		this.musiclistInformations = musiclistInformations;
		this.commentInformations = commentInformations;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public PicInformation getPicInformation() {
		return this.picInformation;
	}

	public void setPicInformation(PicInformation picInformation) {
		this.picInformation = picInformation;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Timestamp getUserBirthdate() {
		return this.userBirthdate;
	}

	public void setUserBirthdate(Timestamp userBirthdate) {
		this.userBirthdate = userBirthdate;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserHabit() {
		return this.userHabit;
	}

	public void setUserHabit(String userHabit) {
		this.userHabit = userHabit;
	}

	public Set getMusiclistInformations() {
		return this.musiclistInformations;
	}

	public void setMusiclistInformations(Set musiclistInformations) {
		this.musiclistInformations = musiclistInformations;
	}

	public Set getCommentInformations() {
		return this.commentInformations;
	}

	public void setCommentInformations(Set commentInformations) {
		this.commentInformations = commentInformations;
	}

}