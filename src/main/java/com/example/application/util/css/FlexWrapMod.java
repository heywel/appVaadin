package com.example.application.util.css;

public enum FlexWrapMod {

	NO_WRAP("nowrap"), WRAP("wrap"), WRAP_REVERSE("wrap-reverse");

	private String value;

	FlexWrapMod(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
