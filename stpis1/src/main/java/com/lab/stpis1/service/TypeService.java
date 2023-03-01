/*

package com.lab.stpis1.service;

import com.lab.stpis1.entity.Type;
import com.lab.stpis1.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class TypeService {

    private TypeRepository typeRepository;

    @Autowired
    TypeService (TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<Type> findAll() {
        return typeRepository.findAll();
    }

    public Optional<Type> findOne(Type id) {
        return typeRepository.findById(id.getId_type());
    }

    public Type save(Type type) {
        return typeRepository.save(type);
    }

    public Type update(Type type) {
        return typeRepository.save(type);
    }

    public void delete(Type id) {
        typeRepository.delete(id);
    }
}

*/
