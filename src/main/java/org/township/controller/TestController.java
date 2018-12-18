package org.township.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.township.common.BusinessException;
import org.township.common.BusinessResult;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("test")
    public BusinessResult test(Integer status){
      /*  if (status == null ) {
            throw new BusinessException("status is null");
        }*/
        return new BusinessResult(500,"response is ok");
    }
}
