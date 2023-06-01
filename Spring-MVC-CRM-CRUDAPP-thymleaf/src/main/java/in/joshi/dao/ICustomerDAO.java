package in.joshi.dao;

import org.springframework.data.repository.CrudRepository;

import in.joshi.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer> {

}
