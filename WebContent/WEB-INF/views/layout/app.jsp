<%-- 全てのページ共通の処理、設定 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>日報管理システム</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style.css' />">

    </head>
    <body>

        <div id="wrapper">
            <div id="header">

                <div id="header_menu">
                    <h1><a href="<c:url value='/' />"><span class="mgr-10">日報管理システム</span></a></h1>&nbsp;&nbsp;&nbsp;

                            <a href="<c:url value='/employees/index' />">従業員管理</a>&nbsp;
                </div>
            </div>
            <div id="content">
                ${param.content}
            </div>
            <div id="footer">
                by Taro Kirameki.
            </div>
        </div>
    </body>
</html>