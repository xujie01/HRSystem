package magicgis.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import magicgis.hrsystem.service.EmpManager;
import magicgis.hrsystem.exception.HrException;
import magicgis.hrsystem.action.base.MgrBaseAction;

/**
 * 检查处理申请
 */
public class CheckAppAction extends MgrBaseAction
{
	// 需要被处理的申请ID
	private int appid;
	// 封装处理结果
	private String result;
	// appid的setter和getter方法
	public void setAppid(int appid)
	{
		this.appid = appid;
	}
	public int getAppid()
	{
		return this.appid;
	}

	// result的setter和getter方法
	public void setResult(String result)
	{
		this.result = result;
	}
	public String getResult()
	{
		return this.result;
	}

	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// 通过申请
		if (result.equals("pass"))
		{
			mgr.check(appid, mgrName, true);
		}
		// 拒绝申请
		else if (result.equals("deny"))
		{
			mgr.check(appid, mgrName, false);
		}
		else
		{
			throw new Exception("参数丢失");
		}
		return SUCCESS;
	}
}