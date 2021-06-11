package com.example.application.components.detailsdrawer;

import com.example.application.components.FlexBoxLayoutMod;
import com.example.application.size.Horizontal;
import com.example.application.size.Right;
import com.example.application.size.Vertical;
import com.example.application.util.BoxShadowBorders;
import com.example.application.util.UIUtilsMod;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.tabs.Tabs;

public class DetailsDrawerHeader extends FlexBoxLayoutMod {

	private Button close;
	private Label title;

	public DetailsDrawerHeader(String title) {
		addClassName(BoxShadowBorders.BOTTOM);
		setFlexDirection(FlexDirection.COLUMN);
		setWidthFull();

		this.close = UIUtilsMod.createTertiaryInlineButton(VaadinIcon.CLOSE);
		UIUtilsMod.setLineHeight("1", this.close);

		this.title = UIUtilsMod.createH4Label(title);

		FlexBoxLayoutMod wrapper = new FlexBoxLayoutMod(this.close, this.title);
		wrapper.setAlignItems(FlexComponent.Alignment.CENTER);
		wrapper.setPadding(Horizontal.RESPONSIVE_L, Vertical.M);
		wrapper.setSpacing(Right.L);
		add(wrapper);
	}

	public DetailsDrawerHeader(String title, Tabs tabs) {
		this(title);
		add(tabs);
	}

	public void setTitle(String title) {
		this.title.setText(title);
	}

	public void addCloseListener(ComponentEventListener<ClickEvent<Button>> listener) {
		this.close.addClickListener(listener);
	}

}
