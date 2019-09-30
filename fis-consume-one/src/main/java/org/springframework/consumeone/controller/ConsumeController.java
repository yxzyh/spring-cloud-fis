package org.springframework.consumeone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.consumeone.client.FeignClientService;
import org.springframework.consumeone.entity.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
@RestController
public class ConsumeController {

	@Autowired
	RestTemplate restTemplate;
	

    @Autowired
    private FeignClientService feignClientService;//现在在使用的feign方式,,
	
	//ribbon的调用方式
	@RequestMapping(value = "query",method = RequestMethod.GET)
	public UserVo query(String userId){
		return restTemplate.getForObject("http://xiaolu-computer/add?userId="+userId, UserVo.class);
	}
	
	//ribbon的调用方式
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public UserVo add(UserVo userVo){
		String userId = userVo.getUserId();
        String userName = userVo.getUserName();
        return feignClientService.add(userId,userName);
	}
	
}
