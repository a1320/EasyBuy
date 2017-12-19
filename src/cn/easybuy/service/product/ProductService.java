package cn.easybuy.service.product;

import java.util.List;
import cn.easybuy.entity.Product;

public interface ProductService {
	
	/**
	 * 增加商品
	 */
	public boolean add(Product product);
	
	/**
	 * 更新商品
	 */
	public boolean update(Product product);
	
	/**
	 * 根据ID删除商品
	 */
	public boolean deleteProductById(Integer productId);
	
	/**
	 * 根据商品ID查询商品
	 */
	public Product getProductById(Integer productId);
	
	/**
	 * 返回商品集合对象
	 */
	public List<Product> getProductList(Integer currentPageNo,Integer pageSize,
										String proName,Integer categoryId,Integer level);
	/**
	 * 查询商品数量
	 */
	public int count(String proName,Integer categoryId,Integer level);
	
	/**
	 * 更新商品中数量
	 */
	public boolean updateStock(Integer productId,Integer stock);
	
}
