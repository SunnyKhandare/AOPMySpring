package com.First_Spring.AOPMySpring.Business;

import com.First_Spring.AOPMySpring.Data.Dao_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business_1 {

    @Autowired
    Dao_1 dao_1;

    public String business_1_service(){

        return dao_1.retrieve_something();
    }
}
