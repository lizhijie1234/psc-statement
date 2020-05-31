package com.psc.statement.service;

import com.psc.statement.dao.RainDataRepository;
import com.psc.statement.entity.RainDailyEntity;
import com.psc.statement.entity.RainDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatementServiceImpl {
    @Autowired
    RainDataRepository rainDataRepository;

    public void test(){
        Optional<RainDataEntity> rainDailyEntity = rainDataRepository.findById("1");
    }
}
