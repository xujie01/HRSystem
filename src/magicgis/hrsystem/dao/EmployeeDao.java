package magicgis.hrsystem.dao;

import java.util.*;

import magicgis.common.dao.BaseDao;
import magicgis.hrsystem.domain.*;

public interface EmployeeDao extends BaseDao<Employee>
{
	/**
	 * 根据用户名和密码查询员工
	 * @param emp 包含指定用户名、密码的员工
	 * @return 符合指定用户名和密码的员工集合
	 */
	List<Employee> findByNameAndPass(Employee emp);

	/**
	 * 根据用户名查询员工
	 * @param name 员工的用户名
	 * @return 符合用户名的员工
	 */
	Employee findByName(String name);
}
