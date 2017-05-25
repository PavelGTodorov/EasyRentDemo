<!DOCTYPE html>
<html lang="en">
<head>
    <title>Log in with your account</title>
</head>

<body>

<div align="center">

    <form method="POST" action="${contextPath}/login">
        <h2>Log in</h2>

        <div align="center">
            <span>${message}</span>
            <input name="username" type="text" placeholder="username"/>
            <input name="password" type="password" placeholder="password"/>
            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button type="submit">Log In</button>
            <h4 align="center"><a href="${contextPath}/registration">Create an account</a></h4>
        </div>

    </form>

</div>
</body>
</html>