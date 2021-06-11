package com.example.application.components;

import com.example.application.size.Left;
import com.example.application.size.Right;
import com.example.application.util.FontSize;
import com.example.application.util.LumoStyles;
import com.example.application.util.TextColor;
import com.example.application.util.UIUtilsMod;
import com.example.application.util.css.BorderRadius;
import com.example.application.util.css.DisplayMod;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;

public class Token extends FlexBoxLayoutMod {

	private final String CLASS_NAME = "token";

	public Token(String text) {
		setAlignItems(FlexComponent.Alignment.CENTER);
		setBackgroundColor(LumoStyles.Color.Primary._10);
		setBorderRadius(BorderRadius.M);
		setClassName(CLASS_NAME);
		setDisplay(DisplayMod.INLINE_FLEX);
		setPadding(Left.S, Right.XS);
		setSpacing(Right.XS);

		Label label = UIUtilsMod.createLabel(FontSize.S, TextColor.BODY, text);
		Button button = UIUtilsMod.createButton(VaadinIcon.CLOSE_SMALL, ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_TERTIARY_INLINE);
		add(label, button);
	}

}
