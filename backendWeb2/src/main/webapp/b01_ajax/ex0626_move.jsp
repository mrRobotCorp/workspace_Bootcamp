<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>move</title>
</head>
<body>
    <div class="container mt-3">
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>page</th>
                 <th>request</th>
                 <th>session</th>
                 <th>application</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td>${m01}</td>
                 <td>${m02}</td>
                 <td>${m03}</td>
                 <td>${m04}</td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>