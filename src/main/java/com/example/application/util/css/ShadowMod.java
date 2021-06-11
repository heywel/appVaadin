package com.example.application.util.css;

public enum ShadowMod {

	XS("var(--lumo-box-shadow-xs)"), S("var(--lumo-box-shadow-s)"), M(
			"var(--lumo-box-shadow-m)"), L("var(--lumo-box-shadow-l)"), XL(
			"var(--lumo-box-shadow-xl)");

	private String value;

	ShadowMod(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
