package com.mtevfik41.couchbase.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;
    private String requestLog;
    private String responseLog;
    private String direction;

    public Log(String requestLog, String responseLog, String direction) {
        this.requestLog = requestLog;
        this.responseLog = responseLog;
        this.direction = direction;
    }
}


