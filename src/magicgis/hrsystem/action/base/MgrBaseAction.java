package magicgis.hrsystem.action.base;

import com.opensymphony.xwork2.ActionSupport;

import magicgis.hrsystem.service.MgrManager;

/**
 * 经理模块抽象类
 */

public class MgrBaseAction extends ActionSupport
{
	protected MgrManager mgr;

	public void setMgrManager(MgrManager mgr)
	{
		this.mgr = mgr;
	}
}