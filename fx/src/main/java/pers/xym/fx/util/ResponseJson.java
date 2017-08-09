package pers.xym.fx.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 返回值格式化类
 * 
 * @author 徐一鸣
 * @date 2017年8月9日
 *
 */
@Scope("prototype")
@Component
public class ResponseJson {

	/**
	 * 调用状态
	 */
	private boolean status;

	/**
	 * 返回码
	 */
	private int returnCode;

	/**
	 * 返回说明
	 */
	private String memo;

	/**
	 * 返回数据
	 */
	private Object model;

	public ResponseJson() {
		super();
	}
	public ResponseJson(boolean status, int returnCode) {
		super();
		this.status = status;
		this.returnCode = returnCode;
	}
	public ResponseJson(boolean status, int returnCode, String memo) {
		super();
		this.status = status;
		this.returnCode = returnCode;
		this.memo = memo;
	}
	public ResponseJson(boolean status, int returnCode, String memo, Object model) {
		super();
		this.status = status;
		this.returnCode = returnCode;
		this.memo = memo;
		this.model = model;
	}

	public String getMemo() {
		return memo;
	}

	public Object getModel() {
		return model;
	}

	public int getReturnCode() {
		return returnCode;
	}

	public boolean isStatus() {
		return status;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setModel(Object model) {
		this.model = model;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
