package yand.entity;


/**
 * 封装   用于封装参数
 * 返回的值
 * @author ninihao
 *
 */

public class Result {
	private String resultCode;
	private Object resultObj;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Object getResultObj() {
		return resultObj;
	}

	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}

	// 初始化result 类
	public static Result getIntance() {
		return new Result();
	}

}
