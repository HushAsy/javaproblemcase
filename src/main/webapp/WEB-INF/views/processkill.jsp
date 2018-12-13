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
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/processkillStart.json" class="button"><span>开启压测</span></a>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/processkillStop.json" class="button"><span>停止压测</span></a>
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
                    <li>具体表现:java进程被系统杀掉</li>
                    <li>检查相关的日志文件（/var/log/messages）查看是否有类似的 Out of memory: Kill process 信息</li>
                    <li>检查jvm参数，设置的堆区，栈区，永久代等内存之和是否超过系统能给出的最大值，若超出，则重新设置适当的参数值</li>
                </ul>
            </dd>
        </dl>
    </div>
</div>
