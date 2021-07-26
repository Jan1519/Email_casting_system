<jsp:include page="header.jsp"></jsp:include>

<%
                                    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
                                    response.setHeader("Pragma","no-cache");//HTTP 1.0
                                    response.setHeader("Expires","0");// for proxy

                                    if (session.getAttribute("username") != null) {
                                        String username = (String) session.getAttribute("username");
                                        //out.print("<font style='color:navy'>Welcome " + username + "</font>");
                                    } else {
                                        request.setAttribute("Error1", "Plz Do login First");
                                %>
                                
                                <%}
                                %>

<div id="main">
    <div class="5grid">
        <div class="main-row">
            <div class="4u-first">

                <section>
                    <h2>Welcome to Mailservices!</h2>
                    <p>Hi! This is <strong>Mail Services</strong>, a free service by Google for Mailing system.
                        You can perform all email operation,Currently  it stores the information in database
                        it's free of cost.Let's try it..
                    </p>

                </section>

            </div>
            <div class="4u">

                <section>
                    <ul class="small-image-list">
                        <li></li>			
                    </ul>
                </section>
            </div>
            <div class="4u">
                <section>
                    <h2>Contact us:</h2>
                                <p>Contact Person : Janki Kumari<br>
                                Contact No : 9326196383<br>
                                Email id : jankis1519@gmail.com</p>
                </section>
            </div>
        </div>
    </div>
</div>
