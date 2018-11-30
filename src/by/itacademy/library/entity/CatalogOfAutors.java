package by.itacademy.library.entity;

import java.util.ArrayList;
import java.util.List;

public class CatalogOfAutors {

	private List<Autor> autors;

	public CatalogOfAutors() {
		autors = new ArrayList<Autor>();
	}

	public List<Autor> getAutors() {
		return autors;
	}

	public void setAutors(List<Autor> autors) {
		this.autors = autors;
	}

	@Override
	public String toString() {
		return "CatalogOfAutors [autors=" + autors + "]";
	}

	public Autor getAutorById(int id) {
		Autor resultAutor = null;
		if (autors != null) {
			// return autors.get(id);
			for (Autor autor : autors) {
				if (autor.getId() == id) {
					resultAutor = autor;
				}

			}
			return resultAutor;
		}
		return null;
	}

}
