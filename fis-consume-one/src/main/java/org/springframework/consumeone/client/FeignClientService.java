package org.springframework.consumeone.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.consumeone.entity.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
@FeignClient("xiaolu-computer")
public interface FeignClientService {

	@RequestMapping(value="/add",method = RequestMethod.GET)
	UserVo add(@RequestParam(value="userId")String userId,@RequestParam(value="userName")String userName);
}
