package com.fis.cloud.apptwo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fis.cloud.apptwo.entity.UserVo;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
@RestController
public class ClientController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@RequestMapping(value = "add",method = RequestMethod.GET)
//	public UserVo service(@RequestParam String userId){
//		UserVo user = new UserVo();
//		user.setUserId(userId);
//		user.setUserName("zhanshan");
//		logger.info("执行到了这里9201........");
//		return user;
//	}
	@RequestMapping(value = "add",method = RequestMethod.GET)
    public UserVo service(@RequestParam String userId,String userName){
        UserVo userVo = new UserVo();
        userVo.setUserId(userId);
        userVo.setUserName(userName);
        logger.info("执行了这里9201........");
        return userVo;
    }
}
