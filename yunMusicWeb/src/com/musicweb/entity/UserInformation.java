package com.musicweb.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * UserInformation entity. @author MyEclipse Persistence Tools
 */
public class UserInformation extends AbstractUserInformation implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserInformation() {
	}

	/** minimal constructor */
	public UserInformation(PicInformation picInformation, String userName, String userPassword) {
		super(picInformation, userName, userPassword);
	}

	/** full constructor */
	public UserInformation(PicInformation picInformation, String userName, String userPassword, Timestamp userBirthdate,
			String userSex, String userHabit, Set musiclistInformations, Set commentInformations) {
		super(picInformation, userName, userPassword, userBirthdate, userSex, userHabit, musiclistInformations,
				commentInformations);
	}

}
