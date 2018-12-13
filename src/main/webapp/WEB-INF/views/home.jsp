<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>JAVA常见问题排查</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/editor.md/css/editormd.min.css" />
<link href="${pageContext.request.contextPath}/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${pageContext.request.contextPath}/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${pageContext.request.contextPath}/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<link href="${pageContext.request.contextPath}/resources/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>
<!--[if IE]>
<link href="${pageContext.request.contextPath}/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->

<!--[if lt IE 9]><script src="${pageContext.request.contextPath}/resources/js/speedup.js" type="text/javascript"></script><script src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js" type="text/javascript"></script><![endif]-->
<!--[if gte IE 9]><!--><script src="${pageContext.request.contextPath}/resources/js/jquery-2.1.4.min.js" type="text/javascript"></script><!--<![endif]-->

<script src="${pageContext.request.contextPath}/resources/js/jquery.cookie.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.validate.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/xheditor/xheditor-1.2.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/uploadify/scripts/jquery.uploadify.js" type="text/javascript"></script>

<!-- svg图表  supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+ -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/chart/raphael.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/chart/g.raphael.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/chart/g.bar.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/chart/g.line.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/chart/g.pie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/chart/g.dot.js"></script>

<script src="${pageContext.request.contextPath}/resources/js/dwz.core.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.util.date.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.validate.method.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.barDrag.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.drag.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.tree.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.accordion.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.ui.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.theme.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.switchEnv.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.alertMsg.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.contextmenu.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.navTab.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.tab.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.resize.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.dialog.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.dialogDrag.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.sortDrag.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.cssTable.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.stable.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.taskBar.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.ajax.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.pagination.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.database.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.datepicker.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.effects.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.panel.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.checkbox.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.history.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.combox.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/dwz.print.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/editor.md/editormd.js"></script>

<!-- 可以用dwz.min.js替换前面全部dwz.*.js (注意：替换时下面dwz.regional.zh.js还需要引入)
<script src="${pageContext.request.contextPath}/resources/bin/dwz.min.js" type="text/javascript"></script>
-->
<script src="${pageContext.request.contextPath}/resources/js/dwz.regional.zh.js" type="text/javascript"></script>

<script type="text/javascript">
$(function(){
	DWZ.init("${pageContext.request.contextPath}/resources/dwz.frag.xml", {
//		loginUrl:"${pageContext.request.contextPath}/login", loginTitle:"登录",	// 弹出登录对话框
		loginUrl:"${pageContext.request.contextPath}/",	// 跳到登录页面
		statusCode:{ok:200, error:300, timeout:301}, //【可选】
		pageInfo:{pageNum:"pageNumber", numPerPage:"pageSize", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
		keys: {statusCode:"statusCode", message:"message"}, //【可选】
		ui:{hideMode:'offsets'}, //【可选】hideMode:navTab组件切换的隐藏方式，支持的值有’display’，’offsets’负数偏移位置的值，默认值为’display’
		debug:false,	// 调试模式 【true|false】
		callback:function(){
			initEnv();
			$("#themeList").theme({themeBase:"themes"}); // themeBase 相对于index页面的主题base路径
		}
	});
});

</script>
</head>

<body>
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<ul class="themeList" id="themeList">
					<li theme="default"><div class="selected">蓝色</div></li>
					<li theme="azure"><div>天蓝</div></li>
				</ul>
			</div>

			<!-- navMenu -->
			
		</div>

		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse"><h2>主菜单</h2><div>收缩</div></div>
				<div class="accordion" fillSpace="sidebar">
					<div class="accordionContent">
						<ul class="tree treeFolder">
							<li><a>功能测试</a>
								<ul>
									<li><a href="${pageContext.request.contextPath}/processkill" target="navTab" rel="processkill">java进程退出</a></li>
									<li><a href="${pageContext.request.contextPath}/cpuUsHigh" target="navTab" rel="cpuUsHigh">cpu us高</a></li>
									<li><a href="${pageContext.request.contextPath}/cpuSyHigh" target="navTab" rel="cpuSyHigh">cpu sy高</a></li>
									<li><a href="${pageContext.request.contextPath}/cpuIoWaitHigh" target="navTab" rel="cpuIoWaitHigh">cpu iowait高</a>
									<li><a href="${pageContext.request.contextPath}/oomHeap" target="navTab" rel="oomHeap">堆区溢出</a>
									<li><a href="${pageContext.request.contextPath}/oomPermanent" target="navTab" rel="oomPermanent">持久代溢出</a>
									<li><a href="${pageContext.request.contextPath}/oomStack" target="navTab" rel="oomStack">栈区溢出</a>
									<li><a href="${pageContext.request.contextPath}/oomMetaspace" target="navTab" rel="oomStack">元空间溢出</a>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader">
					<div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
							<li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
						</ul>
					</div>
					<div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div>
				<ul class="tabsMoreList">
					<li><a href="javascript:;">我的主页</a></li>
				</ul>
				<div class="navTab-panel tabsPageContent layoutBox">
					<div class="page unitBox">
					<div>					
				</div>
			</div>
		</div>

	</div>

	<div id="footer">Copyright &copy; 2016  EDAS</div>
		</div>
	</div>
</body>
</html>