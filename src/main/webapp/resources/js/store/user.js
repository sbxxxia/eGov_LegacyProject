var user = user || {}
user = (function(){
	let _, javascript, session
	let init = function(){
		_ = sessionStorage.getItem('context')
		javascript = sessionStorage.getItem('javascript'),
		session = sessionStorage.getItem('session')
	}
	let join = function(payload){
		$.ajax({
			url: _+`/account/users`,
			type: 'POST',
			data: $("joinForm").serialize(),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				location.href = _+`/location/user/Login`
			},
			error: function(err){
				location.href = _+`/location/user/Join`
			}
		})
	}
	let login = function(payload){
		$.ajax({
			url : _+`/account/users/${payload.userid}`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				location.href = _+`/location/user/Login`
			},
			error: function(err){
				location.href = _+`/location/user/Login`
			}
		})
	}
	let logout = function(){
		sessionStorage.removeItem('userid')
		sessionStorage.removeItem('context')
		sessionStorage.removeItem('javascript')
		sessionStorage.removeItem('css')
		sessionStorage.removeItem('image')
	}
})()

