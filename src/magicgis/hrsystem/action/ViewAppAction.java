package magicgis.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import magicgis.hrsystem.service.MgrManager;
import magicgis.hrsystem.exception.HrException;
import magicgis.hrsystem.action.base.MgrBaseAction;

import java.util.List;
/**
 * 查询当前经理处理的全部申请
 */

public class ViewAppAction extends MgrBaseAction
{
	private List apps;
	// apps的setter和getter方法
	public void setApps(List apps)
	{
		this.apps = apps;
	}
	public List getApps()
	{
		return this.apps;
	}
	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// 获取需要被当前经理处理的全部申请
		setApps(mgr.getAppsByMgr(mgrName));
		return SUCCESS;
	}
}