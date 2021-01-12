package io.overledger.springboottemplateservice.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetailsTemplate {

    String service;
    int errorCode;
    Long timestamp;
    String message;
    String details;
}
