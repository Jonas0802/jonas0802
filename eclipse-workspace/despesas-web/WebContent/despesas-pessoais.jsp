<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="br.com.original.javaweb.despesas.dao.*,
            br.com.original.javaweb.despesas.model.*,
            java.util.*"
    %>
<!DOCTYPE html>
<html lang="pt">
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<title>Listagem de Despesas Pessoais</title>
</head>
<body>
  <div class="panel panel-default">
    <div class="panel-heading">Despesas Pessoais</div>
      <div class="panel-body">
           Listagem das ultimas despesas pessoais registradas:
      </div> 
    <table class="table">
      <thead>
        <tr>
         <th>Descri��o</th>
         <th>Categoria</th>
         <th>Data</th>
         <th>Valor</th>
         <th>Observa��es</th>
        </tr>
      </thead>  
      <tbody>
          <%-- Buscar os dados --%>
          <%
             DAODespesa dao = new DAODespesa();
             List<Despesa> despesas = dao.getDespesas();
          %>
          <%-- Inicio do Bloco de Repati��o --%>
          <%
            for (Despesa despesa : despesas) {
          %>
          <tr>
            <td><%= despesa.getDescricao() %></td>
            <td><%= despesa.getCategoria() %></td>
            <td><%= despesa.getData() %></td>
            <td><%= String.format("R$ %.2f",despesa.getValor()) %></td>
            <td><%= (despesa.getObservacoes() != null) ? despesa.getObservacoes() : "" %></td>
          </tr>
          <%
            }
          %>
          <%-- Fim do Bloco de Repati��o --%>
      </tbody>
    </table>
  
  </div>
</body>
</html>