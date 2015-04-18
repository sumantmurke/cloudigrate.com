<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CloudIgrate - Log In</title>

    <!-- Bootstrap Core CSS -->
    <link href="startbootstrap-sb-admin-2-1.0.5/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="startbootstrap-sb-admin-2-1.0.5/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="startbootstrap-sb-admin-2-1.0.5/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="startbootstrap-sb-admin-2-1.0.5/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript">

function userLogin(){
	 alert('inside Login page');
	   var email = $('#email').val();
	   var password = $('#password').val();	  
}	   
	   
function checkEmail(emailField){	
	//var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
	var reg = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;	
	if (reg.test(emailField) == false) 
	{
	    alert('Invalid Email Address');
	    return false;
	}
	return true;
}   	   
		/* 	 
	alert('Username : '+email);
	   
		$.ajax({
			url : "login",
		    type: "POST",
		    data : "email=" + email + "&password=" + password,
	
		    success:function(data, textStatus, jqXHR){			    	
		    		alert('success');
			    	//window.location.href="getIndex";
			    },
		    error: function(jqXHR, textStatus, errorThrown){
		    	alert('Could not process request.. ' + errorThrown);
		    	window.location.href="login";
		    } 
		};
/}*/
</script>

</head>

<body>

    <div class="container">
        <div class="row" style= "height: 770px">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">CloudIgrate - Log In</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" id="mailajob" method="post" action="login">
                            <fieldset>                            	
                                <div class="form-group">
                                    <input class="form-control" id = "email" placeholder="E-mail" name="email" type="email" onChange = "checkEmail(this.value)" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id = "password" placeholder="Password" name="password" type="password" value="">
                                </div>       
                                <!--                          
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div> -->                                 
                                <!-- Change this to a button or input when using this as a form -->
                                <!-- <button type="submit" class="btn btn-primary" style= "margin-left:45px" id="login" onclick="userLogin()">LogIn</button> -->
                                
                                <a  type="submit" class="btn btn-lg btn-primary btn-block" onclick=" document.getElementById('mailajob').submit();">Log In</a>
                                <a href="getSignup" class="btn btn-lg btn-primary btn-block" >Not a member? SignUp</a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
	
	<footer class="footer" >
      <div class="container" style = "height:40px">
        <p class="text-muted" style = "margin:10px; text-align: right"> � 2015 CloudIgrate Inc. All Rights Reserved.</p>
      </div>     
    </footer>
    <!-- jQuery -->
    <script src="startbootstrap-sb-admin-2-1.0.5/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="startbootstrap-sb-admin-2-1.0.5/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="startbootstrap-sb-admin-2-1.0.5/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="startbootstrap-sb-admin-2-1.0.5/dist/js/sb-admin-2.js"></script>

</body>

</html>
