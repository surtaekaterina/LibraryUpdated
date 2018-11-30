package by.itacademy.library.controller.command.impl;

import java.util.Map;

import by.itacademy.library.controller.command.BasicCommand;
import by.itacademy.library.entity.Autor;
import by.itacademy.library.entity.CatalogOfAutors;
import by.itacademy.library.service.CatalogService;
import by.itacademy.library.service.impl.RegularCatalogServiceImpl;

public class ViewAutorByIdCommand implements BasicCommand {

	private CatalogService catalogService;
	

	@Override
	public void performAction(Map<String, Object> params) {
		
		Object IdAutor = params.get("autor_id");
		catalogService = new RegularCatalogServiceImpl();
		CatalogOfAutors catalogOfAutors = catalogService.listOfAutorsCatalog();

		// book id hardcoded
		

		Autor autorById = catalogOfAutors.getAutorById((int)IdAutor);

		System.out.println(autorById);
	}

}
