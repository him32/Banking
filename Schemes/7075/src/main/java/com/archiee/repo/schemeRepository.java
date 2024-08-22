package com.archiee.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.archiee.model.scheme;

@Repository
public interface schemeRepository extends CrudRepository<scheme,Long> {

    Optional<scheme> findBysno(long id);
    

}
