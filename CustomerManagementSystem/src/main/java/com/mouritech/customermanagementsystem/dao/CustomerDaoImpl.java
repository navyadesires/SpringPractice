package com.mouritech.customermanagementsystem.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mouritech.customermanagementsystem.model.Customer;




@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveCustomer(Customer theNewCustomer) {
		Session currHibSession = sessionFactory.getCurrentSession();
		currHibSession.saveOrUpdate(theNewCustomer);	
	}

	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		Session hibSession = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = hibSession.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
		//select * from order
		Root<Customer> root = cq.from(Customer.class);
		cq.select(root);
		Query query = hibSession.createQuery(cq);
		return query.getResultList();
	}

	
	
	
	
	
	
}