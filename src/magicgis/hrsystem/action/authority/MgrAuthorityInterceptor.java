package magicgis.hrsystem.action.authority;

import com.opensymphony.xwork2.*;

import com.opensymphony.xwork2.interceptor.*;

import magicgis.hrsystem.action.WebConstant;
/**
 * ����Ȩ�޼��������
 */
public class MgrAuthorityInterceptor extends AbstractInterceptor
{
	public String intercept(ActionInvocation invocation)
		throws Exception
	{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�level����
		String level = (String)ctx.getSession()
			.get(WebConstant.LEVEL);
		// ���level��Ϊnull����levelΪmgr
		if ( level != null && level.equals(WebConstant.MGR_LEVEL))
		{
			return invocation.invoke();
		}
		return Action.LOGIN;//����login�ַ��������û����µ�¼
	}
}