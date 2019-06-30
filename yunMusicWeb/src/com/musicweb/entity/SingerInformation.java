package com.musicweb.entity;

import java.util.Set;

/**
 * SingerInformation entity. @author MyEclipse Persistence Tools
 */
public class SingerInformation extends AbstractSingerInformation implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SingerInformation() {
	}

	/** minimal constructor */
	public SingerInformation(PicInformation picInformation, String singerName, String singerInfo) {
		super(picInformation, singerName, singerInfo);
	}

	/** full constructor */
	public SingerInformation(PicInformation picInformation, String singerName, String singerInfo,
			Set musiclistInformations, Set musicInformations) {
		super(picInformation, singerName, singerInfo, musiclistInformations, musicInformations);
	}

}
