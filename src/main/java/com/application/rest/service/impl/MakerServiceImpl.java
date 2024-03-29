package com.application.rest.service.impl;

import com.application.rest.entities.Maker;
import com.application.rest.persistence.IMakerDao;
import com.application.rest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MakerServiceImpl implements IMakerService {
    @Autowired
    private IMakerDao iMakerDao;


    @Override
    public List<Maker> findAll() {
        return iMakerDao.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return iMakerDao.findById(id);
    }

    @Override
    public void save(Maker maker) {
        iMakerDao.save(maker);
    }

    @Override
    public void deleteById(Long id) {
    iMakerDao.deleteById(id);
    }
}
