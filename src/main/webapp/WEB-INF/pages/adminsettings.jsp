<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CloudIgrate</title>

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
function uploadFormData(){	
	var instance_value, sql_value, nosql_value, storage_value;
	
if (document.getElementById('Instance_aws').checked) {
	 instance_value = document.getElementById('Instance_aws').value;
	}    
if (document.getElementById('Instance_google').checked) {
	 instance_value = document.getElementById('Instance_google').value;
	} 
if (document.getElementById('SQL_aws').checked) {
	sql_value = document.getElementById('SQL_aws').value;
	}    
if (document.getElementById('SQL_google').checked) {
	 sql_value = document.getElementById('SQL_google').value;	 
	}
if (document.getElementById('NoSQL_aws').checked) {
	nosql_value = document.getElementById('NoSQL_aws').value;
	}    
if (document.getElementById('NoSQL_google').checked) {
	nosql_value = document.getElementById('NoSQL_google').value;
	}
if (document.getElementById('Storage_aws').checked) {
	 storage_value = document.getElementById('Storage_aws').value;
	}    
if (document.getElementById('Storage_google').checked) {
	storage_value = document.getElementById('Storage_google').value;
	} 
	alert("You have changed the preference!!");
  
	/* $.ajax({
		url : "adminpreference",
    	type: "POST",
    	data : "instance_value=" + instance_value + "&sql_value=" + sql_value + "&nosql_value=" + nosql_value + "&storage_value=" + storage_value,
   
    	success:function(textStatus, jqXHR){
    		alert('success');
   			window.location.href="adminsettings";
    	},
    	error: function(jqXHR, textStatus, errorThrown){
    	alert('Could not process request.. ' + errorThrown);
    	//	window.location.href="getHome";
    	}
	}); */
}
</script>
</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="getAdmindashboard">CloudIgrate</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">                
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Instance</strong>
                                        <span class="pull-right text-muted">40% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>SQL</strong>
                                        <span class="pull-right text-muted">20% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                            <span class="sr-only">20% Complete</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>NoSQL</strong>
                                        <span class="pull-right text-muted">60% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Storage</strong>
                                        <span class="pull-right text-muted">80% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete (danger)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Tasks</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-tasks -->
                </li>
                <!-- /.dropdown -->                
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="getAdminprofile"><i class="fa fa-user fa-fw"></i> Admin Profile</a>
                        </li>  
                        <li><a href="adminpreference"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>                      
                        <li class="divider"></li>
                        <li><a href="getHome"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                        <li>
                            <a href="getAdmindashboard"><i class="fa fa-dashboard fa-fw"></i> Admin Dashboard</a>
                        </li>                                     
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
        

<!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid" style= "width:600px">
                <div class="row">
                    <div class="col-lg-12">
                    	<h2 class="page-header" style = "text-align: center"><strong><em>Admin Settings</em></strong></h2>                        
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->                
                <form>                	                
                	<table class="table table-striped">
                		<tr>                		
					  		<td>					  	
					    	<label style= "margin: 25px" for="First Name">Instance</label>
					    	</td>
					    	<td>					    	
					    	<div class="radio">
							  <label>
							    <input type="radio" name="optionsRadios1" id="Instance_aws" value="AWS" checked>
							    Amazon Web Services
							  </label>
							</div>
							<div class="radio">
							  <label>
							    <input type="radio" name="optionsRadios1" id="Instance_google" value="GOOGLE">
							    Google Cloud Platform
							  </label>
							</div>												    	
					    	<!-- 
					    	<select>
							  <option value="Amazon Web Services">Amazon Web Services</option>
							  <option value="Google Cloud Platform">Google Cloud Platform</option>							  
							</select>	
							 -->				    						    						    						    				    						    						    	 					    							 							 							 
							</td>
					 	<!-- </div>  -->
					 	</tr>					 
					 	
					 	<tr>                		
					  		<td>					  	
					    	<label style= "margin: 25px" for="First Name">SQL </label>
					    	</td>
					    	<td>					    						  						    					    	
					    	<div class="radio">
							  <label>
							    <input type="radio" name="optionsRadios2" id="SQL_aws" value="AWS" checked>
							    Amazon Web Services
							  </label>
							</div>
							<div class="radio">
							  <label>
							    <input type="radio" name="optionsRadios2" id="SQL_google" value="GOOGLE">
							    Google Cloud Platform
							  </label>
							</div>
							</td>							 												 
					 	</tr>
					 	
					 	<tr>                		
					  		<td>					  	
					    	<label style= "margin: 25px" for="First Name">NoSQL </label>
					    	</td>
					    	<td>
					    	<div class="radio">
							  <label>
							    <input type="radio" name="optionsRadios3" id="NoSQL_aws" value="AWS" checked>
							    Amazon Web Services
							  </label>
							</div>
							<div class="radio">
							  <label>
							    <input type="radio" name="optionsRadios3" id="NoSQL_google" value="GOOGLE">
							    Google Cloud Platform
							  </label>
							</div>
							</td>					 	
					 	</tr>
					 	
					 	<tr>                		
					  		<td>					  	
					    	<label style= "margin: 25px" for="First Name">Storage </label>
					    	</td>
					    	<td>
					    	<div class="radio">
							  <label>
							    <input type="radio" name="optionsRadios4" id="Storage_aws" value="AWS" checked>
							    Amazon Web Services
							  </label>
							</div>
							<div class="radio">
							  <label>
							    <input type="radio" name="optionsRadios4" id="Storage_google" value="GOOGLE">
							    Google Cloud Platform
							  </label>
							</div>
					    	<!-- 
					    	<div class="btn-group">
						  		<button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-expanded="false" style = "color:">
						    	Choose the Cloud Vendor <span class="caret"></span>
						  		</button>
						  		<ul class="dropdown-menu" role="menu">
							    <li><a href="#">Amazon Web Services</a></li>
							    <li><a href="#">Google Cloud Platform</a></li>					    
						  		</ul>					  
							</div>
							 -->
							</td>					 	
					 	</tr>					 	
					  </table>		
					  			  
					  <a class="btn btn-primary center-block" type="button" onclick="uploadFormData()">Apply Changes</a>					  
					  <!-- <a class="btn btn-lg btn-primary btn-block" onclick="uploadFormData()">Apply Changes</a>  -->					  
					  <!-- <button id="editApp" class="btn btn-primary" type="button" onclick="editApp()">Update your Application</button> -->
					  <!-- <button type="submit" class="btn btn-default">Submit</button>  -->
				</form>                        
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->
    </div>
    
    <footer class="footer" >
      <div class="container" style = "height:40px">
        <p class="text-muted" style = "margin:10px; text-align: right"> � 2015 CloudIgrate Inc. All Rights Reserved.</p>
      </div>     
    </footer>
    <!-- /#wrapper -->

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
