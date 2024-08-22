package com.archiee.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.archiee.model.passbook;
@Repository
public interface passbookRepository extends CrudRepository<passbook,Long> {

    Optional<passbook> findByaccno(long accno);


}
