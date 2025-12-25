<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Royal Sundaram</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>
    <h1>welcome to Royal Sundaram </h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
         <div class="container">
          <form:form action="search" modelAttribute="search" method="POST">
                <table>
                <tr>
                <td>Plan Name:</td>
                <td>
                  <form:select path="planName">
                  <form:option value="">-select-</form:option>
                  <form:options items="${names}"/>
                  </form:select>
                </td>
                <td>Plan Staus:</td>
                       <td>
                         <form:select path="planStatus">
                         <form:option value="">-select-</form:option>
                            <form:options items="${status}"/>
                         </form:select>
                       </td>
                       <td>Gender:</td>
                           <td>
                            <form:select path="gender">
                             <form:option value="">-select-</form:option>
                             <form:option value="Male">Male</form:option>
                             <form:option value="Female">Female</form:option>
                             </form:select>
                             </td>
                          </tr>
                          <tr>
                          <td>Start Date:</td>
                          <td><form:input path="startDate" type="date" data-date-format="dd/MM/yyyy"/></td>
                           <td>End Date:</td>
                             <td><form:input path="endDate" type="date" data-date-format="dd/MM/yyyy"/></td>
                          </tr>
                          <tr>
                          <td><a href="/" class="btn btn-secondary"/>Reset</td>
                          <td><input type="submit" value="Search" class="btn btn-primary"/></td>
                          </tr>
                </table>
              </form:form>
              <hr/>
               <table class="table table-striped table-hover">
               <thead>
               <tr>
                <th>Id</th>
               <th>Citizen Name</th>
               <th>Plan Name</th>
               <th>Plan Status</th>
               <th>Gender</th>
               <th>Start Date</th>
               <th>End Date</th>
               </tr>
                </thead>
                  <tbody>
                  <c:forEach items="${plans}" var="plan">
                    <tr>
                    <td>${plan.citizenId}</td>
                  <td>${plan.citizenName}</td>
                  <td> ${plan.planName}</td>
                  <td> ${plan.planStatus}</td>
                  <td>${plan.citizenGender}</td>
                  <td>${plan.startDate}</td>
                  <td>${plan.endDate}</td>
                    </tr>
                  </c:forEach>
                  <tr>

                   <td colspan="7" style="text-align:center"><c:if test="${empty plans}">
                   No Records Found
                   </c:if></td>
                   </tr>
                  </tbody>
               </table>
              <hr/>
              Export : <a href="excel">Excel</a> <a href="pdf">Pdf</a>
       </div>


  </body>
</html>