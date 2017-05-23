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
 * ȡ�õ�ǰԱ����ȫ����н�б�
 */

public class ViewDeptAction extends MgrBaseAction
{
	// ��װ��н�б��List��Ա����
	private List sals;
	// sals��setter��getter����
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
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�user����
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// ����ҵ���߼�����ȡ�õ�ǰԱ����ȫ����н�б�
		List<SalaryBean> result = mgr.getSalaryByMgr(mgrName);
		setSals(result);
		return SUCCESS;
	}
}