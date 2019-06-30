package com.musicweb.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * MusiclistInformation entity. @author MyEclipse Persistence Tools
 */
public class MusiclistInformation extends AbstractMusiclistInformation implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MusiclistInformation() {
	}

	/** minimal constructor */
	public MusiclistInformation(PicInformation picInformation, String musiclistName, Integer musiclistType,
			Integer musicNum, String musiclistInfo, Integer openTimes, Timestamp createTime) {
		super(picInformation, musiclistName, musiclistType, musicNum, musiclistInfo, openTimes, createTime);
	}

	/** full constructor */
	public MusiclistInformation(SingerInformation singerInformation, PicInformation picInformation,
			String musiclistName, Integer musiclistType, Integer musicNum, String musiclistInfo, Integer openTimes,
			Timestamp createTime, Set userInformations, Set musicInformations) {
		super(singerInformation, picInformation, musiclistName, musiclistType, musicNum, musiclistInfo, openTimes,
				createTime, userInformations, musicInformations);
	}

}
