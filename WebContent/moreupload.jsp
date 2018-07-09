<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

    <meta charset="utf-8" />

    <title>三只松鼠|食品管理-增加食品信息</title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

    <meta content="" name="description" />

    <meta content="" name="author" />

    <!-- BEGIN GLOBAL MANDATORY STYLES -->

    <link href="media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/style-metro.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/style.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

    <link href="media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN PAGE LEVEL STYLES -->

    <link href="media/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>

    <!-- END PAGE LEVEL STYLES -->

    <link rel="shortcut icon" href="media/image/index.ico" />
    <style type="text/css">
        #middle
        {
            width:100%;
            height:600px;
            border:1px #000000;
            background-image:url(media/image/bg/2.jpg);
            color:#FFF;
            padding-top:110px;
        }
        h2{
            text-align:center;
            padding-top:10px;
        }
        #form
        {
            text-align:center;
            border: #999 1px solid;
            height:560px;
            width:600px;
            margin:0px auto;
            background-color:#ACACAC;
            opacity:0.02px;
            box-shadow:0px 0px 100px;
        }
        #form .td
        {
            font-size:18px;
            font-weight:bolder;
        }
        #form td
        {
            padding-top:10px;
        }
    </style>

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="page-header-fixed">


<div id="middle">
    <div id="form">
        <form action="ProductServlet?tag=add" method="post" enctype="multipart/form-data" >
            <h2>三只松鼠--新增</h2>
            <table align="center">
                <tr>
                    <td width="90px"  class="td">名称：</td>
                    <td>
                        <input type="text" name="produceName" id="name">
                    </td>
                </tr>
                <tr>
                    <td width="90px"  class="td">详情介绍：</td>
                    <td>
                        <textarea cols="20px" rows="1px" name="details"></textarea>
                    </td>
                </tr>
                <tr>
                    <td width="90px"  class="td">价格：</td>
                    <td>
                        <input type="text" name="price" id="price">
                    </td>
                </tr>
                <tr>
                    <td width="90px"  class="td">库存：</td>
                    <td>
                        <input type="text" name="stock" id="price">
                    </td>
                </tr>
                <tr>
                    <td width="90px"  class="td">大图:</td>
                    <td>
                        <input type="file" name="bigfile" id="price">
                    </td>
                </tr>
                <tr>
                    <td width="90px"  class="td">小图1:</td>
                    <td>
                        <input type="file" name="smallfile1" id="price">
                    </td>
                </tr>
                <tr>
                    <td width="90px"  class="td">小图2:</td>
                    <td>
                        <input type="file" name="smallfile2" id="price">
                    </td>
                </tr>
                <tr>
                    <td width="90px"  class="td">小图3:</td>
                    <td>
                        <input type="file" name="smallfile3" id="price">
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="新增">   <input type="button" value="取消"></td>
                </tr>
            </table>
        </form>
    </div>
</div>

<!-- END CONTAINER -->

<!-- 脚步开始 -->

<div class="footer">

    <div class="footer-inner">

        2013 &copy; Metronic by keenthemes.Collect from <a href="http://www.cssmoban.com/" title="三只松鼠" target="_blank">三只松鼠</a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="三只松鼠">三只松鼠</a>

    </div>

    <div class="footer-tools">

            <span class="go-top">

            <i class="icon-angle-up"></i>

            </span>

    </div>

</div>

<!-- END FOOTER -->

<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

<!-- BEGIN CORE PLUGINS -->

<script src="media/js/jquery-1.10.1.min.js" type="text/javascript"></script>

<script src="media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

<script src="media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>

<script src="media/js/bootstrap.min.js" type="text/javascript"></script>

<!--[if lt IE 9]>

<script src="media/js/excanvas.min.js"></script>

<script src="media/js/respond.min.js"></script>

<![endif]-->

<script src="media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

<script src="media/js/jquery.blockui.min.js" type="text/javascript"></script>

<script src="media/js/jquery.cookie.min.js" type="text/javascript"></script>

<script src="media/js/jquery.uniform.min.js" type="text/javascript" ></script>

<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->

<script type="text/javascript" src="media/js/jquery.gritter.js"></script>

<script type="text/javascript" src="media/js/jquery.pulsate.min.js"></script>

<script type="text/javascript" src="media/js/jquery.bootpag.min.js"></script>

<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->

<script src="media/js/app.js"></script>

<script src="media/js/ui-general.js"></script>

<!-- END PAGE LEVEL SCRIPTS -->

<script>

    jQuery(document).ready(function() {

        // initiate layout and plugins

        App.init();

        UIGeneral.init();

    });

</script>

<!-- END JAVASCRIPTS -->

</body>

<!-- END BODY -->

</html>
