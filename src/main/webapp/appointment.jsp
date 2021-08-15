<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<jsp:include page="head-default.jsp">
    <jsp:param name="title" value="Appointment Details"/>
</jsp:include>

<body>

<jsp:include page="navbar.jsp">
    <jsp:param name="activePage" value="appointment"/>
</jsp:include>

<div class="container">
    <main>
        <h1>Appointment Details</h1>
            <table class="table table-striped">
                <thead class="thead-light">
                    <tr>
                        <th scope="row">ID</th>
                        <td><c:out value='${appointment.id}'/></td>
                    </tr>
                    <tr>
                        <th scope="row">Location</th>
                        <td><c:out value='${appointment.location}'/></td>
                    </tr>
                    <tr>
                        <th scope="row">Gender</th>
                        <td><c:out value='${appointment.timeSlot}'/></td>
                    </tr>
                </thead>
            </table>
    </main>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>