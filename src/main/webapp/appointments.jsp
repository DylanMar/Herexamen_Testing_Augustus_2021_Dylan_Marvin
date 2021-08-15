<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<jsp:include page="head-default.jsp">
    <jsp:param name="title" value="Appointment Overview"/>
</jsp:include>

<body>

<jsp:include page="navbar.jsp">
    <jsp:param name="activePage" value="appointments"/>
</jsp:include>

<div class="container">
    <main>
        <h1>Registered appointments</h1>
        <c:choose>
            <c:when test="${not empty appointments}">
                <table class="table table-striped">
                    <thead class="thead-light">
                    <tr>
                        <th scope="col">id</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="appointment" items="${appointments}">
                        <tr>
                            <td><a href="Controller?command=AppointmentDetails&id=${appointment.id}"><c:out value='${appointment.id}'/></a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:when>
            <c:otherwise>
                <p><em>No appointments found</em></p>
            </c:otherwise>
        </c:choose>
    </main>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>