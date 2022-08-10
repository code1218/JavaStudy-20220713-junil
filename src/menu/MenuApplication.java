package menu;

import java.util.ArrayList;

import menu.items.MenuItem;

public class MenuApplication {
	
	public static void main(String[] args) {
		
		Menu menu = new MenuImpl(new ArrayList<MenuItem>(), new ArrayList<MenuItem>());
		
		for(int i = 0; i < 4; i++) {
			menu.showMenu();
			System.out.println();
			
			menu.addMenu();
			System.out.println();
			
			menu.setMenu();
			System.out.println();
		}
		
		menu.showMenu();
		System.out.println();
	}

}




