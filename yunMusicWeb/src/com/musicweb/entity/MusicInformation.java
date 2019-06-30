package com.musicweb.entity;

import java.util.Set;

/**
 * MusicInformation entity. @author MyEclipse Persistence Tools
 */
public class MusicInformation extends AbstractMusicInformation implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MusicInformation() {
	}

	/** minimal constructor */
	public MusicInformation(String musicName, String musicLyrics, Integer playTimes, String musicPath, Integer picId) {
		super(musicName, musicLyrics, playTimes, musicPath, picId);
	}

	/** full constructor */
	public MusicInformation(String musicName, String musicLyrics, Integer playTimes, String musicPath, Integer picId,
			Set commentInformations, Set singerInformations, Set musiclistInformations, Set attributeValues) {
		super(musicName, musicLyrics, playTimes, musicPath, picId, commentInformations, singerInformations,
				musiclistInformations, attributeValues);
	}

}
