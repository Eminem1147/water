<%--
  Created by IntelliJ IDEA.
  User: asus1
  Date: 2017/7/29
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>项目发布</title>

    <!-- CSS -->
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Lobster">
    <!--<link href="//cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">-->
    <link href="//cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="//cdn.bootcss.com/animate.css/3.5.2/animate.css" rel="stylesheet">
    <link rel="stylesheet" href="../resources/css/styles.css">
    <link rel="stylesheet" href="../resources/css/test.css">

    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="././ico/favicon1.ico">

    <!-- include summernote css/js-->
    <link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.6/summernote.css" rel="stylesheet">
    <script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.6/summernote.js"></script>

    <!--<script src="lang/summernote-zh-CN.js"></script>-->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.6/lang/summernote-zh-CN.js"></script>

    <script src="./resources/js/Admin_Work_Project.js"></script>
    <%--<script src="./resources/js/Admin_Work.js"></script>--%>

    <style>
        .indicator-group-content{
            text-align: left;
        }
        #buttons{
            text-align: center;
        }
    </style> 
</head>

<body onload=load()>
<script>
    $(document).ready(function() {
        $('#summernote').summernote({
            placeholder:"请输入内容",
            lang: 'zh-CN', // default: 'en-US'
            height: 400,
            focus:true,
            onImageUpload: function(files, editor, welEditable) {
                sendFile(files[0],editor,welEditable);
            }
        });
    });
</script>

<!-- Top menu -->

<nav class="navbar" role="navigation" style="margin-bottom:0px;">


    <div class="container">
        <div class="navbar-header">
            <a href="#" class="logo">Noah's <span>Ark</span></a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="top-navbar-1">
            <ul id="nav" class="nav navbar-nav navbar-right">
                <li><a href="#"onclick="topnavclick(this)" name="1"><i
                        class="fa fa-2x fa-sitemap" ></i><br>审核申请</a></li>

                <li><a href="#" onclick="topnavclick(this)" name="2"><i
                        class="fa fa-2x fa-tasks"></i><br>采样信息</a>
                </li>

                <li><a href="#" onclick="topnavclick(this)" name="3"><i
                        class="fa fa-2x fa-tasks"></i><br>实验结果</a>
                </li>
                <li class="active"><a href="#" onclick="topnavclick(this)" name="4"><i
                        class="fa fa-2x fa-tasks"></i><br>项目管理</a>
                </li>


                <ul class="social-links">
                    <div id="top-navigation">
                        Welcome! <a href="#"><strong>Administrator</strong></a>
                        <span>|</span>
                        <a href="#">Log out</a>
                    </div>
                </ul>
            </ul>



        </div>
    </div>


</nav>

<!-- Page Title -->
<div class="page-title-container">
    <div class="container">
        <div class="row">
            <div class="col-sm-7 wow fadeIn">
                <i class="fa fa-sitemap"></i>
                <h1>PUBLISH PROJECT/</h1>
                <p>项目发布</p>
            </div>
            <div class="col-md-5">
                <div class="form_datetime">
                    <input type="text" id="input"  placeholder="请输入项目名称"/>
                    <!--<span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>-->
                    <button id="search" class="btn-query text-sign" style="background: #3f9db8">查询</button>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- content -->
<div class="content">
    <div class="container">

        <div class="intro-panel">
            <div id = "mainwrapper" class="main_wrapper" style="display: block">
                <div id="main_content">
                    <div id="tab1">
                        <div id="content1" class="table-content" style="display: block;">
                            <ul id="scro1" class="scroll indicator-group-title">
                                <li id="add" class="active" onclick=show("add")><a>新增项目</a><span class="fa fa-angle-right"></span></li>
                            </ul>
                            <div class="indicator-group-content">
                                <div style="padding-bottom:10px;">
                                    <form class="bs-example bs-example-form" role="form">
                                        <div class="input-group">
                                            <span class="input-group-addon">项目标题</span>
                                            <input id="headline" type="text" class="form-control" placeholder="请输入标题"/>
                                        </div>
                                    </form>
                                </div>
                                <div id="summernote" style="text-align:left;"></div>
                                <div id="buttons">
                                    <button id="confirm" onclick="publish()" class="btn-query text-sign" style="background: #3f9db8">提交</button>
                                    <button id="cancel" onclick="deleteAll()" class="btn-query text-sign" style="background: #3f9db8">取消</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- Footer -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-sm-7 footer-copyright wow fadeIn">
                <p>
                    Copyright 2017 河流生态地图后台 - by <a
                        href="http://azmind.com/free-bootstrap-themes-templates/">Noah's Ark</a>.
                </p>
            </div>
            <div class="col-sm-5 footer-social wow fadeIn">
                <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
                    class="fa fa-qq"></i></a> <a href="#"><i class="fa fa-weibo"></i></a>
                <a href="#"><i class="fa fa-wechat"></i></a>
            </div>
        </div>
    </div>
</footer>


<!-- Javascript -->
<script src="http://cdn.bootcss.com/bootstrap-hover-dropdown/2.2.1/bootstrap-hover-dropdown.min.js"></script>
<script src="http://cdn.bootcss.com/wow/1.1.2/wow.min.js"></script>
</body>

</html>