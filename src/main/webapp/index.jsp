<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <style>
      table {
         border:1px solid black;
         padding: 10px;
      }
      th, td{
         border:1px solid black;
         padding: 20px;
      }
   </style>
<body>
   <h2>Chessboard</h2>
     <form action="SolveServlet" method= "POST">
   <table style="width: 40%">
   
      <tr>
        <td>0</td>
         <td>0</td>
         <td>0</td>
         <td>0</td>
      </tr>
      <tr>
         <td>0</td>
         <td>0</td>
         <td>0</td>
          <td>0</td>
      </tr>
      <tr>
         <td>0</td>
         <td>0</td>
         <td>0</td>
          <td>0</td>
      </tr>
      <tr>
         <td>0</td>
         <td>0</td>
         <td>0</td>
          <td>0</td>
      </tr>
   </table>
  
   <input type="submit" value="Solve">
   </form>
</body>
</html>