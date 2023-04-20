$('#loginBtn').click(function(){

	
	$('#idDiv').empty();
	$('#pwdDiv').empty();

	if($('#userid').val() == ''){
		$('#idDiv').text('아이디 입력');
		$('#username').focus();
		
	}else if($('#userpassword').val() == ''){
		$('#pwdDiv').text('비밀번호 입력');
		$('#userpassword').focus();
	}
	
	else{
		$.ajax({
		type:'post',
		url:'/Hangeulum/user/login',
		data:$('#loginForm').serialize(),
		
		success:function(data){
			
			
			if(data=='success'){
				console.log(data);
				alert('로그인성공');
				location.href='/Hangeulum/';
			}else if(data=='fail'){
				console.log(data);
				console.log('로그인실패');
			}

		},
		
		error: function(err){
			consolo.log(err);
		}
		
		});
	}

});