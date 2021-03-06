<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<main class="v-main" style="padding: 64px 0px 0px;" data-booted="true">
	<div class="v-main__wrap">
		<div data-v-4c22b934="">
			<div data-v-faec374c="" data-v-4c22b934="" class="container">
				<form data-v-faec374c="" novalidate="novalidate" class="v-form" style="position: relative; width:50%; margin-left:auto; margin-right:auto; margin-top:100px;">
					<div data-v-faec374c=""
						 class="v-input mt-16 mx-16 theme--light v-text-field v-text-field--is-booted">
						<div class="v-input__control">
							<div class="v-input__slot">
								<div class="v-text-field__slot">
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
					<div data-v-faec374c=""
						 class="v-input mx-16 theme--light v-text-field v-text-field--is-booted">
						<div class="v-input__control">
							<div class="v-input__slot">
								<div class="v-text-field__slot">
									<input id="password" name="password" required="required" type="text" placeholder="PW">
								</div>
							</div>
							<div class="v-text-field__details">
								<div class="v-messages theme--light">
									<div class="v-messages__wrapper"></div>
								</div>
								<div class="v-counter theme--light">0 / 10</div>
							</div>
						</div>
					</div>
					<div data-v-faec374c=""
						 class="v-input mx-16 theme--light v-text-field v-text-field--is-booted">
						<div class="v-input__control">
							<div class="v-input__slot">
								<div class="v-text-field__slot">
									<input id="name" name="name" required="required" type="text" placeholder="NAME">
								</div>
							</div>
							<div class="v-text-field__details">
								<div class="v-messages theme--light">
									<div class="v-messages__wrapper"></div>
								</div>
							</div>
						</div>
					</div>
					<div data-v-faec374c=""
						 class="v-input mx-16 theme--light v-text-field v-text-field--is-booted">
						<div class="v-input__control">
							<div class="v-input__slot">
								<div class="v-text-field__slot">
									<input required="required" id="birthday" type="text" placeholder="BIRTHDAY">
								</div>
							</div>
							<div class="v-text-field__details">
								<div class="v-messages theme--light">
									<div class="v-messages__wrapper"></div>
								</div>
							</div>
						</div>
					</div>
					<div data-v-faec374c=""
						class="v-input mb-16 mx-16 theme--light v-text-field v-text-field--is-booted">
						<div class="v-input__control">
							<div class="v-input__slot">
								<div class="v-text-field__slot">
									<input required="required" id="gender" type="text" placeholder="GENDER">
								</div>
							</div>
							<div class="v-text-field__details">
								<div class="v-messages theme--light">
									<div class="v-messages__wrapper"></div>
								</div>
							</div>
						</div>
					</div>
					<div data-v-faec374c=""
						class="v-input mb-16 mx-16 theme--light v-text-field v-text-field--is-booted">
						<div class="v-input__control">
							<div class="v-input__slot">
								<div class="v-text-field__slot">
									<input required="required" id="telephone" type="text" placeholder="telephone">
								</div>
							</div>
							<div class="v-text-field__details">
								<div class="v-messages theme--light">
									<div class="v-messages__wrapper"></div>
								</div>
							</div>
						</div>
					</div>
					<div data-v-faec374c=""
						class="v-input mb-16 mx-16 theme--light v-text-field v-text-field--is-booted">
						<div class="v-input__control">
							<div class="v-input__slot">
								<div class="v-text-field__slot">
									<input required="required" id="regDate" type="text" placeholder="regDate">
								</div>
							</div>
							<div class="v-text-field__details">
								<div class="v-messages theme--light">
									<div class="v-messages__wrapper"></div>
								</div>
							</div>
						</div>
					</div>
					<div data-v-faec374c=""
						class="v-input mb-16 mx-16 theme--light v-text-field v-text-field--is-booted">
						<div class="v-input__control">
							<div class="v-input__slot">
								<div class="v-text-field__slot">
									<input required="required" id="accessCode" type="text" placeholder="accessCode">
								</div>
							</div>
							<div class="v-text-field__details">
								<div class="v-messages theme--light">
									<div class="v-messages__wrapper"></div>
								</div>
							</div>
						</div>
					</div>
					<hr data-v-faec374c="" role="separator"
						aria-orientation="horizontal" 
						class="v-divider theme--light">
					<div data-v-faec374c="" class="v-card__actions">
						<a data-v-faec374c="" href="/"
							class="v-btn v-btn--contained v-btn--router theme--light v-size--default"><span
							class="v-btn__content"> 취소 </span></a>
						<div data-v-faec374c="" class="spacer"></div>
						<button data-v-faec374c="" type="button" id="signup_btn"
							class="v-btn v-btn--contained theme--light v-size--default">
							<span class="v-btn__content"> 회원가입 </span>
						</button>
					</div>
				</form>
			</div>
			<div data-v-4c22b934="" class="overlay-top"></div>
			<div data-v-4c22b934="" class="overlay-right"></div>
			<div data-v-4c22b934="" class="overlay-bottom"></div>
			<div data-v-4c22b934="" class="overlay-left"></div>
		</div>
	</div>
</main>
<script src="${javascript}/store/user.js"></script>
<script>
document.getElementById('signup_btn').addEventListener('click',function(e){
	e.preventDefault()
	user.init()
	user.join({"userid": document.getElementById('userid').value,
			   "password": document.getElementById('password').value,
			   "name": document.getElementById('name').value,
			   "birthday": document.getElementById('birthday').value,
			   "gender": document.getElementById('gender').value,
			   "telephone": document.getElementById('telephone').value,
			   "regDate": document.getElementById('regDate').value,
			   "accessCode": document.getElementById('accessCode').value})
})
</script>