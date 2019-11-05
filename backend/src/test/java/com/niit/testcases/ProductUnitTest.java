package com.niit.testcases;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public class ProductUnitTest {
static ProductDAO productDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();	
		productDAO=(ProductDAO)context.getBean("productDAO");
	}

	@Ignore
	@Test
	public void addProductTest() 
	{
		Product product=new Product();
		product.setProductName("Nokia");
		product.setProductDesc("All Models of Nokia");		
		assertTrue("Problem in adding Category",productDAO.addProduct(product));
	}
	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product product=productDAO.getProduct(1);
	assertTrue("Problem in Deleting Category:",productDAO.deleteProduct(product));
	}
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(2);
		product.setProductDesc("Pencil cut Jeans with Chain");
	assertTrue("Problem in Updating the Category",productDAO.updateProduct(product));
	}

	@Ignore
	@Test
	public void listProductsTest()
	{
		List<Product> listProducts=productDAO.listProducts();
		assertTrue("Problem in Listing Categories:",listProducts.size()>0);
		
		for(Product product:listProducts)
		{
			System.out.println("Category ID:"+product.getProductId());
			System.out.println("Category Name:"+product.getProductName());
			System.out.println("Category Desc:"+product.getProductDesc());
		}

}

}
