/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author eyvind
 */
@Component
public class Customer {
    
    DataRequestScope dataRequestScope;
DataSessionScope dataSessionScope;

    public DataRequestScope getDataRequestScope() {
        return dataRequestScope;
    }
@Autowired
    public void setDataRequestScope(DataRequestScope dataRequestScope) {
        this.dataRequestScope = dataRequestScope;
    }

    public DataSessionScope getDataSessionScope() {
        return dataSessionScope;
    }
@Autowired
    public void setDataSessionScope(DataSessionScope dataSessionScope) {
        this.dataSessionScope = dataSessionScope;
    }


    
}