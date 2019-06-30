package com.musicweb.entity;

import java.util.Set;

/**
 * PicInformation entity. @author MyEclipse Persistence Tools
 */
public class PicInformation extends AbstractPicInformation implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PicInformation() {
	}

	/** minimal constructor */
	public PicInformation(Double picSize, String picUrl) {
		super(picSize, picUrl);
	}

	/** full constructor */
	public PicInformation(Double picSize, String picUrl, Set musiclistInformations, Set singerInformations,
			Set userInformations) {
		super(picSize, picUrl, musiclistInformations, singerInformations, userInformations);
	}

}
