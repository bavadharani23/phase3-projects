package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {
	//LoginDao Id=new LoginDao(); //dont want to create in spring framework instead use @repository annotation
    @Autowired
    LoginDao loginDao;
    
    public String signIn(Login login) {
    	if(loginDao.signIn(login)>0)
    	{
    		return "success";
    	}
    	else
    	{
    		return "failure";
    	}
    }
    public String signUp(Login login) {
    	if(loginDao.signUp(login)>0)
    	{
    		return "Account created successfully";
    	}
    	else
    	{
    		return "Acoount didn't create";
    	}
    }
    
    
}
