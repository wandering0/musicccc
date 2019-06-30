var script = document.createElement("script");
script.type = "text/javascript";
script.src = "jquery-2.1.0.js"

document.getElementsByTagName('head')[0].appendChild(script);

$(document).ready(function() {


	$("#login").click(function() {
		$("#btn_loginOrRe").text("登录")
		$("#confirmPwd").remove()
	})
	$("#register").click(function() {
		$("#btn_loginOrRe").text("注册")
		var formGroup = '<div class="form-group" id="confirmPwd">' +
			'<label for="message-text" class="control-label">确认密码:</label>' +
			'<input type="text" class="form-control" id="message-text"/>' +
			'</div>'

		if($(".modal-body").find("form").children().length < 3)
			$(".modal-body").find("form").append(formGroup)
	})

	$("#playerBtn").click(

		function () {

	})

	$("#mouseBlock").mouseover(
		function(){
			$("#playerBar").stop(true).animate({
				height:'50px'
			},1000)
		}
	);

	$("#playerBar").mouseleave(
		function(){
			$("#playerBar").stop(true).animate({
				height:'0px'
			},1000)
		}
	);

});