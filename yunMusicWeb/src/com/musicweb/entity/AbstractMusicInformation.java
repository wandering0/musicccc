package com.musicweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractMusicInformation entity provides the base persistence definition of
 * the MusicInformation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMusicInformation implements java.io.Serializable {

	// Fields

	private Integer musicId;
	private String musicName;
	private String musicLyrics;
	private Integer playTimes;
	private String musicPath;
	private Integer picId;
	private Set commentInformations = new HashSet(0);
	private Set singerInformations = new HashSet(0);
	private Set musiclistInformations = new HashSet(0);
	private Set attributeValues = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractMusicInformation() {
	}

	/** minimal constructor */
	public AbstractMusicInformation(String musicName, String musicLyrics, Integer playTimes, String musicPath,
			Integer picId) {
		this.musicName = musicName;
		this.musicLyrics = musicLyrics;
		this.playTimes = playTimes;
		this.musicPath = musicPath;
		this.picId = picId;
	}

	/** full constructor */
	public AbstractMusicInformation(String musicName, String musicLyrics, Integer playTimes, String musicPath,
			Integer picId, Set commentInformations, Set singerInformations, Set musiclistInformations,
			Set attributeValues) {
		this.musicName = musicName;
		this.musicLyrics = musicLyrics;
		this.playTimes = playTimes;
		this.musicPath = musicPath;
		this.picId = picId;
		this.commentInformations = commentInformations;
		this.singerInformations = singerInformations;
		this.musiclistInformations = musiclistInformations;
		this.attributeValues = attributeValues;
	}

	// Property accessors

	public Integer getMusicId() {
		return this.musicId;
	}

	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}

	public String getMusicName() {
		return this.musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getMusicLyrics() {
		return this.musicLyrics;
	}

	public void setMusicLyrics(String musicLyrics) {
		this.musicLyrics = musicLyrics;
	}

	public Integer getPlayTimes() {
		return this.playTimes;
	}

	public void setPlayTimes(Integer playTimes) {
		this.playTimes = playTimes;
	}

	public String getMusicPath() {
		return this.musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}

	public Integer getPicId() {
		return this.picId;
	}

	public void setPicId(Integer picId) {
		this.picId = picId;
	}

	public Set getCommentInformations() {
		return this.commentInformations;
	}

	public void setCommentInformations(Set commentInformations) {
		this.commentInformations = commentInformations;
	}

	public Set getSingerInformations() {
		return this.singerInformations;
	}

	public void setSingerInformations(Set singerInformations) {
		this.singerInformations = singerInformations;
	}

	public Set getMusiclistInformations() {
		return this.musiclistInformations;
	}

	public void setMusiclistInformations(Set musiclistInformations) {
		this.musiclistInformations = musiclistInformations;
	}

	public Set getAttributeValues() {
		return this.attributeValues;
	}

	public void setAttributeValues(Set attributeValues) {
		this.attributeValues = attributeValues;
	}

}