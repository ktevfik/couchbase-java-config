package com.mtevfik41.couchbase.controllers;

import com.mtevfik41.couchbase.dto.LogDto;
import com.mtevfik41.couchbase.models.Log;
import com.mtevfik41.couchbase.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private LogRepository logRepository;

    @PostMapping("/request1")
    public ResponseEntity<LogDto> toDeepLink(@RequestBody LogDto logDto) {
        Log log = new Log(logDto.getLink(), "REQUEST1", "TO-REQ1");

        logRepository.save(log);

        return new ResponseEntity<>(logDto, HttpStatus.OK);
    }

    @PostMapping("/request2")
    public ResponseEntity<LogDto> toWebUrl(@RequestBody LogDto logDto) {
        Log log = new Log(logDto.getLink(), "REQUEST2", "TO-REQ2");

        logRepository.save(log);

        return new ResponseEntity<>(logDto, HttpStatus.OK);
    }
}
