<%-- 
    Document   : sessao
    Created on : 24 de nov. de 2023, 12:13:21
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="usuario.modelo.Usuario"%>

<!DOCTYPE html>
<%
                    Usuario usuario = (Usuario) session.getAttribute("usuario");
                    if (usuario != null && usuario instanceof Usuario) {
                        if (usuario.isAdministrador()) {
                        
                %>
                