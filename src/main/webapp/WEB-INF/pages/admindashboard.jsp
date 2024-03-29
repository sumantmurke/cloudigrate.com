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

    <!-- Timeline CSS -->
    <link href="startbootstrap-sb-admin-2-1.0.5/dist/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="startbootstrap-sb-admin-2-1.0.5/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="startbootstrap-sb-admin-2-1.0.5/bower_components/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="startbootstrap-sb-admin-2-1.0.5/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript"
	src="http://www.amcharts.com/lib/3/amcharts.js"></script>
<script type="text/javascript"
	src="http://www.amcharts.com/lib/3/pie.js"></script>
<script type="text/javascript"
	src="http://www.amcharts.com/lib/3/themes/light.js"></script>
<script type="text/javascript"
	src="http://www.amcharts.com/lib/3/serial.js"></script>
<script type="text/javascript"
	src="http://www.amcharts.com/lib/3/gauge.js"></script>
<script type="text/javascript"
	src="http://www.amcharts.com/lib/3/themes/dark.js"></script>

<style>
#piechartdiv {
	width: 100%;
	height: 435px;
	font-size: 11px;
}

#apirequestsbyservicechartdiv {
	width: 100%;
	height: 500px;
	font-size: 11px;
}

#storageperfchartdiv {
	width: 100%;
	height: 200px;
}

#sqlperfchartdiv {
	width: 100%;
	height: 200px;
}

#nosqlperfchartdiv {
	width: 100%;
	height: 200px;
}
</style>

<script>
var storageServiceAverage = '${storageServiceAverage}';
var gaugeChart = AmCharts.makeChart( "storageperfchartdiv", {
	  "type": "gauge",
	  "theme": "light",
	  "axes": [ {
	    "axisThickness": 1,
	    "axisAlpha": 0.2,
	    "tickAlpha": 0.2,
	    "valueInterval": 200,
	    "bands": [ {
	      "color": "#84b761",
	      "endValue": 800,
	      "startValue": 0
	    }, {
	      "color": "#fdd400",
	      "endValue": 1500,
	      "startValue": 800
	    }, {
	      "color": "#cc4748",
	      "endValue": 1800,
	      "innerRadius": "95%",
	      "startValue": 1500
	    } ],
	    "bottomText": "Avg. 0ms",
	    "bottomTextYOffset": -100,
	    "endValue": 1800
	  } ],
	  "arrows": [ {} ],
	  "export": {
	    "enabled": true,
	    "libs": {
	      "path": "http://www.amcharts.com/lib/3/plugins/export/libs/"
	    }
	  }
	} );

	setInterval( randomValue, 2000 );

	// set random value
	function randomValue() {
	  var value = storageServiceAverage;
	  if ( gaugeChart ) {
	    if ( gaugeChart.arrows ) {
	      if ( gaugeChart.arrows[ 0 ] ) {
	        if ( gaugeChart.arrows[ 0 ].setValue ) {
	          gaugeChart.arrows[ 0 ].setValue( value );
	          gaugeChart.axes[ 0 ].setBottomText( "Avg. " +value+"ms" );
	        }
	      }
	    }
	  }
	}
</script>

<script>
var sqlServiceAverage = '${sqlServiceAverage}';
var sqlgaugeChart = AmCharts.makeChart( "sqlperfchartdiv", {
	  "type": "gauge",
	  "theme": "light",
	  "axes": [ {
	    "axisThickness": 1,
	    "axisAlpha": 0.2,
	    "tickAlpha": 0.2,
	    "valueInterval": 200,
	    "bands": [ {
	      "color": "#84b761",
	      "endValue": 800,
	      "startValue": 0
	    }, {
	      "color": "#fdd400",
	      "endValue": 1500,
	      "startValue": 800
	    }, {
	      "color": "#cc4748",
	      "endValue": 1800,
	      "innerRadius": "95%",
	      "startValue": 1500
	    } ],
	    "bottomText": "Avg. 0ms",
	    "bottomTextYOffset": -100,
	    "endValue": 1800
	  } ],
	  "arrows": [ {} ],
	  "export": {
	    "enabled": true,
	    "libs": {
	      "path": "http://www.amcharts.com/lib/3/plugins/export/libs/"
	    }
	  }
	} );

	setInterval( randomValue, 2000 );

	// set random value
	function randomValue() {
	  var value = sqlServiceAverage;
	  if ( sqlgaugeChart ) {
	    if ( sqlgaugeChart.arrows ) {
	      if ( sqlgaugeChart.arrows[ 0 ] ) {
	        if ( sqlgaugeChart.arrows[ 0 ].setValue ) {
	        	sqlgaugeChart.arrows[ 0 ].setValue( value );
	        	sqlgaugeChart.axes[ 0 ].setBottomText( "Avg. " +value+"ms" );
	        }
	      }
	    }
	  }
	}
