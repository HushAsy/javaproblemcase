<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.alibaba.edas.testcase.timer.*,com.alibaba.edas.testcase.common.*" %>
<%@ include  file="/WEB-INF/share/header.jsp"%>
<h2 class="contentTitle">cpu iowait高</h2>
<div class="pageContent">

    <div class="pageFormContent" layoutH="97">
        <dl class="nowrap">
            <dt>测试说明：</dt>
            <dd>
                本页面主要是测试iowait高。
                <ul>
                    <li>1.[本系统]点击[开启压测]</li>
                    <li>2.[本系统]停止压测</li>
                </ul>
            </dd>
        </dl>
        <dl class="nowrap">
            <dt>测试功能：</dt>
            <dd>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/cpuIoWaitStart.json" class="button"><span>开启压测</span></a>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/cpuIoWaitStop.json" class="button"><span>停止压测</span></a>
            </dd>
        </dl>

        <div class="divider"></div>
        <dl class="nowrap">
            <dt>排查步骤：</dt>
            <dd>
                <ul>
                    <li>1.通过iotop命令，可以查看磁盘的读写，io的使用，并且可以看到io使用比较大的一些进程命令；如果JVM性能出现问题，可以通过此命令查看哪些进程命令一直在占用并且IO比较大</li>
                    <li>2.发现某个进程命令之后，通过他的TID，转化为16进程；然后通过jstack pid | less，再/16进制数据，找到这个进程命令对应的堆栈信息，可以看到哪个程序影响的JVM性能问题</li>
                </ul>
            </dd>
        </dl>
    </div>
</div>
