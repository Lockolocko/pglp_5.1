/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.io.Serializable;

public class PersonnelDAO implements DAO<Personnel>,Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Personnel create(Personnel obj) {
        // TODO Auto-generated method stub
        return obj;
    }

    @Override
    public Personnel find(String id) {
        Personnel p;
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Personnel update(Personnel obj) {
        // TODO Auto-generated method stub
        return obj;
    }

    @Override
    public void delete(Personnel obj) {
        // TODO Auto-generated method stub
        
    }

}
