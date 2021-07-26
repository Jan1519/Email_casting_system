<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<!DOCTYPE html>  
<html>  
    <head>   
        <title>New Employee</title>  
        <style>
            body {font-family: Arial, Helvetica, sans-serif;}
            * {box-sizing: border-box}

            /* Full-width input fields */
            input[type=text], input[type=password]           
            {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                display: inline-block;
                border: none;
                background: #f1f1f1;
            }

            input[type=text]:focus, input[type=password]:focus {
                background-color: #ddd;
                outline: none;
            }

            hr {
                border: 1px solid #f1f1f1;
                margin-bottom: 25px;
            }

            /* Set a style for all buttons */
            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            button:hover {
                opacity:1;
            }

            /* Extra styles for the cancel button */
            .cancelbtn {
                padding: 14px 20px;
                background-color: #f44336;
            }

            /* Float cancel and signup buttons and add an equal width */
            .cancelbtn, .signupbtn {
                float: left;
                width: 50%;
            }

            /* Add padding to container elements */
            .container {
                padding: 16px;
                width: 40%;
            }

            /* Clear floats */
            .clearfix::after {
                content: "";
                clear: both;
                display: table;
            }

            /* Change styles for cancel button and signup button on extra small screens */
            @media screen and (max-width: 300px) {
                .cancelbtn, .signupbtn {
                    width: 100%;
                }
            }
        </style>      
        <script>
            function validateForm() {
                var x = document.forms["myForm"]["name"].value;
                if (x == "") {
                    alert("Name must be filled out");
                    return false;
                }
                var z = document.forms["myForm"]["ID"].value;
                if (z == "") {
                    alert("ID must be filled out");
                    return false;
                }
                var z = document.forms["myForm"]["name"].value;
                if (z == "") {
                    alert("name must be filled out");
                    return false;
                }
                var z = document.forms["myForm"]["username"].value;
                if (z == "") {
                    alert("username must be filled out");
                    return false;
                }
                var y = document.forms["myForm"]["password"].value;
                if (y == "") {
                    alert("Passward must be filled out");
                    return false;
                }
                var y = document.forms["myForm"]["repassword"].value;
                if (y == "") {
                    alert("Re-Passward must be filled out");
                    return false;
                }
            }
        </script>
    </head>  
    <body>  
        <center>
            <h1>Add New Candidate</h1>
            <a href="Adminlogout" style="float: right; text-decoration: none; padding: 15px; background-color: green; color: #FFF; font-size: 20px">Logout</a>  
            <a href="ViewServlet" style="float: right; text-decoration: none; padding: 15px; background-color: green; color: #FFF; font-size: 20px">view Candidate </a>   
            <form name="myForm" action="SaveServlet" method="post" onsubmit="return validateForm()" style="border:1px solid #ccc">  
                <div class="container" >
              
                    <b>Id</b>
                    <input type="text" placeholder="Enter Id" name="Id" required>
                    
                    <b>Name</b>
                    <input type="text" placeholder="Enter Name" name="Name" required>

                    <b>Email</b><br>
                    <input type="text" placeholder="Enter Email" name="Email" required>

                    <b>Password</b><br>
                    <input type="password" placeholder="Enter Password" name="Password" required>
                    
                    <b>Select Country:</b>  
                    <select name="Country" style="width:500px;display:inline-block;border:none;background:#f1f1f1;padding: 15px;
                                                  margin: 5px 0 22px 0">  
                    <option>India</option>  
                    <option>USA</option>  
                    <option>UK</option>  
                    <option>Other</option>  
                    </select> 
                    <div class="clearfix" >
                        
                    <button type="submit">Save Candidate</button>        
                    </div>
                </div>
            </form>  
        </center>
    </body>  
</html>
