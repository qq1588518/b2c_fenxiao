package pers.xym.fx.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 分页工具类
 * 
 * @author 徐一鸣
 * @date 2017年8月2日
 *
 */
public class Page {

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
}
