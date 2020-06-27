<script>
	$('#join_btn').click(function(e) {
		e.preventDefault()
		location.href = "${context}/account/join/form"
	})
	$('#login_btn').click(function(e) {
		e.preventDefault()
		location.href = "${context}/account/login/form"
	})
</script>