</script>

<script>
var nosqlServiceAverage = '${nosqlServiceAverage}';
var nosqlgaugeChart = AmCharts.makeChart( "nosqlperfchartdiv", {
	  "type": "gauge",
	  "theme": "light",
	  "axes": [ {
	    "axisThickness": 1,
	    "axisAlpha": 0.2,
	    "tickAlpha": 0.2,
	    "valueInterval": 200,
	    "bands": [ {
	      "color": "#84b761",
	      "endValue": 800,
	      "startValue": 0
	    }, {
	      "color": "#fdd400",
	      "endValue": 1500,
	      "startValue": 800
	    }, {
	      "color": "#cc4748",
	      "endValue": 1800,
	      "innerRadius": "95%",
	      "startValue": 1500
	    } ],
	    "bottomText": "Avg. 0ms",
	    "bottomTextYOffset": -100,
	    "endValue": 1800
	  } ],
	  "arrows": [ {} ],
	  "export": {
	    "enabled": true,
	    "libs": {
	      "path": "http://www.amcharts.com/lib/3/plugins/export/libs/"
	    }
	  }
	} );

	setInterval( randomValue, 2000 );

	// set random value
	function randomValue() {
	  var value = nosqlServiceAverage;
	  if ( nosqlgaugeChart ) {
	    if ( nosqlgaugeChart.arrows ) {
	      if ( nosqlgaugeChart.arrows[ 0 ] ) {
	        if ( nosqlgaugeChart.arrows[ 0 ].setValue ) {
	        	nosqlgaugeChart.arrows[ 0 ].setValue( value );
	        	nosqlgaugeChart.axes[ 0 ].setBottomText( "Avg. " +value+"ms" );
	        }
	      }
	    }
	  }
	}
</script>

<script>
var apirequestsbyservicedata = '${jsonServiceCountList}';
var JSONapirequestsbyservicedata = JSON.parse(apirequestsbyservicedata);
//alert(apirequestsbyservicedata);
/* alert(data); */

var chart = AmCharts.makeChart( "apirequestsbyservicechartdiv", {
	"type": "serial",
	  "theme": "light",
	  "dataProvider": JSONapirequestsbyservicedata,
	  "valueAxes": [ {
	    "gridColor": "#FFFFFF",
	    "gridAlpha": 0.2,
	    "dashLength": 0
	  } ],
	  "gridAboveGraphs": true,
	  "startDuration": 1,
	  "graphs": [ {
	    "balloonText": "[[productName]]: <b>[[count]]</b>",
	    "fillAlphas": 0.8,
	    "lineAlpha": 0.2,
	    "type": "column",
	    "valueField": "count"
	  } ],
	  "chartCursor": {
	    "categoryBalloonEnabled": false,
	    "cursorAlpha": 0,
	    "zoomable": false
	  },
	  "categoryField": "productName",
	  "categoryAxis": {
	    "gridPosition": "start",
	    "gridAlpha": 0,
	    "tickPosition": "start",
	    "tickLength": 20
	  },
	  "export": {
	    "enabled": true,
	    "libs": {
	      "path": "http://www.amcharts.com/lib/3/plugins/export/libs/"
	    }
	  }

	} );
</script>

<script type="text/javascript">

