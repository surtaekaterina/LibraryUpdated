package by.itacademy.library.controller.command.impl;

import java.util.Map;

import by.itacademy.library.controller.command.BasicCommand;
import by.itacademy.library.entity.CatalogOfAutors;
import by.itacademy.library.service.CatalogService;
import by.itacademy.library.service.impl.RegularCatalogServiceImpl;

public class ViewAutorCatalogCommand implements BasicCommand {

	private CatalogService catalogService;

	@Override
	public void performAction(Map<String, Object> params) {
		// replace with factory
		catalogService = new RegularCatalogServiceImpl();
		CatalogOfAutors catalogOfAutors = catalogService.listOfAutorsCatalog();

		// move to other layer
		System.out.println(catalogOfAutors);

	}

}
