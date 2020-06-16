package com.First_Spring.AOPMySpring.Business;

import com.First_Spring.AOPMySpring.Data.Dao_1;
import com.First_Spring.AOPMySpring.Data.Dao_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business_2 {

    @Autowired
    Dao_2 dao_2;

    public String business_2_service(){

        return dao_2.retrieve_something();
    }
}
