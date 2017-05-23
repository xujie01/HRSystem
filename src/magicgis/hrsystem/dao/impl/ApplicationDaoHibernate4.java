package magicgis.hrsystem.dao.impl;

import java.util.*;

import magicgis.hrsystem.domain.*;
import magicgis.common.dao.impl.BaseDaoHibernate4;
import magicgis.hrsystem.dao.*;

public class ApplicationDaoHibernate4 extends BaseDaoHibernate4<Application>
	implements ApplicationDao
{
	/**
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
	 */
	public List<Application> findByEmp(Employee emp)
	{
		return find("select a from Application as a where "
			+ "a.attend.employee=?0" , emp);
	}
}
