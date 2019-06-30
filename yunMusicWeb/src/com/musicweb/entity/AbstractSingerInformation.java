package com.musicweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSingerInformation entity provides the base persistence definition of
 * the SingerInformation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSingerInformation implements java.io.Serializable {

	// Fields

	private Integer singerId;
	private PicInformation picInformation;
	private String singerName;
	private String singerInfo;
	private Set musiclistInformations = new HashSet(0);
	private Set musicInformations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSingerInformation() {
	}

	/** minimal constructor */
	public AbstractSingerInformation(PicInformation picInformation, String singerName, String singerInfo) {
		this.picInformation = picInformation;
		this.singerName = singerName;
		this.singerInfo = singerInfo;
	}

	/** full constructor */
	public AbstractSingerInformation(PicInformation picInformation, String singerName, String singerInfo,
			Set musiclistInformations, Set musicInformations) {
		this.picInformation = picInformation;
		this.singerName = singerName;
		this.singerInfo = singerInfo;
		this.musiclistInformations = musiclistInformations;
		this.musicInformations = musicInformations;
	}

	// Property accessors

	public Integer getSingerId() {
		return this.singerId;
	}

	public void setSingerId(Integer singerId) {
		this.singerId = singerId;
	}

	public PicInformation getPicInformation() {
		return this.picInformation;
	}

	public void setPicInformation(PicInformation picInformation) {
		this.picInformation = picInformation;
	}

	public String getSingerName() {
		return this.singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getSingerInfo() {
		return this.singerInfo;
	}

	public void setSingerInfo(String singerInfo) {
		this.singerInfo = singerInfo;
	}

	public Set getMusiclistInformations() {
		return this.musiclistInformations;
	}

	public void setMusiclistInformations(Set musiclistInformations) {
		this.musiclistInformations = musiclistInformations;
	}

	public Set getMusicInformations() {
		return this.musicInformations;
	}

	public void setMusicInformations(Set musicInformations) {
		this.musicInformations = musicInformations;
	}

}