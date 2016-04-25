<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 菜单栏 -->
<div class="easyui-panel" style="padding:2px;">
	<a id="btn-home" href="#" class="easyui-menubutton" data-options="plain:true">文件</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm1',iconCls:'icon-edit'">编辑</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm2'">源文件</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm3'">重构</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm4'">导航</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm5'">搜索</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm5'">项目</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm6'">运行</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm7'">窗口</a>
	<a href="#" class="easyui-menubutton" data-options="menu:'#mm8',iconCls:'icon-help'">帮助</a>
</div>
<div id="mm1" style="width:150px;">
	<div data-options="iconCls:'icon-undo'">撤销</div>
	<div data-options="iconCls:'icon-redo'">重做</div>
	<div class="menu-sep"></div>
	<div>剪切</div>
	<div>拷贝</div>
	<div>粘贴</div>
	<div class="menu-sep"></div>
	<div>
		<span>Toolbar</span>
		<div>
			<div>Address</div>
			<div>Link</div>
		</div>
	</div>
	<div data-options="iconCls:'icon-remove'">删除</div>
	<div>选中全部</div>
</div>
<div id="mm2" style="width:100px;">
</div>
<div id="mm3">
</div>
<div id="mm4">
</div>
<div id="mm5">
</div>
<div id="mm6">
</div>
<div id="mm7">
</div>
<div id="mm8">
	<div>Help</div>
	<div>Update</div>
	<div>About</div>
</div>