package magicgis.hrsystem.dao.impl;

import java.util.*;

import magicgis.hrsystem.domain.*;
import magicgis.common.dao.impl.BaseDaoHibernate4;
import magicgis.hrsystem.dao.*;

public class ManagerDaoHibernate4 extends BaseDaoHibernate4<Manager>
	implements ManagerDao
{
	/**
	 * �����û����������ѯ����
	 * @param emp ����ָ���û���������ľ���
	 * @return ����ָ���û���������ľ���
	 */
	public List<Manager> findByNameAndPass(Manager mgr)
	{
		return find("select m from Manager m where m.name = ?0 and m.pass=?1"
			, mgr.getName() , mgr.getPass());
	}

	/**
	 * �����û������Ҿ���
	 * @param name ���������
	 * @return ���ֶ�Ӧ�ľ���
	 */
	public Manager findByName(String name)
	{
		List<Manager> ml = find("select m from Manager m where m.name=?0"
			, name);
		if (ml != null && ml.size() > 0)
		{
			return ml.get(0);
		}
		return null;
	}
}
