package com.musicweb.entity;

import java.util.Set;

/**
 * AttributeValue entity. @author MyEclipse Persistence Tools
 */
public class AttributeValue extends AbstractAttributeValue implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AttributeValue() {
	}

	/** minimal constructor */
	public AttributeValue(String attributeName) {
		super(attributeName);
	}

	/** full constructor */
	public AttributeValue(String attributeName, Set musicInformations) {
		super(attributeName, musicInformations);
	}

}
