package com.musicweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPicInformation entity provides the base persistence definition of the
 * PicInformation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPicInformation implements java.io.Serializable {

	// Fields

	private Integer picId;
	private Double picSize;
	private String picUrl;
	private Set musiclistInformations = new HashSet(0);
	private Set singerInformations = new HashSet(0);
	private Set userInformations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPicInformation() {
	}

	/** minimal constructor */
	public AbstractPicInformation(Double picSize, String picUrl) {
		this.picSize = picSize;
		this.picUrl = picUrl;
	}

	/** full constructor */
	public AbstractPicInformation(Double picSize, String picUrl, Set musiclistInformations, Set singerInformations,
			Set userInformations) {
		this.picSize = picSize;
		this.picUrl = picUrl;
		this.musiclistInformations = musiclistInformations;
		this.singerInformations = singerInformations;
		this.userInformations = userInformations;
	}

	// Property accessors

	public Integer getPicId() {
		return this.picId;
	}

	public void setPicId(Integer picId) {
		this.picId = picId;
	}

	public Double getPicSize() {
		return this.picSize;
	}

	public void setPicSize(Double picSize) {
		this.picSize = picSize;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Set getMusiclistInformations() {
		return this.musiclistInformations;
	}

	public void setMusiclistInformations(Set musiclistInformations) {
		this.musiclistInformations = musiclistInformations;
	}

	public Set getSingerInformations() {
		return this.singerInformations;
	}

	public void setSingerInformations(Set singerInformations) {
		this.singerInformations = singerInformations;
	}

	public Set getUserInformations() {
		return this.userInformations;
	}

	public void setUserInformations(Set userInformations) {
		this.userInformations = userInformations;
	}

}