<%-- 
    Document   : index
    Created on : Mar 11, 2021, 12:53:08 PM
    Author     : Abhey Gupta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
           <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous"> 
    </head>
    <body>
                    <header class="text-gray-600 body-font">
  <div class="container mx-auto flex flex-wrap p-5 flex-col md:flex-row items-center">
    <a class="flex title-font font-medium items-center text-gray-900 mb-4 md:mb-0">
      <svg xmlns="http://www.w3.org/2000/svg" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="w-10 h-10 text-white p-2 bg-indigo-500 rounded-full" viewBox="0 0 24 24">
        <path d="M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5"></path>
      </svg>
      <span class="ml-3 text-xl"><h2>Registration</h2></span>
    </a>
    <nav class="md:mr-auto md:ml-4 md:py-1 md:pl-4 md:border-l md:border-gray-400	flex flex-wrap items-center text-base justify-center">
      <a href="#" class="mr-5 hover:text-gray-900">HOME</a>
      <a href="#" class="mr-5 hover:text-gray-900">REGISTER</a>
      <a href="#" class="mr-5 hover:text-gray-900">LOGIN</a>
      <a href="#" class="mr-5 hover:text-gray-900">ABOUT</a>
    </nav>
      <svg fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="w-4 h-4 ml-1" viewBox="0 0 24 24">
        <path d="M5 12h14M12 5l7 7-7 7"></path>
      </svg>
    </button>
  </div>
</header>
<div class="container mt-2" style="width: 50%; background-color: whitesmoke;">
    <form action="RegisterUsers" method="post">
     <p class="text-center" style="font-size: 20px;">Registration Form</p>
     
  <div class="mb-1">
    <label for="exampleInputEmail1" class="form-label">First Name</label>
    <input type="text" required="" placeholder="Enter firstname"  name="fname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  
  <div class="mb-1">
    <label for="exampleInputEmail1" class="form-label">Last Name</label>
    <input type="text" required="" placeholder="Enter lastname"  name="lname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  
     <div class="mb-1">
    <label for="exampleInputEmail1" class="form-label">Date of Birth</label>
    <input type="text" required="" placeholder="YYYY-MM-dd" name="dob" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
     
    <div class="mb-1">
    <label for="exampleInputEmail1"  class="form-label">Age</label>
    <input type="text" required="" placeholder="Age limit between 24-70" name="age" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
     
      <div class="mb-1">
    <label for="exampleInputEmail1"  class="form-label">Address Line 1</label>
    <input type="text" required="" placeholder="Enter Address 1" name="address1" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
     
      <div class="mb-1">
    <label for="exampleInputEmail1"  class="form-label">Address Line 2</label>
    <input type="text" required="" placeholder="Enter Address 2" name="address2" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
     
    <div class="mb-1">
    <label for="exampleInputEmail1"  class="form-label">City</label>
    <input type="text" required="" placeholder="Enter city" name="city" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
     
      <div class="mb-1">
    <label for="exampleInputEmail1"  class="form-label">State</label>
    <input type="text" required="" placeholder="Enter state" name="state" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
     
     <div class="mb-1">
    <label for="exampleInputEmail1"  class="form-label">Country</label>
    <input type="text" required="" placeholder="Enter country" name="country" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
     
      <div class="mb-1">
    <label for="exampleInputEmail1"  class="form-label">Postal Code</label>
    <input type="text" required=""  placeholder="Pincode should be of 6 digits" name="pcode" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
     
     <div align="center" class="py-1">
    <button type="submit" class="btn btn-primary">Submit</button>
     </div>
  
  
</form>

    </body>
</html>
