package org.hush.problem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value = "/base")
	public void base() {
		System.out.println("啊哈哈这个是中文!");
	}

	@RequestMapping(value = "processkill")
	public void processkill(){

	}
	@RequestMapping(value = "cpuUsHigh")
	public void cpuUsHigh(){

	}
	@RequestMapping(value = "cpuSyHigh")
	public void cpuSyHigh(){

	}
	@RequestMapping(value = "cpuIoWaitHigh")
	public void cpuIoWaitHigh(){

	}
	@RequestMapping(value = "oomHeap")
	public void oomHeap(){

	}
	@RequestMapping(value = "oomPermanent")
	public void oomPermanent(){

	}
	@RequestMapping(value = "oomStack")
	public void oomStack(){

	}

	@RequestMapping(value = "oomMetaspace")
	public void oomMetaspace(){

	}

	@RequestMapping(value = "/_ehc")
	public @ResponseBody String ehc() {
	    return "ok";
	}
}
