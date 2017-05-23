package magicgis.hrsystem.dao;

import java.util.List;

import magicgis.common.dao.BaseDao;
import magicgis.hrsystem.domain.Employee;
import magicgis.hrsystem.domain.Payment;

public interface PaymentDao extends BaseDao<Payment>
{
	/**
	 * 根据员工查询月结薪水
	 * @return 该员工对应的月结薪水集合
	 */
	List<Payment> findByEmp(Employee emp);

	/**
	 * 根据员工和发薪月份来查询月结薪水
	 * @param payMonth 发薪月份
	 * @param emp 领薪的员工
	 * @return 指定员工、指定月份的月结薪水
	 */
	Payment findByMonthAndEmp(String payMonth , Employee emp);
}
