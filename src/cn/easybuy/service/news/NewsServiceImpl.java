package cn.easybuy.service.news;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.easybuy.dao.news.NewsMapper;
import cn.easybuy.entity.News;
import cn.easybuy.param.NewsParams;
import cn.easybuy.utils.MyBatisUtil;

/**
 *
 */
public class NewsServiceImpl implements NewsService {

	/**
	 * 根据ID获取新闻
	 */
	public News findNewsById(String id) {
		SqlSession sqlSession = null;
		News news = new News();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			news = sqlSession.getMapper(NewsMapper.class).getNewsById(Integer.parseInt(id));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			news = null;
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		return news;
	}
	
	
	/**
	 * 查询新闻列表
	 */
	public List<News> queryNewsList(NewsParams param) {
		SqlSession sqlSession = null;
		List<News> newsList = new ArrayList<News>();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			newsList = sqlSession.getMapper(NewsMapper.class).queryNewsList(param);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			newsList = null;
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		return newsList;
	}

	/**
	 * 查看新闻数目
	 */
	@Override
	public Integer queryNewsCount(NewsParams param) {
		SqlSession sqlSession = null;
		Integer count=0;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			count = sqlSession.getMapper(NewsMapper.class).queryNewsCount(param);
		} catch (Exception e) {
			
			e.printStackTrace();
			count = 0;
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		return count;
	}

}
