<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include  file="/WEB-INF/share/header.jsp"%>
<h2 class="contentTitle">栈区溢出</h2>
<div class="pageContent">

    <div class="pageFormContent" layoutH="97">
        <dl class="nowrap">
            <dt>测试说明：</dt>
            <dd>
                本页面主要是测试栈区溢出。
                <ul>
                    <li>1.[本系统]点击[开启压测]</li>
                    <li>2.[本系统]停止压测</li>
                </ul>
            </dd>
        </dl>
        <dl class="nowrap">
            <dt>测试功能：</dt>
            <dd>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/oomStackStart.json" class="button"><span>开启压测</span></a>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/oomStackStop.json" class="button"><span>停止压测</span></a>
            </dd>
        </dl>
        <%--<dl class="nowrap">--%>
            <%--<dt>当前状态：</dt>--%>
            <%--<dd>--%>
                <%--<ul>--%>
                    <%--<li>压测开始时间:<%=DateFormatUtils.getDateTimeStr(OomStackTimer.BEGIN_TIME)%></li>--%>
                    <%--<li>压测总次数：<%=OomStackTimer.TOTAL.get()%></li>--%>
                    <%--<li>压测错误次数：<%=OomStackTimer.ERROR.get()%></li>--%>
                <%--</ul>--%>
            <%--</dd>--%>
        <%--</dl>--%>
        <div class="divider"></div>
        <dl class="nowrap">
            <dt>排查步骤：</dt>
            <dd>
                <ul>
                    <li>具体表现:java.lang.StackOverflowError</li>
                    <li>1.通过观察日志可以观察溢出位置</li>
                    <li>2.通过jstack命令将线程信息dump下来，进行分析</li>
                </ul>
            </dd>
        </dl>
    </div>
</div>
