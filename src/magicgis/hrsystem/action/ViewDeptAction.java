package magicgis.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import magicgis.hrsystem.service.MgrManager;
import magicgis.hrsystem.exception.HrException;
import magicgis.hrsystem.action.base.MgrBaseAction;
import magicgis.hrsystem.vo.*;

import java.util.List;

/**
 * 取得当前员工的全部发薪列表
 */

public class ViewDeptAction extends MgrBaseAction
{
	// 封装发薪列表的List成员变量
	private List sals;
	// sals的setter和getter方法
	public void setSals(List sals)
	{
		this.sals = sals;
	}
	public List getSals()
	{
		return this.sals;
	}

	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// 调用业务逻辑方法取得当前员工的全部发薪列表
		List<SalaryBean> result = mgr.getSalaryByMgr(mgrName);
		setSals(result);
		return SUCCESS;
	}
}