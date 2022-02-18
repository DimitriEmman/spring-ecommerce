package ecommer.project.love2code.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import ecommer.project.love2code.entities.Product;
import ecommer.project.love2code.entities.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
		HttpMethod[] unsupportedmethods= {HttpMethod.PUT, HttpMethod.DELETE};
		
		// block put, post and delete for product
		config.getExposureConfiguration()
		.forDomainType(Product.class)
		.withItemExposure((metData, httpMethods)-> httpMethods.disable(unsupportedmethods))
		.withCollectionExposure((metData, httpMethods) -> httpMethods.disable(unsupportedmethods));
		
		// block put, post and delete for product
				config.getExposureConfiguration()
				.forDomainType(ProductCategory.class)
				.withItemExposure((metData, httpMethods)-> httpMethods.disable(unsupportedmethods))
				.withCollectionExposure((metData, httpMethods) -> httpMethods.disable(unsupportedmethods));
	}
	
	

}
