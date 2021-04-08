package com.codechallenge.mathdemo.dao;

import com.codechallenge.mathdemo.model.Operation;

import org.springframework.stereotype.Repository;

@Repository
public class OperationDaoImpl implements OperationDao {

    /**
     * params operation
     * 
     * NOTE: This will call a db and save a record for every operation performed*
     * Unfortunally it has been a some time since I configured a H2 database, so it
     * will requires some efford to review the documentation and configure it, all 
     * the things needed for this configuration are in the gradle file, application
     * properties configuration is pending and also the jpa cool stuff. Thanks for
     * review my CC.
     *
     * returns the operation id
     */
    @Override
    public Integer saveOperation(Operation operation) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
