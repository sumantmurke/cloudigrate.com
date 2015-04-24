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

</head>

<body onload="foo()">

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
                <a class="navbar-brand" href="getIndex">CloudIgrate</a>
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
                        <li><a href="userprofilepage"><i class="fa fa-user fa-fw"></i> User Profile</a>
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
                            <a href="#"><i class="fa fa-sitemap fa-fw"></i> API Methods<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                            	 <li>
                                    <a href="#">IAAS <span class="fa arrow"></span></a>
                                    <ul class="nav nav-third-level">
                                        <li>
                                            <a href="instanceAPI">Instance</a>
                                        </li>
                                    </ul>                                    
                                </li>
                                <li>
                                    <a href="#">PAAS <span class="fa arrow"></span></a>
                                    <ul class="nav nav-third-level">
                                        <li>
                                            <a href="sql">SQL</a>
                                        </li>
                                        <li>
                                            <a href="nosql">NoSQL</a>
                                        </li>
                                        <li>
                                            <a href="storageAPI">Storage</a>
                                        </li>
                                    </ul>
                                    <!-- /.nav-third-level -->
                                </li>
                                <li>
                                    <a href="#">SAAS</a>
                                </li> 
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="getIndex"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>                       
                        <li>
                            <a href="#"><i class="fa fa-sitemap fa-fw"></i> Your application<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="getRegisterapp">Register</a>
                                </li>
                                <li>
                                    <a href="getViewapp">View</a>
                                </li>
                                <li>
                                    <a href="getEditapp">Edit</a>
                                </li>
                            </ul>    
                        </li> 
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Charts<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="getBillingChart">Billing Analytics</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>                        
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                    	<h2 class="page-header" style = "text-align: center"><strong><em>Instance</em></strong></h2>                        
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
         
       <!-- Create VM -->  
            <h4>1. Create Virtual Machine:</h4>
			<h5>Method:</h5>
			<code id="typeofmethod"></code>
			<br>
			<br>
			<div class="row" >
			<h5 style="margin: 15px">Endpoint:</h5>
				<code id="url"
					style="background-color: #1F2028; color: white ; margin: 15px"></code>
			</div>
		
			<br>
			<!-- Request Table -->
			<div class="row">
			<h5 style="margin: 15px">Request Parameters:</h5>
			<table id= "request" class="table table-striped" style="margin: 15px">
			<thead>
			<tr>
			<td>Name</td>
			<td>DataType</td>
			<td>Description</td>
			</tr>
			</thead>
			<tbody>
			</tbody>
			</table>
			</div>
			<!-- Response Table -->
		<br>
			<div class="row">
			<h5 style="margin: 15px">Response Parameters:</h5>
			<table id= "response" class="table table-striped" style="margin: 15px">
			<thead>
			<tr>
			<td>Name</td>
			<td>DataType</td>
			<td>Description</td>
			</tr>
			</thead>
			<tbody>
			</tbody>
			
			</table>
			</div>
			<hr>
          <!-- Create VM end -->  
          
                  <h4>2. Stop Virtual Machine:</h4>
			<h5>Method:</h5>
			<code id="typeofmethod1"></code>
			<br>
			<br>
			<div class="row" >
			<h5 style="margin: 15px">Endpoint:</h5>
				<code id="url1"
					style="background-color: #1F2028; color: white ; margin: 15px"></code>
			</div>
		
			<br>
			<!-- Request Table -->
			<div class="row">
			<h5 style="margin: 15px">Request Parameters:</h5>
			<table id= "request1" class="table table-striped" style="margin: 15px">
			<thead>
			<tr>
			<td>Name</td>
			<td>DataType</td>
			<td>Description</td>
			</tr>
			</thead>
			<tbody>
			</tbody>
			</table>
			</div>
			<!-- Response Table -->
		<br>
			<div class="row">
			<h5 style="margin: 15px">Response Parameters:</h5>
			<table id= "response1" class="table table-striped" style="margin: 15px">
			<thead>
			<tr>
			<td>Name</td>
			<td>DataType</td>
			<td>Description</td>
			</tr>
			</thead>
			<tbody>
			</tbody>
			
			</table>
			</div>
			<hr>
           <!-- Terminate vm -->
           
                  <h4>3. Terminate Virtual Machine:</h4>
			<h5>Method:</h5>
			<code id="typeofmethod2"></code>
			<br>
			<br>
			<div class="row" >
			<h5 style="margin: 15px">Endpoint:</h5>
				<code id="url2"
					style="background-color: #1F2028; color: white ; margin: 15px"></code>
			</div>
		
			<br>
			<!-- Request Table -->
			<div class="row">
			<h5 style="margin: 15px">Request Parameters:</h5>
			<table id= "request2" class="table table-striped" style="margin: 15px">
			<thead>
			<tr>
			<td>Name</td>
			<td>DataType</td>
			<td>Description</td>
			</tr>
			</thead>
			<tbody>
			</tbody>
			</table>
			</div>
			<!-- Response Table -->
		<br>
			<div class="row">
			<h5 style="margin: 15px">Response Parameters:</h5>
			<table id= "response2" class="table table-striped" style="margin: 15px">
			<thead>
			<tr>
			<td>Name</td>
			<td>DataType</td>
			<td>Description</td>
			</tr>
			</thead>
			<tbody>
			</tbody>
			
			</table>
			</div>
			<hr>
             
            
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    
    <footer class="footer" >
      <div class="container" style = "height:40px">
        <p class="text-muted" style = "margin:10px; text-align: right"> © 2015 CloudIgrate Inc. All Rights Reserved.</p>
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
<script type="text/javascript">
function foo(){
	/*
	Create VM
	*/
	var jsonobj = '${createvm}';
	var obj = jQuery.parseJSON(jsonobj);
	var details = jsonobj.Details;
	//alert(obj.RequestAttributes[0].name);
	var method = obj.Method;
	var typeofmethod = method.split(":");
	 document.getElementById('typeofmethod').innerHTML= typeofmethod[0];
	 document.getElementById('url').innerHTML = obj.Endpoint;
	 
	 var $tbody = $("#request tbody");
	 var tabledata = "";
     for(var i = 0; i < obj.RequestAttributes.length; i++ ){
       tabledata = "";
       tabledata += "<tr>";
       tabledata += "<td>" + obj.RequestAttributes[i].name + "<br><small> Required field: "+ obj.RequestAttributes[i].compulsory+"</small></td>";
       tabledata += "<td>" + obj.RequestAttributes[i].dataType + "</td>";
       tabledata += "<td>" + obj.RequestAttributes[i].description + "</td>";
       tabledata += "</tr>";
       $tbody.append(tabledata);
     }
     
     var $tbody1 = $("#response tbody");
     var tabledata1 = "";
     for(var j = 0; j < obj.ResponseAttributes.length; j++ ){
         tabledata1 = "";
         tabledata1 += "<tr>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].name +"<br><small> Required field: "+ obj.ResponseAttributes[j].compulsory+"</small></td>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].dataType + "</td>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].description + "</td>";
         tabledata1 += "</tr>";
         $tbody1.append(tabledata1);
       }
     
	/*
	Stop VM
	*/
 	var jsonobj = '${stopvm}';
	var obj = jQuery.parseJSON(jsonobj);
	var details = jsonobj.Details;
	//alert(obj.RequestAttributes[0].name);
	var method = obj.Method;
	var typeofmethod = method.split(":");
	 document.getElementById('typeofmethod1').innerHTML= typeofmethod[0];
	document.getElementById('url1').innerHTML = obj.Endpoint;
	 
	 var $tbody = $("#request1 tbody");
	 var tabledata = "";
     for(var i = 0; i < obj.RequestAttributes.length; i++ ){
       tabledata = "";
       tabledata += "<tr>";
       tabledata += "<td>" + obj.RequestAttributes[i].name + "<br><small> Required field: "+ obj.RequestAttributes[i].compulsory+"</small></td>";
       tabledata += "<td>" + obj.RequestAttributes[i].dataType + "</td>";
       tabledata += "<td>" + obj.RequestAttributes[i].description + "</td>";
       tabledata += "</tr>";
       $tbody.append(tabledata);
     }
     
     var $tbody1 = $("#response1 tbody");
     var tabledata1 = "";
     for(var j = 0; j < obj.ResponseAttributes.length; j++ ){
         tabledata1 = "";
         tabledata1 += "<tr>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].name +"<br><small> Required field: "+ obj.ResponseAttributes[j].compulsory+"</small></td>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].dataType + "</td>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].description + "</td>";
         tabledata1 += "</tr>";
         $tbody1.append(tabledata1);
       }
    /*
    Terminate VM
    */
 	var jsonobj = '${terminatevm}';
	var obj = jQuery.parseJSON(jsonobj);
	var details = jsonobj.Details;
	//alert(obj.RequestAttributes[0].name);
	var method = obj.Method;
	var typeofmethod = method.split(":");
	 document.getElementById('typeofmethod2').innerHTML= typeofmethod[0];
	 document.getElementById('url2').innerHTML = obj.Endpoint;
	 
	 var $tbody = $("#request2 tbody");
	 var tabledata = "";
     for(var i = 0; i < obj.RequestAttributes.length; i++ ){
       tabledata = "";
       tabledata += "<tr>";
       tabledata += "<td>" + obj.RequestAttributes[i].name + "<br><small> Required field: "+ obj.RequestAttributes[i].compulsory+"</small></td>";
       tabledata += "<td>" + obj.RequestAttributes[i].dataType + "</td>";
       tabledata += "<td>" + obj.RequestAttributes[i].description + "</td>";
       tabledata += "</tr>";
       $tbody.append(tabledata);
     }
     
     var $tbody1 = $("#response2 tbody");
     var tabledata1 = "";
     for(var j = 0; j < obj.ResponseAttributes.length; j++ ){
         tabledata1 = "";
         tabledata1 += "<tr>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].name +"<br><small> Required field: "+ obj.ResponseAttributes[j].compulsory+"</small></td>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].dataType + "</td>";
         tabledata1 += "<td>" + obj.ResponseAttributes[j].description + "</td>";
         tabledata1 += "</tr>";
         $tbody1.append(tabledata1);
       }
	
}

</script>
</html>
