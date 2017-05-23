package magicgis.hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import magicgis.hrsystem.exception.HrException;
import magicgis.hrsystem.domain.*;
import magicgis.hrsystem.action.base.MgrBaseAction;

/**
 * ����Ա��
 */
public class AddEmpAction extends MgrBaseAction
{
	// ��������Ա���ĳ�Ա����
	private Employee emp;

	// emp��setter��getter����
	public void setEmp(Employee emp)
	{
		this.emp = emp;
	}
	public Employee getEmp()
	{
		return this.emp;
	}

	public String execute()
		throws Exception
	{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�user����
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// ������û�
		mgr.addEmp(emp , mgrName);
		addActionMessage("����Ա���ɹ�");
		return SUCCESS;
	}
}