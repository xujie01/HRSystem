package magicgis.hrsystem.dao.impl;

import java.util.*;

import magicgis.hrsystem.domain.*;
import magicgis.common.dao.impl.BaseDaoHibernate4;
import magicgis.hrsystem.dao.*;

public class EmployeeDaoHibernate4 extends BaseDaoHibernate4<Employee>
	implements EmployeeDao
{
	/**
	 * 根据用户名和密码查询员工
	 * @param emp 包含指定用户名、密码的员工
	 * @return 符合指定用户名和密码的员工集合
	 */
	public List<Employee> findByNameAndPass(Employee emp)
	{
		return find("select p from Employee p where p.name = ?0 and p.pass=?1"
			, emp.getName() , emp.getPass());
	}

	/**
	 * 根据用户名查询员工
	 * @param name 员工的用户名
	 * @return 符合用户名的员工
	 */
	public Employee findByName(String name)
	{
		List<Employee> emps = find("select e from Employee e where e.name = ?0"
			, name);
		if (emps!= null && emps.size() >= 1)
		{
			return emps.get(0);
		}
		return null;
	}
}
