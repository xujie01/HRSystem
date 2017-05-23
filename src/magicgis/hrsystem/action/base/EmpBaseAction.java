package magicgis.hrsystem.action.base;

import com.opensymphony.xwork2.ActionSupport;

import magicgis.hrsystem.service.EmpManager;

/**
 * 员工模块抽象类
 */
public class EmpBaseAction extends ActionSupport
{
	// 依赖的业务逻辑组件
	protected EmpManager mgr;
	// 依赖注入业务逻辑组件所必须的setter方法
	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}
}