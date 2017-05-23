package magicgis.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import magicgis.hrsystem.service.EmpManager;
import magicgis.hrsystem.exception.HrException;
import magicgis.hrsystem.action.base.EmpBaseAction;
import magicgis.hrsystem.vo.*;

import java.util.*;
import java.text.SimpleDateFormat;

/**
 * 查询所有未考勤人员
 */
public class ViewUnAttendAction extends EmpBaseAction
{
	private List<AttendBean> unAttend;
	// unAttend的setter和getter方法
	public void setUnAttend(List<AttendBean> unAttend)
	{
		this.unAttend = unAttend;
	}
	public List<AttendBean> getUnAttend()
	{
		return this.unAttend;
	}
	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		List<AttendBean> result = mgr.unAttend(user);
		setUnAttend(result);
		return SUCCESS;
	}
}