package org.klsource.aigou.controller;

import org.klsource.aigou.domain.Employee;
import org.klsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping(value = "login",method = RequestMethod.POST)
//  前台传递到后台的数据是json格式的，后台通过@requestBody来接收
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername())&&"0".equals(employee.getPassword())){
            return AjaxResult.getAjaxResult().setSuccess(true).setMessage("成功");
        }else{
            return AjaxResult.getAjaxResult().setSuccess(false).setMessage("用户名或密码错误");
        }
    }
}
