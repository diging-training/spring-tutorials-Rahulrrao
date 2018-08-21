<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
 
<html>
<body>
<h2>Hello World!</h2>
 
I am feeling: ${ mood.feeling }.
<br>
<a href="reason?r=${ mood.feeling }">Reason</a>
</body>
</html>