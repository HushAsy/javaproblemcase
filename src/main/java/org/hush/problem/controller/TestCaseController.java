package org.hush.problem.controller;

import com.taobao.hsf.domain.HSFResponse;
import org.hush.problem.common.JsonResult;
import org.hush.problem.service.TestProblemConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestCaseController {
	@Autowired
	private TestProblemConsumer tpc;

	@RequestMapping(value = "/processkillStart")
	@ResponseBody
	public Object processkillStart(){
		new Thread(new Runnable() {
			public void run() {
				tpc.processKillStart();
			}
		}).start();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/processkillStop")
	@ResponseBody
	public Object processkillStop(){
		tpc.processKillStop();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/cpuUsHighStart")
	public @ResponseBody Object cpuUsHighStart(){
		new Thread(new Runnable() {
			public void run() {
				tpc.cpuUsHighStart();
			}
		}).start();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/cpuUsHighStop")
	public @ResponseBody Object cpuUsHighStop(){
		tpc.cpuUsStop();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/cpuSyHighStart")
	public @ResponseBody Object cpuSyHighStart(){
		new Thread(new Runnable() {
			public void run() {
				tpc.cpuSyHighStart();
			}
		}).start();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/cpuSyHighStop")
	public @ResponseBody Object cpuSyHighStop(){
		tpc.cpuSyHighStop();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/cpuIoWaitStart")
	public @ResponseBody Object cpucpuIoWaitHighStart(){
		new Thread(new Runnable() {
			public void run() {
				tpc.cpuIoWaitStart();
			}
		}).start();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/cpuIoWaitStop")
	public @ResponseBody Object cpucpuIoWaitHighStop(){
		tpc.iowaitStop();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/oomHeapStart")
	public @ResponseBody Object oomHeapStart(){
		new Thread(new Runnable() {
			public void run() {
				tpc.oomHeapStart();
			}
		}).start();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/oomHeapStop")
	public @ResponseBody Object oomHeapStop(){
		tpc.oomHeapStop();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/oomPermanentStart")
	public @ResponseBody Object oomPermanentStart(){
		new Thread(new Runnable() {
			public void run() {
				tpc.oomPermanentStart();
			}
		}).start();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/oomPermanentStop")
	public @ResponseBody Object oomPermanentStop(){
		tpc.oomPermanentStop();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/oomStackStart")
	public @ResponseBody Object oomStackStart(){
		new Thread(new Runnable() {
			public void run() {
				tpc.oomStackStart();
			}
		}).start();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/oomStackStop")
	public @ResponseBody Object oomStackStop(){
		tpc.oomStackStop();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/oomMetaspaceStart")
	public @ResponseBody Object oomMetaspaceStart(){
		new Thread(new Runnable() {
			public void run() {
				tpc.oomPermanentStart();
			}
		}).start();
		return JsonResult.success("success", null);
	}

	@RequestMapping(value = "/oomMetaspaceStop")
	public @ResponseBody Object oomMetaspaceStop(){
		tpc.oomPermanentStop();
		return JsonResult.success("success", null);
	}
}
