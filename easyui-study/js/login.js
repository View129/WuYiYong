$(function (){
	//登陆界面
	$("#login").dialog({
		title : '登陆后台',
		width : 300,
		height : 180,
		modal :true,
		buttons : '#btn',
	});

	//账号验证
	$("#manager").validatebox({
		required : true,
		missingMessage : '请输入账号',
		invalidMessage : '账号不能为空',
	});
	//密码验证
	$("#password").validatebox({
		required : true,
		validType : 'length[6,16]',
		missingMessage : '请输入密码',
		invalidMessage : '密码不为空，且长度6-16',
	});
	//加载完成时
	if(!$("#manager").validatebox('isValid')) {
			$("#manager").focus();
		}else if(!$("#password").validatebox('isValid')){
			$("#password").focus();
		}
	//点击登陆时
	$("#btn a").click(function() {
		if(!$("#manager").validatebox('isValid')) {
			$("#manager").focus();
		}else if(!$("#password").validatebox('isValid')){
			$("#password").focus();
		}else{
			$.ajax({
				url : '',
				type : 'post',
				data : {
					manager : $('#manger').val(),
					password : $('#password').val(),
				},
				beforeSend : function (){
					$.messager.progress({
						text : '正在登陆中。。。',
					});
				},
				success : function (data,response,status){
					$.messager.progress('close');
					
				}
			});
		}
	});

});