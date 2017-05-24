# 基于SSH的Java EE简单工作流系统

## 项目介绍

基于Struts + Spring + Hibernate 技术开发的简单工作流系统：没有使用工作流引擎，可以完成员工每日上下班打卡，自动调度使用Quartz，负责为每个员工进行考勤，当员工发现自己的考勤异常时，可以向其经理申请改变考勤，本系统还可根据员工的考勤自动结算工资。

### 系统功能：

大致分2个模块：经理模块和员工模块，其主要业务逻辑通过EmpManager和MgrManager2个业务逻辑组件实现，可使用这2个业务逻辑组件封装DAO组件。

### 技术选型

* Struts
* Spring 
* Hibernate
* Quartz——调度框架
* EhCache——缓存框架
* JSP

### 模块介绍

* 公共类设计

Web.xml中配置Struts及初始化Spring容器，制定WEB-INF路径下applicationContex.xml及daoContex.xml文件作为Spring配置文件，在Spring中定义数据源Bean，使用C3P0数据源，定义Hibernate的SessionFactory，并依赖注入数据源。

公共类：magicgis.common.dao包中impl.BaseDaoHibernate及BaseDao.java为Hibernate操作数据库类及接口，实现增删改查。

* magicgis.hrsystem.doman及vo(实体类)

Application.java、Attend.java、AttendType.java、CheckBack.java、Employee.java、Manager.java、Payment.java、AppBean.java、AttendBean.java、EmpBean.java、PaymentBean.java、SalaryBean.java。

* magicgis.hrsystem.dao (DAO层)

ApplicationDao.java、AttendDao.java、AttendTypeDao.java、CheckBackDao.java、EmployeeDao.java、ManagerDao.java、PaymentDao.java。

* magicgis.hrsystem.service (Service层)

EmpManager.java、MgrManager.java。

* magicgis.hrsystem.action（web层）

authority：权限检查拦截器，base：抽象类，java文件：Action类，xml文件：验证xml。

* magicgis.hrsystem.exception (异常模块)

HrException.java。

* magicgis.hrsystem.schedule（调度模块）

PayJob.java、PunchJob.java。

* magicgis.hrsystem.web（图形验证码）

AuthImg.java。

* JSP模块

WEB-INF/content。

### 数据模型

![数据模型](/documents/data-model.png)

## 环境搭建

### 开发工具

* MySQL: 数据库

* Tomcat: 应用服务器

* SVN: 版本管理

* MyEclipse: 开发IDE

* PowerDesigner: 建模工具

### 开发环境

* Jdk8

## 演示地址

演示地址：http://47.92.7.213:8080/HRSystem/index.jsp

### 预览图

![预览图](/documents/preview.png)
