package magicgis.hrsystem.action.base;

import com.opensymphony.xwork2.ActionSupport;

import magicgis.hrsystem.service.MgrManager;

/**
 * ����ģ�������
 */

public class MgrBaseAction extends ActionSupport
{
	protected MgrManager mgr;

	public void setMgrManager(MgrManager mgr)
	{
		this.mgr = mgr;
	}
}