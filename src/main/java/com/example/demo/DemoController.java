package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class DemoController {

  @GetMapping("get")
  @ResponseBody
  public DemoObject getThing() {
    return createObject();
  }

  @PostMapping("post")
  @ResponseBody
  public DemoObject postThing(@RequestBody DemoObject obj) {
    obj.setId(599);
    return obj;
  }


  public DemoObject createObject() {
    var a = new DemoObject();
    a.setId(1);
    a.setName("A name");
    a.setValue("A value");
    return a;
  }
}
