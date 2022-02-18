package ecommer.project.love2code.config;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ecommer.project.love2code.dao.ProductRepository;
import ecommer.project.love2code.entities.Product;

public class ProductDataLoader implements CommandLineRunner {
	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		loadProductData();
	}

	private void loadProductData() {
			Product p1 = new Product("sku1", "name1","description1", 123, "HTTP/::");
			Product p2 = new Product("sku2", "name2","description2", 123, "HTTP/::");
			Product p3 = new Product("sku3", "name3","description3", 123, "HTTP/::");
			productRepository.save(p1);
			productRepository.save(p2);
			productRepository.save(p3);
	}
}
