package magicgis.hrsystem.dao;

import java.util.List;

import magicgis.common.dao.BaseDao;
import magicgis.hrsystem.domain.Employee;
import magicgis.hrsystem.domain.Payment;

public interface PaymentDao extends BaseDao<Payment>
{
	/**
	 * ����Ա����ѯ�½�нˮ
	 * @return ��Ա����Ӧ���½�нˮ����
	 */
	List<Payment> findByEmp(Employee emp);

	/**
	 * ����Ա���ͷ�н�·�����ѯ�½�нˮ
	 * @param payMonth ��н�·�
	 * @param emp ��н��Ա��
	 * @return ָ��Ա����ָ���·ݵ��½�нˮ
	 */
	Payment findByMonthAndEmp(String payMonth , Employee emp);
}
