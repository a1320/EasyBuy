package cn.easybuy.service.user;
import cn.easybuy.entity.User;
import java.util.List;

public interface UserService {

	/**
	 * 增加用户
	 */
	public boolean add(User user);
	
	/**
	 * 更新用户 信息
	 */
	public boolean update(User user);
	
	/**
	 * 根据ID删除用户
	 */
	public boolean deleteUserById(Integer userId);
	
	/**
	 * 根据ID或姓名查询用户
	 */
	public User getUser(Integer userId,String loginName);
	
	/**
	 * 返回用户的集合
	 */
	public List<User> getUserList(Integer currentPageNo,Integer pageSize);
	
	/**
	 * 查询用户数量
	 */
	public int count();
}
