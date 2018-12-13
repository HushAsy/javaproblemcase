<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include  file="/WEB-INF/share/header.jsp"%>
<h2 class="contentTitle">cpu us高</h2>
<div class="pageContent">

    <div class="pageFormContent" layoutH="97">
        <dl class="nowrap">
            <dt>测试说明：</dt>
            <dd>
                本页面主要是测试cpu us高。
                <ul>
                    <li>1.[本系统]点击[开启压测]</li>
                    <li>2.[本系统]停止压测</li>
                </ul>
            </dd>
        </dl>

        <dl class="nowrap">
            <dt>测试功能：</dt>
            <dd>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/cpuUsHighStart.json" class="button"><span>开启压测</span></a>
                <a target="ajaxTodo" href="${pageContext.request.contextPath}/test/cpuUsHighStop.json" class="button"><span>停止压测</span></a>
            </dd>
        </dl>
        <div class="divider"></div>
        <dl class="nowrap">
            <dt>排查步骤：</dt>
            <dd>
                <ul>
                    <li>方法1:</li>
                    <li>1.从github上复制https://github.com/oldratlee/useful-scripts/blob/master/show-busy-java-threads,复制到linux的/usr/local下面</li>
                    <li>2.执行show-busy-java-threads.sh该脚本，即可查看占用cpu较多的java线程栈信息</li>
                    <li>方法2:</li>
                    <li>1.查看cpu的使用率，找出占用率最高的进程号</li>
                    <li>2.根据进程号获得该进程底下相应的线程占用cpu的情况</li>
                    <li>3.查找占用cpu较高的线程号，并通过命令转化为16进制</li>
                    <li>4.将进程的堆栈信息输出到文件中</li>
                    <li>5.在文件中查找nid等于上述中线程占用率最高的16进制数，可以定位到代码准确位置</li>
                </ul>
            </dd>
        </dl>
    </div>
</div>
