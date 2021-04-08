package com.codechallenge.mathdemo.service;

import com.codechallenge.mathdemo.dao.OperationDao;
import com.codechallenge.mathdemo.model.Operation;
import com.codechallenge.mathdemo.model.OperationEnum;

import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService{

    OperationDao dao;

    public OperationServiceImpl(OperationDao dao) {
        this.dao = dao;
    }

    @Override
    public Integer sum(Integer a, Integer b) {
        Integer result = a+b;
        dao.saveOperation(new Operation(OperationEnum.SUM.getName(), result));
        return result;
    }

    @Override
    public Integer product(Integer a) {
        Integer result = a*2;
        dao.saveOperation(new Operation(OperationEnum.PRODUCT.getName(), result));
        return result;
    }

    @Override
    public Integer power(Integer a) {
        Integer result = a*a;
        dao.saveOperation(new Operation(OperationEnum.POWER.getName(), result));
        return result;
    }
    
}
