<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<main class="v-main" style="padding: 64px 0px 0px;" data-booted="true">
	<div class="v-main__wrap">
		<div data-v-4c22b934="">
			<div data-v-ef68022e="" data-v-4c22b934="" class="container">
				<div data-v-ef68022e="" class="v-card v-sheet theme--light"
					style="position: relative; width:30%; margin-left:auto; margin-right:auto; margin-top:100px;">
					<div data-v-ef68022e="" 
						class="v-card__title headline grey lighten-2">Login</div>
					<form data-v-ef68022e="" novalidate="novalidate" class="v-form">
						<div data-v-ef68022e=""
							class="v-input mx-10 mt-10 theme--light v-text-field v-text-field--is-booted">
							<div class="v-input__control">
								<div class="v-input__slot">
									<div class="v-text-field__slot">
										<label for="input-94" class="v-label theme--light"
											style="left: 0px; right: auto; position: absolute;"></label>
											<input required="required" id="userid" type="text" placeholder="ID">
									</div>
								</div>
								<div class="v-text-field__details">
									<div class="v-messages theme--light">
										<div class="v-messages__wrapper"></div>
									</div>
								</div>
							</div>
						</div>
						<div data-v-ef68022e=""
							class="v-input mx-10 mb-10 theme--light v-text-field v-text-field--is-booted">
							<div class="v-input__control">
								<div class="v-input__slot">
									<div class="v-text-field__slot">
										<label for="input-97" class="v-label theme--light"
											style="left: 0px; right: auto; position: absolute;"></label><input
											required="required" id="password" type="password" placeholder="PW">
									</div>
								</div>
								<div class="v-text-field__details">
									<div class="v-messages theme--light">
										<div class="v-messages__wrapper"></div>
									</div>
								</div>
							</div>
						</div>
					</form>
					<hr data-v-ef68022e="" role="separator"
						aria-orientation="horizontal" class="v-divider theme--light">
					<div data-v-ef68022e="" class="v-card__actions">
						<a data-v-ef68022e="" href="../join"
							class="v-btn v-btn--contained v-btn--router theme--light v-size--default">
							<span class="v-btn__content"> 회원가입 </span></a>
						<div data-v-ef68022e="" class="spacer"></div>
						<button data-v-ef68022e="" type="button" id="login_btn"
							class="v-btn v-btn--contained theme--light v-size--default">
							<span class="v-btn__content"> 로그인 </span>
						</button>
					</div>
				</div>
			</div>
			<div data-v-4c22b934="" class="overlay-top"></div>
			<div data-v-4c22b934="" class="overlay-right"></div>
			<div data-v-4c22b934="" class="overlay-bottom"></div>
			<div data-v-4c22b934="" class="overlay-left"></div>
		</div>
	</div>
</main>
<!-- built files will be auto injected -->
<script src="${javascript}/store/user.js"></script>
<script>
document.getElementById('login_btn').addEventListener('click',function(e){
	e.preventDefault()
	user.login({"userid": document.getElementById('userid').value,
				"password": document.getElementById('password').value})
})
</script>
</body>
</html>