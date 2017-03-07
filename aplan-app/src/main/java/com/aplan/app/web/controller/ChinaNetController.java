package com.aplan.app.web.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 第一个公众号的微信交互接口
 *
 */
@RestController
@RequestMapping("/aplan")
public class ChinaNetController {
  
  private static Logger logger = LoggerFactory.getLogger(ChinaNetController.class);
  
  @RequestMapping(value ="/index", method = {RequestMethod.GET,RequestMethod.POST})
  public String index(){
    logger.info(" ==== index ====");
    return "hello";
  }
}
