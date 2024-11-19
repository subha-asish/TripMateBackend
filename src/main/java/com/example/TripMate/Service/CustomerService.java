package com.example.TripMate.Service;

import com.example.TripMate.Entity.Customer;
import com.example.TripMate.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Long id, Customer customerDetails) throws Exception {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new Exception("Customer not found"));
        customer.setName(customerDetails.getName());
        customer.setEmail(customerDetails.getEmail());
        return customerRepository.save(customer);
    }
}

