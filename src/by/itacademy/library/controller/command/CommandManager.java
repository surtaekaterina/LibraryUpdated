package by.itacademy.library.controller.command;

import by.itacademy.library.controller.command.impl.ViewAutorByIdCommand;
import by.itacademy.library.controller.command.impl.ViewAutorCatalogCommand;
import by.itacademy.library.controller.command.impl.ViewBookCatalogCommand;
import by.itacademy.library.controller.command.impl.ViewSingleCatalogRow;

public class CommandManager {
	
	private static BasicCommand command;
	
	public static BasicCommand defineCommand(String action) {
		switch(action) {
		case "view_catalog":
			command = new ViewBookCatalogCommand();
			break;
		case "single_row":
			command = new ViewSingleCatalogRow();
			break;
		case "find_book":
			break;
		case "view_autors":
			command = new ViewAutorCatalogCommand();
			break;
		case "autor_id":
			command = new ViewAutorByIdCommand();
			break;
		}
		return command;
	}

}
