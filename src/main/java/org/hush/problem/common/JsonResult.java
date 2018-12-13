package org.hush.problem.common;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.nio.charset.Charset;

@Data
public class JsonResult {
	private int statusCode;
	private String message;
	private String navTabId;
	private String rel;
	private String callbackType;
	private String forwardUrl;

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

	public static Object fail(String message) {
		JsonResult j = new JsonResult();
		j.setMessage(message);
		j.setStatusCode(300);
		return wrapResult(j);
	}

	private static Object wrapResult(JsonResult r) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application","json",Charset.forName("UTF-8")));
		return new ResponseEntity<String>(r.toString(),
				headers, HttpStatus.OK);
	}

	public static Object timeout() {
		JsonResult j = new JsonResult();
		j.setStatusCode(301);
		return wrapResult(j);
	}

	public static Object success(String message, String navTabId) {
		JsonResult j = new JsonResult();
		j.setMessage(message);
		j.setNavTabId(navTabId);
		j.setStatusCode(200);
		return wrapResult(j);
	}

	public static Object successClose(String message, String navTabId) {
		JsonResult j = new JsonResult();
		j.setMessage(message);
		j.setStatusCode(200);
		j.setNavTabId(navTabId);
		j.setCallbackType("closeCurrent");
		return wrapResult(j);
	}

	public static Object ex(Throwable e) {
		return fail(e.getClass().getSimpleName()+":"+e.getMessage());
	}
}
