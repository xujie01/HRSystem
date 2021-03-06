package magicgis.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import magicgis.hrsystem.service.EmpManager;
import magicgis.hrsystem.exception.HrException;
import magicgis.hrsystem.action.base.EmpBaseAction;

import java.util.*;
import java.text.SimpleDateFormat;

/**
 * 进入打卡
 */
public class PunchAction extends EmpBaseAction
{
	// 封装处理结果的punchIsValid成员变量
	private int punchIsValid;
	// punchIsValid成员变量的setter和getter方法
	public void setPunchIsValid(int punchIsValid)
	{
		this.punchIsValid = punchIsValid;
	}
	public int getPunchIsValid()
	{
		return this.punchIsValid;
	}
	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 格式化当前时间
		String dutyDay = sdf.format(new Date());
		// 调用业务逻辑方法处理用户请求
		int result = mgr.validPunch(user , dutyDay);
		setPunchIsValid(result);
		return SUCCESS;
	}
}