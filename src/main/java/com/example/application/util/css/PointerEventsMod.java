package com.example.application.util.css;

public enum PointerEventsMod {

	AUTO("auto"), NONE("none");

	private String value;

	PointerEventsMod(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
