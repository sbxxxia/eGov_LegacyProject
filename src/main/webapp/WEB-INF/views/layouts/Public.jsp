<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html>
<tiles:insertAttribute name="header" />
</head>
<body>
	<div data-app="true"
		class="v-application v-application--is-ltr theme--light" id="app">
		<div class="v-application--wrap">
			<tiles:insertAttribute name="navigator" />

			<tiles:insertAttribute name="content" />

		</div>
	</div>
</body>
<script>
	new Vue({
		el : '#app',
		vuetify : new Vuetify(),
	})
</script>
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
</html>