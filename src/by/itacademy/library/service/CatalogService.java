package by.itacademy.library.service;

import by.itacademy.library.entity.Catalog;
import by.itacademy.library.entity.CatalogOfAutors;

public interface CatalogService {
	
	Catalog listCatalog();
	CatalogOfAutors listOfAutorsCatalog();

}
