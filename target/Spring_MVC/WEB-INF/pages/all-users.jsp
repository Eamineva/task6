<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Users</h2>
<br>

<table>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>last_name</th>
    <th>email</th>
  </tr>
  <c:forEach var="us" items="${allUs}">
    <tr>
      <td>${us.id}</td>
      <td>${us.firstName}</td>
      <td>${us.lastName}</td>
      <td>${us.email}</td>
    </tr>
  </c:forEach>

</table>

</body>
</html>