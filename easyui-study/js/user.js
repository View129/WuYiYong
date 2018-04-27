$(function(){

	$("#box").datagrid({
		width:600,
		url : 'http://localhost:8080/user/list',
		title:'管理员列表',
		iconCls : 'icon-search',
		columns : [[
			{
				field : 'userName',
				title : '账号',
			},
			{
				field : 'password',
				title : '密码',
			},
			{
				field : 'rank',
				title : '权限',
			},
		]],
	});
});