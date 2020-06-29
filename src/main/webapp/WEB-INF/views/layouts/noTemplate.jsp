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

			<tiles:insertAttribute name="noTemplate" />

		</div>
	</div>
</body>
<script>
</script>
</html>