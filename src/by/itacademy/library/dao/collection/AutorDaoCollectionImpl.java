package by.itacademy.library.dao.collection;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.library.dao.AutorDao;
import by.itacademy.library.entity.Autor;

public class AutorDaoCollectionImpl implements AutorDao {

	@Override
	public List<Autor> getAutor() {

		List<Autor> autors = new ArrayList(5);
		
		autors.add(new Autor("Pushkin", 21));
		autors.add(new Autor("Suteev", 22));
		autors.add(new Autor("Chukovski", 23));
		autors.add(new Autor("Malagov", 24));
		autors.add(new Autor("Saltukov", 25));
		
		return autors;
	}

}