var cloudserviceleveldata = '${jsonLevelCountList}';
var JSONcloudserviceleveldata = JSON.parse(cloudserviceleveldata);
//alert("Test: "+JSONcloudserviceleveldata);
/* alert(data); */
var chart = AmCharts.makeChart( "piechartdiv", {
	  "type": "pie",
	  "theme": "light",
	  "titles": [ {
	    "text": "Usage by Cloud Service level",
	    "size": 16
	  } ],
	  "dataProvider": JSONcloudserviceleveldata,
	  "valueField": "count",
	  "titleField": "productName",
	  "startEffect": "elastic",
	  "startDuration": 2,
	  "labelRadius": 15,
	  "innerRadius": "50%",
	  "depth3D": 10,
	  "balloonText": "[[productName]]<br><span style='font-size:14px'><b>[[value]]</b> ([[percents]]%)</span>",
	  "angle": 15,
	  "export": {
	    "enabled": true,
	    "libs": {
	      "path": "http://www.amcharts.com/lib/3/plugins/export/libs/"
	    }
	  }
	} );
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
                        <li><a href="getAdminsettings"><i class="fa fa-gear fa-fw"></i> Settings</a>
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

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="page-header" style = "text-align: center"><strong><em>Admin Dashboard</em></strong></h2>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
           <div class="row">
				<div class="col-lg-4 col-md-6">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<div class="row">
								<div id="storageperfchartdiv"></div>
							</div>
						</div>
						<a href="#">
							<div class="panel-footer">
								<span class="pull-left">Storage Performance</span> <span
									class="pull-right"><i class="fa fa-bell fa-fw"></i></span>
								<div class="clearfix"></div>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div class="panel panel-green">
						<div class="panel-heading">
							<div class="row">
								<div id="sqlperfchartdiv"></div>
							</div>
						</div>
						<a href="#">
							<div class="panel-footer">
								<span class="pull-left">SQL Performance</span> <span
									class="pull-right"><i class="fa fa-bell fa-fw"></i></span>
								<div class="clearfix"></div>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div class="panel panel-yellow">
						<div class="panel-heading">
							<div class="row">
								<div id="nosqlperfchartdiv"></div>
							</div>
						</div>
						<a href="#">
							<div class="panel-footer">
								<span class="pull-left">NoSQL Performance</span> <span
									class="pull-right"><i class="fa fa-bell fa-fw"></i></span>
								<div class="clearfix"></div>
							</div>
						</a>
					</div>
				</div>

			</div>
            <!-- /.row -->
            <div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							<i class="fa fa-bar-chart-o fa-fw"></i> API requests by cloud
							service
							<div class="pull-right"></div>
						</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div id="apirequestsbyservicechartdiv"></div>
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
					<!-- <div class="panel panel-default">

                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> Bar Chart Example
                            <div class="pull-right">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                                        Actions
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Action</a>
                                        </li>
                                        <li><a href="#">Another action</a>
                                        </li>
                                        <li><a href="#">Something else here</a>
                                        </li>
                                        <li class="divider"></li>
                                        <li><a href="#">Separated link</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        /.panel-heading
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-4">
                                    <div class="table-responsive">
                                        <table class="table table-bordered table-hover table-striped">
                                            <thead>
                                                <tr>
                                                    <th>#</th>
                                                    <th>Date</th>
                                                    <th>Time</th>
                                                    <th>Amount</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>3326</td>
                                                    <td>10/21/2013</td>
                                                    <td>3:29 PM</td>
                                                    <td>$321.33</td>
                                                </tr>
                                                <tr>
                                                    <td>3325</td>
                                                    <td>10/21/2013</td>
                                                    <td>3:20 PM</td>
                                                    <td>$234.34</td>
                                                </tr>
                                                <tr>
                                                    <td>3324</td>
                                                    <td>10/21/2013</td>
                                                    <td>3:03 PM</td>
                                                    <td>$724.17</td>
                                                </tr>
                                                <tr>
                                                    <td>3323</td>
                                                    <td>10/21/2013</td>
                                                    <td>3:00 PM</td>
                                                    <td>$23.71</td>
                                                </tr>
                                                <tr>
                                                    <td>3322</td>
                                                    <td>10/21/2013</td>
                                                    <td>2:49 PM</td>
                                                    <td>$8345.23</td>
                                                </tr>
                                                <tr>
                                                    <td>3321</td>
                                                    <td>10/21/2013</td>
                                                    <td>2:23 PM</td>
                                                    <td>$245.12</td>
                                                </tr>
                                                <tr>
                                                    <td>3320</td>
                                                    <td>10/21/2013</td>
                                                    <td>2:15 PM</td>
                                                    <td>$5663.54</td>
                                                </tr>
                                                <tr>
                                                    <td>3319</td>
                                                    <td>10/21/2013</td>
                                                    <td>2:13 PM</td>
                                                    <td>$943.45</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    /.table-responsive
                                </div>
                                /.col-lg-4 (nested)
                                <div class="col-lg-8">
                                    <div id="morris-bar-chart"></div>
                                </div>
                                /.col-lg-8 (nested)
                            </div>
                            /.row
                        </div>
                        /.panel-body
                    </div> -->
					<!-- /.panel -->
					<!--  <div class="panel panel-default">
                        <div class="panel-heading">
                            <i class="fa fa-clock-o fa-fw"></i> Responsive Timeline
                        </div>
                        /.panel-heading
                        <div class="panel-body">
                            <ul class="timeline">
                                <li>
                                    <div class="timeline-badge"><i class="fa fa-check"></i>
                                    </div>
                                    <div class="timeline-panel">
                                        <div class="timeline-heading">
                                            <h4 class="timeline-title">Lorem ipsum dolor</h4>
                                            <p><small class="text-muted"><i class="fa fa-clock-o"></i> 11 hours ago via Twitter</small>
                                            </p>
                                        </div>
                                        <div class="timeline-body">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero laboriosam dolor perspiciatis omnis exercitationem. Beatae, officia pariatur? Est cum veniam excepturi. Maiores praesentium, porro voluptas suscipit facere rem dicta, debitis.</p>
                                        </div>
                                    </div>
                                </li>
                                <li class="timeline-inverted">
                                    <div class="timeline-badge warning"><i class="fa fa-credit-card"></i>
                                    </div>
                                    <div class="timeline-panel">
                                        <div class="timeline-heading">
                                            <h4 class="timeline-title">Lorem ipsum dolor</h4>
                                        </div>
                                        <div class="timeline-body">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem dolorem quibusdam, tenetur commodi provident cumque magni voluptatem libero, quis rerum. Fugiat esse debitis optio, tempore. Animi officiis alias, officia repellendus.</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Laudantium maiores odit qui est tempora eos, nostrum provident explicabo dignissimos debitis vel! Adipisci eius voluptates, ad aut recusandae minus eaque facere.</p>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="timeline-badge danger"><i class="fa fa-bomb"></i>
                                    </div>
                                    <div class="timeline-panel">
                                        <div class="timeline-heading">
                                            <h4 class="timeline-title">Lorem ipsum dolor</h4>
                                        </div>
                                        <div class="timeline-body">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus numquam facilis enim eaque, tenetur nam id qui vel velit similique nihil iure molestias aliquam, voluptatem totam quaerat, magni commodi quisquam.</p>
                                        </div>
                                    </div>
                                </li>
                                <li class="timeline-inverted">
                                    <div class="timeline-panel">
                                        <div class="timeline-heading">
                                            <h4 class="timeline-title">Lorem ipsum dolor</h4>
                                        </div>
                                        <div class="timeline-body">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptates est quaerat asperiores sapiente, eligendi, nihil. Itaque quos, alias sapiente rerum quas odit! Aperiam officiis quidem delectus libero, omnis ut debitis!</p>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="timeline-badge info"><i class="fa fa-save"></i>
                                    </div>
                                    <div class="timeline-panel">
                                        <div class="timeline-heading">
                                            <h4 class="timeline-title">Lorem ipsum dolor</h4>
                                        </div>
                                        <div class="timeline-body">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nobis minus modi quam ipsum alias at est molestiae excepturi delectus nesciunt, quibusdam debitis amet, beatae consequuntur impedit nulla qui! Laborum, atque.</p>
                                            <hr>
                                            <div class="btn-group">
                                                <button type="button" class="btn btn-primary btn-sm dropdown-toggle" data-toggle="dropdown">
                                                    <i class="fa fa-gear"></i>  <span class="caret"></span>
                                                </button>
                                                <ul class="dropdown-menu" role="menu">
                                                    <li><a href="#">Action</a>
                                                    </li>
                                                    <li><a href="#">Another action</a>
                                                    </li>
                                                    <li><a href="#">Something else here</a>
                                                    </li>
                                                    <li class="divider"></li>
                                                    <li><a href="#">Separated link</a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="timeline-panel">
                                        <div class="timeline-heading">
                                            <h4 class="timeline-title">Lorem ipsum dolor</h4>
                                        </div>
                                        <div class="timeline-body">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sequi fuga odio quibusdam. Iure expedita, incidunt unde quis nam! Quod, quisquam. Officia quam qui adipisci quas consequuntur nostrum sequi. Consequuntur, commodi.</p>
                                        </div>
                                    </div>
                                </li>
                                <li class="timeline-inverted">
                                    <div class="timeline-badge success"><i class="fa fa-graduation-cap"></i>
                                    </div>
                                    <div class="timeline-panel">
                                        <div class="timeline-heading">
                                            <h4 class="timeline-title">Lorem ipsum dolor</h4>
                                        </div>
                                        <div class="timeline-body">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deserunt obcaecati, quaerat tempore officia voluptas debitis consectetur culpa amet, accusamus dolorum fugiat, animi dicta aperiam, enim incidunt quisquam maxime neque eaque.</p>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        /.panel-body
                    </div> -->
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-8 -->
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							<i class="fa fa-bar-chart-o fa-fw"></i> Your application residing
							on various cloud service level
						</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div id="piechartdiv"></div>



						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
					<!--  <div class="panel panel-default">
                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> Donut Chart Example
                        </div>
                        <div class="panel-body">
                            <div id="morris-donut-chart"></div>
                            <a href="#" class="btn btn-default btn-block">View Details</a>
                        </div>
                        /.panel-body
                    </div> -->
					<!-- /.panel -->
					<!-- <div class="chat-panel panel panel-default">
                        <div class="panel-heading">
                            <i class="fa fa-comments fa-fw"></i>
                            Chat
                            <div class="btn-group pull-right">
                                <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                                    <i class="fa fa-chevron-down"></i>
                                </button>
                                <ul class="dropdown-menu slidedown">
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-refresh fa-fw"></i> Refresh
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-check-circle fa-fw"></i> Available
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-times fa-fw"></i> Busy
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-clock-o fa-fw"></i> Away
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-sign-out fa-fw"></i> Sign Out
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        /.panel-heading
                        <div class="panel-body">
                            <ul class="chat">
                                <li class="left clearfix">
                                    <span class="chat-img pull-left">
                                        <img src="http://placehold.it/50/55C1E7/fff" alt="User Avatar" class="img-circle" />
                                    </span>
                                    <div class="chat-body clearfix">
                                        <div class="header">
                                            <strong class="primary-font">Jack Sparrow</strong>
                                            <small class="pull-right text-muted">
                                                <i class="fa fa-clock-o fa-fw"></i> 12 mins ago
                                            </small>
                                        </div>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                                        </p>
                                    </div>
                                </li>
                                <li class="right clearfix">
                                    <span class="chat-img pull-right">
                                        <img src="http://placehold.it/50/FA6F57/fff" alt="User Avatar" class="img-circle" />
                                    </span>
                                    <div class="chat-body clearfix">
                                        <div class="header">
                                            <small class=" text-muted">
                                                <i class="fa fa-clock-o fa-fw"></i> 13 mins ago</small>
                                            <strong class="pull-right primary-font">Bhaumik Patel</strong>
                                        </div>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                                        </p>
                                    </div>
                                </li>
                                <li class="left clearfix">
                                    <span class="chat-img pull-left">
                                        <img src="http://placehold.it/50/55C1E7/fff" alt="User Avatar" class="img-circle" />
                                    </span>
                                    <div class="chat-body clearfix">
                                        <div class="header">
                                            <strong class="primary-font">Jack Sparrow</strong>
                                            <small class="pull-right text-muted">
                                                <i class="fa fa-clock-o fa-fw"></i> 14 mins ago</small>
                                        </div>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                                        </p>
                                    </div>
                                </li>
                                <li class="right clearfix">
                                    <span class="chat-img pull-right">
                                        <img src="http://placehold.it/50/FA6F57/fff" alt="User Avatar" class="img-circle" />
                                    </span>
                                    <div class="chat-body clearfix">
                                        <div class="header">
                                            <small class=" text-muted">
                                                <i class="fa fa-clock-o fa-fw"></i> 15 mins ago</small>
                                            <strong class="pull-right primary-font">Bhaumik Patel</strong>
                                        </div>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                                        </p>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        /.panel-body
                        <div class="panel-footer">
                            <div class="input-group">
                                <input id="btn-input" type="text" class="form-control input-sm" placeholder="Type your message here..." />
                                <span class="input-group-btn">
                                    <button class="btn btn-warning btn-sm" id="btn-chat">
                                        Send
                                    </button>
                                </span>
                            </div>
                        </div>
                        /.panel-footer
                    </div> -->
					<!-- /.panel .chat-panel -->
				</div>
				<!-- /.col-lg-4 -->
			</div>
            <!-- /.row -->
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
	<script src="startbootstrap-sb-admin-2-1.0.5/bower_components/jquery/dist/jquery.js"></script>
	
    <!-- Bootstrap Core JavaScript -->
    <script src="startbootstrap-sb-admin-2-1.0.5/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="startbootstrap-sb-admin-2-1.0.5/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="startbootstrap-sb-admin-2-1.0.5/bower_components/raphael/raphael-min.js"></script>
    <script src="startbootstrap-sb-admin-2-1.0.5/bower_components/morrisjs/morris.min.js"></script>
    <script src="startbootstrap-sb-admin-2-1.0.5/js/morris-data.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="startbootstrap-sb-admin-2-1.0.5/dist/js/sb-admin-2.js"></script>

</body>

</html>
