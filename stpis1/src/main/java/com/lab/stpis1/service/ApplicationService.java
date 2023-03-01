/*

package com.lab.stpis1.service;

import com.lab.stpis1.entity.Application;
import com.lab.stpis1.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    private ApplicationRepository applicationRepository;

    @Autowired
    ApplicationService (ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> findAll() {
       return applicationRepository.findAll();
    }

    public Optional<Application> findOne(Application id) {
        return applicationRepository.findById(id.getId_app());
    }

    public void save(Application application) {
        applicationRepository.save(application);
    }

    public Application update(Application application) {
        return applicationRepository.save(application);
    }

    public void delete(Application id) {
        applicationRepository.delete(id);
    }
}
*/
