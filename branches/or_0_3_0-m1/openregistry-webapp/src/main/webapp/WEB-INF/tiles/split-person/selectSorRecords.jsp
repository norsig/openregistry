<%--

    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License. You may obtain a
    copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on
    an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied. See the License for the
    specific language governing permissions and limitations
    under the License.

--%>

<%--
  Created by IntelliJ IDEA.
  User: Nancy Mond
  Date: Feb 23, 2009
  Time: 4:56:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<form:form modelAttribute="person">
    <fieldset id="selectSorPerson">
        <legend><span><spring:message code="selectSorPagePage.heading"/></span></legend>
        <br/>

    <fieldset class="fm-h" id="ecn1">
        <label class="desc">${person.officialName.formattedName}</label>
        <c:forEach var="sorPerson" items="${sorPersons}" varStatus="loopStatus">
            <label class="desc"><spring:message code="sor.heading"/> <c:out value="${sorPerson.sourceSor}" /> <a href="${flowExecutionUrl}&_eventId=move&sorPersonSorId=${sorPerson.sourceSor}"><img src="images/move.jpg" title="move SoR record"/></a>  <a href="${flowExecutionUrl}&_eventId=moveToNewPerson&sorPersonSorId=${sorPerson.sourceSor}"><img src="images/moveplus.jpg" title="move SoR record to new person"/></a></label>
                <div>
                    <table class="data" cellspacing="0" width="80%">
                        <thead>
                            <tr class="appHeadingRow">
                                <th><spring:message code="property.label"/></th>
                                <th><spring:message code="value.label"/></th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="sorName" items="${sorPerson.names}" varStatus="loopStatus">
                            <tr>
                                <td><spring:message code="nameColumn.label"/></td>
                                <td>${sorName.formattedName}</td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td><spring:message code="dateOfBirth.label"/></td>
                            <td><fmt:formatDate pattern="MM/dd/yyyy" value="${sorPerson.dateOfBirth}"/></td>
                        </tr>
                        <tr>
                            <td><spring:message code="gender.label" /></td>
                            <td>${sorPerson.gender}</td>
                        </tr>
                        <c:forEach var="role" items="${sorPerson.roles}" >
                            <tr>
                                <td><spring:message code="role.label" /></td>
                                <td>${role.title}/${role.organizationalUnit.name}/${role.campus.name}</td>
                            </tr>
                         </c:forEach>
                        </tbody>
                    </table>
        </c:forEach>
        </div>

		</fieldset>
		</fieldset>

		<div class="row fm-v" style="clear:both;">
			<input style="float:left;" type="submit" id="fm-cancel-submit1" name="_eventId_cancel" class="btn-submit" value="Cancel" tabindex="11"/>
		</div>

</form:form>