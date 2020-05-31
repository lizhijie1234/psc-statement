package com.psc.statement.dao;

import com.psc.statement.entity.RainDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RainDataRepository extends JpaRepository<RainDataEntity,String>
        , PagingAndSortingRepository<RainDataEntity, String>,
        QueryByExampleExecutor<RainDataEntity>, JpaSpecificationExecutor<RainDataEntity> {
}
