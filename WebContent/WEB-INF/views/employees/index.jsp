<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">

        <h2>従業員　一覧</h2>
        <table id="employee_list">
            <tbody>
                <tr>
                    <th>社員番号</th>
                    <th>氏名</th>
                </tr>

                <%-- emp内の要素が無くなるまで続ける --%>
                <c:forEach var="emp" items="${emp}">
                    <tr>
                        <td><c:out value="${emp.code}" /></td>
                        <td><c:out value="${emp.name}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </c:param>
</c:import>