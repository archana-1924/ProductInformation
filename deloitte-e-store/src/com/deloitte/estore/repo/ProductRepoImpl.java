package com.deloitte.estore.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.estore.model.Product;

public class ProductRepoImpl implements ProductRepo{

	@Override
	public boolean addProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
	    Connection con= getDbConnection();
		PreparedStatement pstmt= con.prepareStatement("insert into product values (?,?,?)");
		pstmt.setInt(1, product.getProductId());
		pstmt.setString(2, product.getProductName());
		pstmt.setFloat(3, product.getPrice());
		if(pstmt.executeUpdate()>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) {
		Connection con= getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from product where pid=?");
		pstmt.setInt(1, product.getProductId());
		if(pstmt.executeUpdate()>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getDbConnection() throws SQLException {
		Connection con= DriverManager.getConnection(
				        "jdbc:oracle:thin:@localhost:1521:xe",
				        "system", "admin"
				        );
		return con;
		
	}
 
}
