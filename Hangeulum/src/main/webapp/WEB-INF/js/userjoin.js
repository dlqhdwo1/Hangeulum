$('#joinBtn').click(function(){

	$('#nameDiv').empty();
	$('#idDiv').empty();
	$('#pwdDiv').empty();
	$('#birthDiv').empty();
	$('#phoneDiv').empty();
	$('#genderDiv').empty();
	$('#emailDiv').empty();
	
	if($('#username').val() == ''){
		$('#nameDiv').text('이름 입력');
		$('#username').focus();
		
	}else if($('#userid').val() == ''){
		$('#idDiv').text('아이디 입력');
		$('#userid').focus();
		
	}else if($('#password').val() == ''){
		$('#pwdDiv').text('비밀번호 입력');
		$('#password').focus();
	
	
	}else if($('#userbirth').val() == ''){
		$('#birthDiv').text('생일 입력');
		$('#userbirth').focus();
	
	
	}else if($('#userphone').val() == ''){
		$('#phoneDiv').text('휴대번호 입력');
		$('#userphone').focus();
	
	
	}else if($('#gender').val() == ''){
		$('#genderDiv').text('성별 입력');
		$('#gender').focus();
	
	}else if($('#useremail').val() ==''){
		$('#emailDiv').text('이메일 입력');
		$('#useremail').focus();
	}


	else{
	$.ajax({
		type:'post',
		url:'/Hangeulum/user/join',
		data:$('#joinForm').serialize(),
		success:function(){
			alert('회원가입을 축하합니다.');
			location.href='/Hangeulum/';
		
		},
		
		error: function(err){
			consolo.log(err);
		}
		
		});
	}
});

//아이디 중복체크
$('#userid').focusout(function(){
	$('#idDiv').empty();
	
	if($('#userid').val()==''){
		$('#idDiv').text('먼저 아이디를 입력');
		$('#userid').focus();
	}else{
		$.ajax({
		type:'post',
		url:'/Hangeulum/user/isExistId',
		data:'id='+$('#userid').val(), //서버로 보내는 데이터
		dataType:'text', //서버로부터 받는 데이터의 자료형 
		
					//아이디가 있으면 "exist" , 아이디가 없으면 "non_exist"
		success:function(data){
			if(data=='exist'){
				$('#idDiv').text('사용 불가능');
			}else if(data=='non_exist'){
				$('#idDiv').text('사용 가능');
				$('#idDiv').css('color','blue');
			}
			
		},
		error:function(err){
			console.log(err);
		}	
		});
		
	}
	
});