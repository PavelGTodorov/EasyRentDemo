<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Create an account</title>
</head>

<body>

<div align="center">

    <form:form method="POST" modelAttribute="userform" class="form-signin">
        <h2>Create your account</h2>
        <spring:bind path="username">
            <div>
                <form:input type="text" path="username" class="form-control" placeholder="username"
                            autofocus="true"></form:input>
                <form:errors path="username"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div>
                <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                <form:errors path="password"></form:errors>
            </div>
        </spring:bind>

        <button  type="submit">Submit</button>
    </form:form>

</div>
</body>
</html>