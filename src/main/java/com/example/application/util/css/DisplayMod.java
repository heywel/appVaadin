package com.example.application.util.css;

public enum DisplayMod {

	BLOCK("block"), INLINE("inline"), FLEX("flex"), INLINE_FLEX("inline-flex");

	private String value;

	DisplayMod(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
