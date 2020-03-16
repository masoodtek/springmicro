package com.mas.resource.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CURRENCY-CLIENT-APP")
public interface FeignUtils {
public ResponseEntity<Integer> invokeApi(@PathVariable("form") String form,@PathVariable("to") String to);
}
