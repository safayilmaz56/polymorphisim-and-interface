package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao{  //dao:data access object
	public void add(Product product) {
		//bu katmana sadece database erişim kodları yazılır
		System.out.println("JDBC ile veritabanina eklendi");
	}
}
