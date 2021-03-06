var user = user || {}
user = (function(){
	let _, javascript, session
	
	let init = function(){
		_ = sessionStorage.getItem('context'),
		javascript = sessionStorage.getItem('javascript'),
		session = sessionStorage.getItem('session')
	}
	
	let join = function(payload){
		$.ajax({
			url: _+`/account/users`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				if(res){
					location.href = _+`/location/user/Login`
				} else {
					location.href = _+`/location/user/Join`
				}
			},
			error: function(err){
				
			}
		})
	}
	
	let login = function(payload){
		$.ajax({
			url : _+`/account/login`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert(JSON.stringify(res))
				location.href = _ +`/`
			},
			error: function(err){
				alert(err)
			}
		})
	}
	
	let logout = function(){
		sessionStorage.removeItem('userid')
		alert(sessionStorage.getItem('userid'))
		sessionStorage.removeItem('context')
		alert(sessionStorage.getItem('context'))
		sessionStorage.removeItem('javascript')
		sessionStorage.removeItem('session')
		location.href = _+`/`
	}
	
	let remove = function(){
		$.ajax()
		sessionStorage.removeItem('userid')
		sessionStorage.removeItem('context')
		sessionStorage.removeItem('javascript')
		sessionStorage.removeItem('css')
		sessionStorage.removeItem('image')
		location.href = _+`/`
		
	}
	
	return {init, join, login, logout, remove}
})()

