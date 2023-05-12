package org.tom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//作用:该类是一个Controller控制器 且 下所有方法的返回值为一个JSON
//相当于是一个:@Controller 和 @ResponseBody 注解的集合,内部SpringBoot 自定义了完善的属性配置,当然也可以通过配置修改覆盖...
public class HelloController {
    @GetMapping(value = "/show")
    //@GetMapping用于处理请求方法的GET类型
    //@PostMapping用于处理请求方法的POST类型等。
    public String Hello(){
        return "Hello Wrod!!";
    }
}
