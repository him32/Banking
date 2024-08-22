package com.archiee.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.archiee.model.MList;
@Repository
public interface MListRepository extends CrudRepository<MList,Long> {

Optional<MList> findByaccno(long accno);
}
