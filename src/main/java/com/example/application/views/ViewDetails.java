package com.example.application.views;

import com.example.application.MainLayout;
import com.example.application.Persona;
import com.example.application.components.FlexBoxLayoutMod;
import com.example.application.size.Horizontal;
import com.example.application.size.Top;
import com.example.application.util.css.BoxSizing;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.*;

import java.util.ArrayList;
import java.util.List;

@PageTitle("Details")
@Route(value = "details", layout = MainLayout.class)
public class ViewDetails extends ViewFrame {

	public static final int MOBILE_BREAKPOINT = 480;
	private Grid<Persona> grid;
	public ViewDetails(){ setViewContent(createContent() );}

	private Component createContent() {
		FlexBoxLayoutMod content = new FlexBoxLayoutMod(createGrid());
		content.setBoxSizing(BoxSizing.BORDER_BOX);
		content.setHeightFull();
		content.setPadding(Horizontal.RESPONSIVE_X, Top.RESPONSIVE_X);
		return content;
	}

	private Grid createGrid(){
		List<Persona> list = new ArrayList<>();
		list.add(new Persona(1, "Lucas", "Kane"));
		list.add(new Persona(2, "Peter", "Buchanan"));

		grid = new Grid<>();
		grid.addThemeName("mobile");
		grid.setItems(list);
		grid.setId("accounts");
		grid.setSizeFull();

		grid.addColumn(Persona::getCod).setAutoWidth(true).setFlexGrow(1).setFrozen(true).setHeader("ID").setSortable(true);
		grid.addColumn(Persona::getNombre).setAutoWidth(true).setFlexGrow(1).setHeader("Nombre");
		grid.addColumn(Persona::getApellido).setAutoWidth(true).setFlexGrow(1).setHeader("Apellido");
		grid.addColumn(Persona::getApellido).setAutoWidth(true).setFlexGrow(1).setHeader("Apellido2");
		return grid;
	}

}
