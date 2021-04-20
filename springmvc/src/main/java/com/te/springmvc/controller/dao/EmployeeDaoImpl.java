package com.te.springmvc.controller.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springmvc.dto.EmployeeBean;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
//	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;

	@Override
	public EmployeeBean authenicate(int id, String pw) {
		try {
//			entityManagerFactory=Persistence.createEntityManagerFactory("SpringData");
			entityManager = entityManagerFactory.createEntityManager();
			EmployeeBean employeeBean = entityManager.find(EmployeeBean.class, id);
			if (employeeBean != null) {
				if (employeeBean.getPw().equals(pw)) {
					System.out.println("login successfully");
					return employeeBean;
				} else {
					System.out.println("Invalid credentials");
					return null;
				}
			} else {
				System.out.println("user not found");
				return null;

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public EmployeeBean getId(int id) {
//		entityManagerFactory=Persistence.createEntityManagerFactory("SpringData");
		entityManager = entityManagerFactory.createEntityManager();
		EmployeeBean bean = entityManager.find(EmployeeBean.class, id);
		if (bean != null) {
			return bean;
		} else {
			return null;
		}

	}

	@Override
	public List<EmployeeBean> getAllEmployees() {
//		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("SpringData");
		EntityManager manager = entityManagerFactory.createEntityManager();

		String select = "from EmployeeBean";

		Query query = manager.createQuery(select);

		List<EmployeeBean> list = query.getResultList();

		if (list != null) {
			return list;
		} else {
			return null;
		}

	}// end of getAllEmployess

	@Override
	public boolean getAddEmployee(EmployeeBean employeeBean) {
//		entityManagerFactory = Persistence.createEntityManagerFactory("SpringData");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		boolean isAdded = false;
		try {
			entityTransaction.begin();
			entityManager.persist(employeeBean);
			if (employeeBean != null) {
				entityTransaction.commit();
				isAdded = true;
			}

		} catch (Exception e) {
			isAdded = false;

			e.printStackTrace();
		}

		return isAdded;

	}

	@Override
	public boolean updateEmployee(EmployeeBean employeeBean) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		boolean isUpdated = false;
		try {
			EmployeeBean info = entityManager.find(EmployeeBean.class, employeeBean.getId());

			if (employeeBean.getName() != null && employeeBean.getName() != "") {
				info.setName(employeeBean.getName());
			}
			if (employeeBean.getDob() != null) {
				info.setDob(employeeBean.getDob());
			}
			if (employeeBean.getPw() != null && employeeBean.getPw() != "") {
				info.setPw(employeeBean.getPw());
			}
			entityTransaction.commit();
			return isUpdated = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isUpdated;
	}

	@Override
	public boolean delete(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		EmployeeBean bean = entityManager.find(EmployeeBean.class, id);
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.remove(bean);
			entityTransaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return false;
	}

}
