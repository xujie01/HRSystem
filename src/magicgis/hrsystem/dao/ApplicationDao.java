package magicgis.hrsystem.dao;

import java.util.*;

import magicgis.common.dao.BaseDao;
import magicgis.hrsystem.domain.*;

public interface ApplicationDao extends BaseDao<Application>
{
	/**
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
	 */
	List<Application> findByEmp(Employee emp);
}
