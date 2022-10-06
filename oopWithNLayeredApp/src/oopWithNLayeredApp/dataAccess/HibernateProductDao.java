package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		//bu katmana sadece database erişim kodları yazılır
		System.out.println("Hibernate ile veritabanina eklendi");
	}
}
