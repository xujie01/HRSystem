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

/**
 * ��ѯ���з�н��Ϣ
 */

public class ViewSalaryAction extends EmpBaseAction
{
	// ��װ���з�н��Ϣ��List
	private List salarys;
	// salarys��setter��getter����
	public void setSalarys(List salarys)
	{
		this.salarys = salarys;
	}
	public List getSalarys()
	{
		return this.salarys;
	}
	// �����û�����ķ���
	public String execute()
		throws Exception
	{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�user����
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		List<PaymentBean> salarys =  mgr.empSalary(user);
		setSalarys(salarys);
		return SUCCESS;
	}
}