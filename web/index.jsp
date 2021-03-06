<%-- 
    Document   : index
    Created on : May 29, 2013, 6:01:32 PM
    Author     : ragulin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Player's statistics</title>
    </head>
    <body>
        <table>
            <tr>
                    <td width ="100">Left Score</td>
                    <td width ="100">Right Score</td>
                    <td width ="200">Player</td>
                    <td width ="300">Comments</td>
                </tr>
            <tr>
            <c:forEach items="${gameResults}" var= "gr">
                <tr>
                    <p>
                    <td width ="200">${gr.leftScore}</td>
                    <td width ="50">${gr.rightScore}</td>
                    <td width ="70">${gr.playerName}</td>
                    <td width ="50">${gr.playerComments}</td>
                    </p>
                </tr>
            </c:forEach>
            </tr>
        </table>
        <table>
            <tr>
                    <td width ="100">Client number</td>
                    <td width ="100">Number of contributions</td>
                </tr>
            <tr>
            <c:forEach items="${clients}" var= "cl">
                <tr>
                    <p>
                    <td width ="50">${cl.clientID}</td>
                    <td width ="50">${cl.numResults}</td>
                    </p>
                </tr>
            </c:forEach>
            </tr>
        </table>
    </body>
</html>
