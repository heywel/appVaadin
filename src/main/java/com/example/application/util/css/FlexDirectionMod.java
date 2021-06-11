package com.example.application.util.css;

public enum FlexDirectionMod {

	COLUMN("column"), COLUMN_REVERSE("column-reverse"), ROW("row"), ROW_REVERSE(
			"row-reverse");

	private String value;

	FlexDirectionMod(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
