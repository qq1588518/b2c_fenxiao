package pers.xym.fx.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分页工具类
 * 
 * @author 徐一鸣
 * @date 2017年8月2日
 *
 */
public class Page<E> {

	public Page() {
		super();
		this.page = 1;
		this.pageSize = 20;
	}

	public Page(int page) {
		super();
		this.page = page;
		this.pageSize = 20;
	}

	public Page(int page, int pageSize) {
		super();
		this.page = page;
		if (pageSize == 0) {
			this.pageSize = 20;
		}
		this.pageSize = pageSize;
	}

	/**
	 * 页码
	 */
	private int page;
	/**
	 * 每页容量
	 */
	private int pageSize;
	/**
	 * 数据总行数
	 */
	private int totalRows;
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 数据
	 */
	private List<E> list;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	/**
	 * 返回mysql分页需要的两个参数 用于limit语句
	 * 
	 * @return
	 */
	public Map<String, Integer> getMysqlPageParam() {
		Map<String, Integer> map = new HashMap<>();
		map.put("fristParameter", (page - 1) * pageSize);
		map.put("secondParameter", pageSize);
		return map;
	}

	/**
	 * 计算总页数
	 * 
	 * @return
	 */
	public int countTotalPage() {
		totalPage = (totalRows / pageSize) + 1;
		return totalPage;
	}
}
