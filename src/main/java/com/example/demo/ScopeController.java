/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eyvind
 */
@RestController 
public class ScopeController {
    
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }
@Autowired
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @RequestMapping("/request")
	public String requestCall() {
		return customer.getDataRequestScope().getName();
	}

    @RequestMapping("/updaterequest")
	public String updaterequest() {
		customer.getDataRequestScope().setName("Request Scope Updated");
		return customer.getDataRequestScope().getName();
	}

        @RequestMapping("/session")
	public String sessionCall() {
		return customer.getDataSessionScope().getName();
	}
        
           @RequestMapping("/updatesession")
	public String updatesession() {
		customer.getDataSessionScope().setName("Session Scope Updated");
		return customer.getDataSessionScope().getName();
	}

        
    
    
}

