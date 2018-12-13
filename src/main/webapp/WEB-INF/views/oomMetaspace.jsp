<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include  file="/WEB-INF/share/header.jsp"%>
<h2 class="contentTitle">HSF限流</h2>
<div class="pageContent">

    <div class="pageFormContent" layoutH="97">
        <dl class="nowrap">
            <dt>测试说明：</dt>
            <dd>
                本页面主要是测试持久代溢出(jdk8以上版本测试)
                <ul>
                    <li>1.[本系统]点击[开启压测]</li>
                    <li>2.[本系统]停止压测</li>
                </ul>
            </dd>
        </dl>
        <dl class="nowrap">
            <dt>测试功能：</dt>
            <dd>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/oomMetaspaceStart.json" class="button"><span>开启压测</span></a>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/oomMetaspaceStop.json" class="button"><span>停止压测</span></a>
            </dd>
        </dl>
        <%--<dl class="nowrap">--%>
            <%--<dt>当前状态：</dt>--%>
            <%--<dd>--%>
                <%--<ul>--%>
                    <%--<li>压测开始时间:<%=DateFormatUtils.getDateTimeStr(OomPermanentTimer.BEGIN_TIME)%></li>--%>
                    <%--<li>压测总次数：<%=OomPermanentTimer.TOTAL.get()%></li>--%>
                    <%--<li>压测错误次数：<%=OomPermanentTimer.ERROR.get()%></li>--%>
                <%--</ul>--%>
            <%--</dd>--%>
        <%--</dl>--%>
        <dl class="nowrap">
            <dt>排查步骤：</dt>
            <dd>
                <ul>
                    <li>1.通过-XX:MetaspaceSize设置初始元空间大小 -XX:MaxMetaspaceSize来调大元空间大小</li>
                    <li>2.排查代码中是否存在通过字节码生成技术（比如CGLib）来实现一些增强的功能，这种情况可能需要更大的方法区来存储动态生成的Class文件</li>
                    <li>3.检查代码中是否有groovy脚本使用不当</li>
                </ul>
            </dd>
        </dl>
    </div>
</div>
