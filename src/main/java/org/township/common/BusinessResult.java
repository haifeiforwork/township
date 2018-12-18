package org.township.common;

import org.springframework.context.annotation.ComponentScan;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ComponentScan
public class BusinessResult implements Serializable {

    private Integer code;

    private String msg;

    private Map<String,Object> data = new HashMap<String, Object>();


    public BusinessResult() {

    }

    public BusinessResult(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }

   public void setData(Object ...ages) {
        for (Object obj:ages) {
            if (obj instanceof List) {

            }
        }
   }

    @Override
    public String toString() {
        return "{code:"+this.code+"msg:"+this.msg+"}";
    }
}
