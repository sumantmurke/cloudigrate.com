<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CloudIgrate - Sign Up</title>

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

function checkEmail(emailField){
    //var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    var reg = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
    alert("inside email");
    if (reg.test(emailField) == false) 
    {
        alert('Invalid Email Address');
        return false;
    }
    return true;
}       

function checkPasswordMatch(){
	    var password = $("#password").val();	    
	    var confirmPassword = $("#confirmpassword").val();	    
	    if (password != confirmPassword)
	    	alert("Passwords do not match");
	    	//$("#divCheckPasswordMatch").html("Passwords do not match!");
	    else{	    		
	        //$("#divCheckPasswordMatch").html("");  
	    }
	}
			   
function uploadFormData(){	
	//$("#confirmPassword").keyup(checkPasswordMatch());	 
		var fname = $('#firstname').val();
		var lname = $('#lastname').val();
		var email = $('#email').val();
		var password = $('#password').val();
		var phonenumber = $('#phonenumber').val();
		var creditcard = $('#creditcard').val();		   
		if (fname == "" || lname == "" || email == "" || password == "" || phonenumber == "" || creditcard == ""){
		 	alert("All fields are compulsory");			
		}
		else{   
			$.ajax({
				url : "signup",
			    type: "POST",
			    data : "fname=" + fname + "&lname=" + lname + "&email=" + email + "&password=" + password + "&phonenumber" + phonenumber + "&creditcard" + creditcard,			 
			    success:function(data, textStatus, jqXHR){
			    	alert('success');
			    	window.location.href="getIndex";
			    },
			    error: function(jqXHR, textStatus, errorThrown){
			    	alert('Could not process request.. ' + errorThrown);
			    	window.location.href="getHome";
			    }
			});
		}
}
		
function checkPhoneNumber(phonenumber)  
{  
	alert("Inside phone number");
	var reg = /^\d{10}$/;
	//var reg = ^[1-9]([0-9]{1,45}$);
	if (reg.test(phonenumber) == false) 
    {
        alert('Invalid Phone Number');
        return false;
    }
    return true;  
}  

function checkCreditCard(creditcardnumber)  
{  	
	var reg = /^\d{16}$/;
    if (reg.test(creditcardnumber) == false) 
    {
        alert('Invalid Credit Card');
        return false;
    }
    return true;  
}  

</script>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">CloudIgrate - Sign Up</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form">
                            <fieldset>
                            	<div class="form-group">
                                    <input class="form-control" id = "firstname" placeholder="First Name" name="First Name" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id = "lastname" placeholder="Last Name" name="Last Name" type="text"> 
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id = "email" placeholder="E-mail" name="email" type="email" onChange = "checkEmail(this.value)">
                                </div>
                                <div class="form-group">                               
                                    <input class="form-control" id = "password" placeholder="Password" name="password" type="password" value="" onChange="checkPassword()">                                    
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id = "confirmpassword" placeholder="Confirm Password" name="confirmpassword" type="password" value="" onChange="checkPasswordMatch()">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id = "phonenumber" placeholder="Phone Number" name="Phone Number" onChange ="checkPhoneNumber(this.value)">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id = "creditcard" placeholder="Credit Card Number" name="Credit Card" type="text" onChange = "checkCreditCard(this.value)">
                                </div>
                                <!--  
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                -->
                                <!-- Change this to a button or input when using this as a form -->
                                <a class="btn btn-lg btn-success btn-block" onclick="uploadFormData()">Sign Up</a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

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
