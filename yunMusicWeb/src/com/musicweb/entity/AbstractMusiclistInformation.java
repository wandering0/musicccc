package com.musicweb.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractMusiclistInformation entity provides the base persistence definition
 * of the MusiclistInformation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMusiclistInformation implements java.io.Serializable {

	// Fields

	private Integer musiclistId;
	private SingerInformation singerInformation;
	private PicInformation picInformation;
	private String musiclistName;
	private Integer musiclistType;
	private Integer musicNum;
	private String musiclistInfo;
	private Integer openTimes;
	private Timestamp createTime;
	private Set userInformations = new HashSet(0);
	private Set musicInformations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractMusiclistInformation() {
	}

	/** minimal constructor */
	public AbstractMusiclistInformation(PicInformation picInformation, String musiclistName, Integer musiclistType,
			Integer musicNum, String musiclistInfo, Integer openTimes, Timestamp createTime) {
		this.picInformation = picInformation;
		this.musiclistName = musiclistName;
		this.musiclistType = musiclistType;
		this.musicNum = musicNum;
		this.musiclistInfo = musiclistInfo;
		this.openTimes = openTimes;
		this.createTime = createTime;
	}

	/** full constructor */
	public AbstractMusiclistInformation(SingerInformation singerInformation, PicInformation picInformation,
			String musiclistName, Integer musiclistType, Integer musicNum, String musiclistInfo, Integer openTimes,
			Timestamp createTime, Set userInformations, Set musicInformations) {
		this.singerInformation = singerInformation;
		this.picInformation = picInformation;
		this.musiclistName = musiclistName;
		this.musiclistType = musiclistType;
		this.musicNum = musicNum;
		this.musiclistInfo = musiclistInfo;
		this.openTimes = openTimes;
		this.createTime = createTime;
		this.userInformations = userInformations;
		this.musicInformations = musicInformations;
	}

	// Property accessors

	public Integer getMusiclistId() {
		return this.musiclistId;
	}

	public void setMusiclistId(Integer musiclistId) {
		this.musiclistId = musiclistId;
	}

	public SingerInformation getSingerInformation() {
		return this.singerInformation;
	}

	public void setSingerInformation(SingerInformation singerInformation) {
		this.singerInformation = singerInformation;
	}

	public PicInformation getPicInformation() {
		return this.picInformation;
	}

	public void setPicInformation(PicInformation picInformation) {
		this.picInformation = picInformation;
	}

	public String getMusiclistName() {
		return this.musiclistName;
	}

	public void setMusiclistName(String musiclistName) {
		this.musiclistName = musiclistName;
	}

	public Integer getMusiclistType() {
		return this.musiclistType;
	}

	public void setMusiclistType(Integer musiclistType) {
		this.musiclistType = musiclistType;
	}

	public Integer getMusicNum() {
		return this.musicNum;
	}

	public void setMusicNum(Integer musicNum) {
		this.musicNum = musicNum;
	}

	public String getMusiclistInfo() {
		return this.musiclistInfo;
	}

	public void setMusiclistInfo(String musiclistInfo) {
		this.musiclistInfo = musiclistInfo;
	}

	public Integer getOpenTimes() {
		return this.openTimes;
	}

	public void setOpenTimes(Integer openTimes) {
		this.openTimes = openTimes;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Set getUserInformations() {
		return this.userInformations;
	}

	public void setUserInformations(Set userInformations) {
		this.userInformations = userInformations;
	}

	public Set getMusicInformations() {
		return this.musicInformations;
	}

	public void setMusicInformations(Set musicInformations) {
		this.musicInformations = musicInformations;
	}

}