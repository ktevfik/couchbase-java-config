package com.mtevfik41.couchbase.repository;

import com.mtevfik41.couchbase.models.Log;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface LogRepository extends CouchbaseRepository<Log, ResponseEntity> {
    @Override
    <S extends Log> S save(S entity);
}
