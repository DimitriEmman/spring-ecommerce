//package ecommer.project.love2code.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ecommer.project.love2code.dao.ProductRepository;
//import ecommer.project.love2code.entities.Product;
//
//
//@RestController
//@RequestMapping("/api") 
//public class ProductController {
//
//	 @Autowired
//	    private ProductRepository employeeRepository;
//
//	    @GetMapping("/employees")
//	    public List< Product > getAllEmployees() {
//	        return employeeRepository.findAll();
//	    }
//	    
//	    @PostMapping("/save")
//	    public Product  saveProduct(@RequestBody Product product) {
//	    	return employeeRepository.save(product);
//	    }
//}
