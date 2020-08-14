package com.dam.consume.xml.repository;

import com.dam.consume.xml.domain.XMLPayload;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XMLPayloadRepository extends CrudRepository<XMLPayload, Long> {

}
