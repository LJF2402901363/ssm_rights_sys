<%--
  Created by IntelliJ IDEA.
  User: 陌意随影
  Date: 2020/9/15 0015
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>找回密码</title>

    <!-- Google Font: Source Sans Pro -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/plugins/fontawesome-free/css/all.min.css">
    <!-- icheck bootstrap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
    <!-- icheck bootstrap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
</head>
<body class="hold-transition register-page">
<div class="register-box">
    <div class="register-logo">
        <a href="#"><b>找回密码页面</b></a>
    </div>

    <div class="card">
        <div class="card-body register-card-body">
            <form action="#" method="post">
                <div class="input-group mb-3">
                    <input type="text" name="name" class="form-control" placeholder="Full name">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-user"></span>
                        </div>
                    </div>
                </div>

                <div class="input-group mb-3">
                    <input type="password" name="password" id="password1" class="form-control" placeholder="Enter new password">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-lock"></span>
                        </div>
                    </div>
                </div>
                <div class="input-group mb-3">
                    <input type="password" class="form-control" id="password2" placeholder="confirm new password">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-lock"></span>
                        </div>
                    </div>
                    <div class="input-group mb-3">
                        <input type="email" name="email" id="email" class="form-control" placeholder="Email">
                        <div class="input-group-append">
                            <div class="input-group-text">
                                <span class="fas fa-envelope"></span>
                            </div>
                        </div>
                        <button type="button" class="btn btn-primary btn-sm" id="sendCodeBtn">发送验证码</button>
                    </div>
                    <div class="form-group">
                        <input type="text" id="codeTextId" class="form-control is-valid" id="inputSuccess" placeholder="请输入验证码">
                    </div>
                </div>
                <div class="row">
                    <!-- /.col -->
                    <div class="col-4">
                        <button type="button" id="registerBtn" class="btn btn-primary btn-block" disabled>找回密码</button>
                    </div>
                    <!-- /.col -->
                </div>
            </form>
        </div>
        <!-- /.form-box -->
    </div><!-- /.card -->
</div>
<!-- /.register-box -->
<script src="${pageContext.request.contextPath}/dist/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/dist/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/dist/js/adminlte.min.js"></script>
<script>
    $(function () {
        //发送验证码按钮的60s倒计时
        var countdown = 5;
        //返回的验证码
        var verifyCode=0;
        function settime(obj) {
            if (countdown == 0) {
                obj.attr('disabled', false);
                obj.text("发送验证码");
                countdown = 5;
                return;
            } else {
                obj.attr('disabled', true);
                obj.text("重新发送(" + countdown + ")");
                countdown--;
                $('#sendCodeBtn').css('background', '#999')
            }
            setTimeout(function() {
                settime(obj)
            }, 1000)
        }
        $("#sendCodeBtn").click(function () {
            $.ajax({
                "url":"${pageContext.request.contextPath}/email/send",
                "data":{"email":$("#email").val()},
                "dataType":"json",
                "type":"post",
                "success":function (data) {
                    verifyCode =data.verifyCode;
                    alert(verifyCode);
                    $("#codeTextId").attr("class","form-control is-invalid");
                },
                "error":function () {
                    alert("发送验证码失败！");
                }
            });
            settime($('#sendCodeBtn'));
        });
        $("#codeTextId").bind("input propertychange",function(event){
            if(verifyCode==$("#codeTextId").val()){
                $("#codeTextId").attr("class","form-control is-valid");
            }else {
                $("#codeTextId").attr("class","form-control is-invalid");
            }
        });
        //给注册按钮添加点击事件
        $("#agreeTerms").click(function () {
            if ($("#agreeTerms").prop("checked")==true){
                $("#registerBtn").removeAttr("disabled");
            }else {
                $("#registerBtn").attr("disabled",'disabled');
            }
        });
    })
</script>
</body>
</html>


