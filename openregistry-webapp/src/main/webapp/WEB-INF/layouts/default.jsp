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

<%@ page session="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
    <head>
        <c:choose>
            <c:when test="${not empty taskTitleCode}">
                <title>OpenRegistry <spring:message code="${taskTitleCode}" /> </title>
            </c:when>
            <c:otherwise>
                <tiles:useAttribute id="key" name="titleCode"/>
                <title>OpenRegistry <spring:message code="${key}" /> </title>
            </c:otherwise>
        </c:choose>
        <tiles:insertAttribute name="head" />
    </head>
    <body class="nihilo">
        <c:choose>
            <c:when test="${not empty taskTitleCode}">
                <div id="header"><h1>OpenRegistry</h1><h2><spring:message code="${taskTitleCode}" /></h2></div>
            </c:when>
            <c:otherwise>
                <tiles:useAttribute id="key" name="titleCode"/>
                <div id="header"><h1>OpenRegistry</h1><h2><spring:message code="${key}" /></h2></div>
            </c:otherwise>
        </c:choose>
            <tiles:insertAttribute name="content" />
        </div>
        <div class="footer">
            <p><spring:message code="footer.copyright.text" /></p>
        </div>
    </body>
</html>