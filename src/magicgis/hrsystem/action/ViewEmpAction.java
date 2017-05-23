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
 * ��ѯ��ǰ��������Ա��
 */
public class ViewEmpAction extends MgrBaseAction
{
	// ��װ��ǰ��������Ա����List
	private List emps;
	// emps��setter��getter����
	public void setEmps(List emps)
	{
		this.emps = emps;
	}
	public List getEmps()
	{
		return this.emps;
	}
	public String execute()
		throws Exception
	{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�user����
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		setEmps(mgr.getEmpsByMgr(mgrName));
		return SUCCESS;
	}
}