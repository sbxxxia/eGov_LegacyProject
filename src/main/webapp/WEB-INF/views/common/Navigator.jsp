<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header
	class="v-sheet theme--light v-toolbar v-app-bar v-app-bar--fixed transparent"
	style="height: 64px; margin-top: 0px; transform: translateY(0px); left: 0px; right: 0px;"
	data-booted="true">
	<div class="v-toolbar__content" style="height: 64px;">
		<div class="d-flex align-center">
			<div class="v-image v-responsive theme--light" id="img"
				style="width: 60px;">
				<div class="v-responsive__sizer" style="padding-bottom: 100%;"></div>
				<div class="v-image__image v-image__image--contain"
					style="background-image: url(&quot;https://i7.pngflow.com/pngimage/280/90/png-hospital-health-care-medicine-health-sign-medicine-medical-care-patient-clipart.png&quot;); background-position: center center;"></div>
				<div class="v-responsive__content" style="width: 880px;"></div>
			</div>
			<a href="/web" 
			   aria-current="page"
			   class="router-link-exact-active router-link-active">
				<h1 class="display-1 black--text font-weight-thin font-italic ml-5 mr-16">hospice palliative care</h1>
			</a>
		</div>
		<div class="flex ml-16 sm3">
			<div
				class="v-input v-input--is-label-active v-input--is-dirty theme--light v-text-field v-text-field--single-line v-text-field--is-booted">
				<div class="v-input__control">
					<div class="v-input__slot">
						<div class="v-text-field__slot">
							<input id="input-11" type="text">
						</div>
						<div class="v-input__append-inner">
							<div class="v-input__icon v-input__icon--append">
								<i aria-hidden="true"
									class="v-icon notranslate material-icons theme--light">search</i>
							</div>
						</div>
					</div>
					<div class="v-text-field__details">
						<div class="v-messages theme--light">
							<div class="v-messages__wrapper"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="spacer"></div>
		
		<c:choose>
			<c:when test="${empty session}">
				<a id="navi_join_btn" class="">
					<button type="button"
							class="v-btn v-btn--flat v-btn--text theme--light v-size--default"
							flat="">
						<span class="v-btn__content"><span class="black--text">
							회원가입
						</span><i aria-hidden="true"
								  class="v-icon notranslate mdi mdi-open-in-new theme--light"></i></span>
					</button>
				</a>
				<a id="navi_login_btn" class="">
					<button type="button"
							class="v-btn v-btn--flat v-btn--text theme--light v-size--default"
							flat="">
						<span class="v-btn__content"><span class="black--text">
							로그인
						</span><i aria-hidden="true"
								  class="v-icon notranslate mdi mdi-open-in-new theme--light"></i></span>
					</button>
				</a>
			</c:when>
			
			<c:when test="${session.accessCode eq 'admin'}">
				<a id="navi_connecting_btn" class="">
					<button type="button"
							class="v-btn v-btn--flat v-btn--text theme--light v-size--default"
							flat="">
						<span class="v-btn__content"><span class="black--text">
							접속중
						</span><i aria-hidden="true"
								  class="v-icon notranslate mdi mdi-open-in-new theme--light"></i></span>
					</button>
				</a>
				<a id="navi_disconnection_btn" class="">
					<button type="button"
							class="v-btn v-btn--flat v-btn--text theme--light v-size--default"
							flat="">
						<span class="v-btn__content"><span class="black--text">
							접속해제
						</span><i aria-hidden="true"
								  class="v-icon notranslate mdi mdi-open-in-new theme--light"></i></span>
					</button>
				</a>
			</c:when>
			
			<c:otherwise>
				<a id="navi_logout_btn" class="">
					<button type="button"
							class="v-btn v-btn--flat v-btn--text theme--light v-size--default"
							flat="">
						<span class="v-btn__content"><span class="black--text">
							로그아웃
						</span><i aria-hidden="true"
								  class="v-icon notranslate mdi mdi-open-in-new theme--light"></i></span>
					</button>
				</a>
				<a id="navi_withdrawal_btn" class="">
					<button type="button"
							class="v-btn v-btn--flat v-btn--text theme--light v-size--default"
							flat="">
						<span class="v-btn__content"><span class="black--text">
							회원탈퇴
						</span><i aria-hidden="true"
								  class="v-icon notranslate mdi mdi-open-in-new theme--light"></i></span>
					</button>
				</a>	
			</c:otherwise>
		</c:choose>
	</div>
</header>
<script>
	$('#navi_join_btn').click(function(e){
		e.preventDefault()
		location.href = `${context}/location/user/Join`
	})
	$('#navi_login_btn').click(function(e){
		e.preventDefault()
		location.href = `${context}/location/user/Login`
	})
	
</script>