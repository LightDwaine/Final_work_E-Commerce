/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-11-23 01:39:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import carrinhocompras.modelo.CarrinhoCompras;
import carrinhocompras.modelo.CarrinhoCompraItem;
import produto.modelo.Produto;
import java.util.List;
import usuario.modelo.Usuario;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/cabecalho.jsp", Long.valueOf(1700703415614L));
    _jspx_dependants.put("/rodape.jsp", Long.valueOf(1700703415743L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("usuario.modelo.Usuario");
    _jspx_imports_classes.add("carrinhocompras.modelo.CarrinhoCompraItem");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("carrinhocompras.modelo.CarrinhoCompras");
    _jspx_imports_classes.add("produto.modelo.Produto");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>smdecommerce</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/principal.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top navbar-light bg-light border-bottom\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"Inicio\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/imagens/logo.png\" alt=\"\" width=\"26\" height=\"26\" class=\"d-inline-block align-text-top\">\n");
      out.write("                    smdecommerce\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarToggler01\" aria-controls=\"navbarToggler01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarToggler01\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/novoCliente.jsp\">Novo Cliente</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                    ");

                    Usuario usuario = (Usuario) session.getAttribute("usuario");
                    if (usuario != null && usuario instanceof Usuario) {
                    
      out.write("\n");
      out.write("                    <form class=\"d-flex\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Logout\" method=\"get\">\n");
      out.write("                        <input class=\"form-control me-2\" type=\"text\" readonly disabled value=\"Olá, ");
      out.print( usuario.getNome() );
      out.write("!\">\n");
      out.write("                        <button class=\"btn btn-outline-danger\" type=\"submit\">Sair</button>\n");
      out.write("                    </form>\n");
      out.write("                    ");
 
                    } else {
                    
      out.write("\n");
      out.write("                    <form class=\"d-flex\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Login\" method=\"post\">\n");
      out.write("                        <input class=\"form-control me-2\" type=\"text\" name=\"login\" placeholder=\"Login\" aria-label=\"Login\" required>\n");
      out.write("                        <input class=\"form-control me-2\" type=\"password\" name=\"senha\" placeholder=\"Senha\" aria-label=\"Senha\" required>\n");
      out.write("                        <button class=\"btn btn-outline-primary\" type=\"submit\">Entrar</button>\n");
      out.write("                    </form>\n");
      out.write("                    ");
 
                    }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");

            if (request.getAttribute("mensagem") != null) {
            
      out.write("\n");
      out.write("            <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\n");
      out.write("                ");
      out.print( request.getAttribute("mensagem") );
      out.write("\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("            </div>\n");
      out.write("            ");

            }
            
      out.write('\n');
    List<Produto> produtos = (List<Produto>) request.getAttribute("produtosEmEstoque");
    if (produtos != null && !produtos.isEmpty()) {

      out.write("\n");
      out.write("<div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("    ");

        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
    
      out.write("\n");
      out.write("    <div class=\"col\">\n");
      out.write("        <div class=\"card h-100\">\n");
      out.write("            <img src=\"\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <h5 class=\"card-title\">");
      out.print( p.getDescricao());
      out.write("</h5>\n");
      out.write("                <p class=\"card-text\">");
      out.print( p.getDescricao());
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\"><a href=\"AdicionarProdutoCarrinho?produtoId=");
      out.print( p.getId());
      out.write("\" class=\"btn btn-primary\">Comprar</a></small>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</div>\n");

    }

      out.write('\n');

    Cookie cookie = null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("smdecommerce.carrinho")) {
                cookie = c;
                break;
            }
        }
    }
    if (cookie != null && cookie.getValue().length() > 0) {

      out.write("\n");
      out.write("<hr/>\n");
      out.write("<h1>Carrinho de Compras</h1>\n");
      out.write("<table class=\"table table-striped\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th scope=\"col\">#</th>\n");
      out.write("            <th scope=\"col\">Produto</th>\n");
      out.write("            <th scope=\"col\">Quantidade</th>\n");
      out.write("            <th scope=\"col\">Preço R$</th>\n");
      out.write("            <th scope=\"col\">Total R$</th>\n");
      out.write("            <th scope=\"col\"></th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");

        DecimalFormat realFormat = new DecimalFormat("#,##0.00");
        List<CarrinhoCompraItem> itens = (List<CarrinhoCompraItem>) CarrinhoCompras.obterCarrinho(cookie.getValue());
        double total = 0;
        if (itens != null && !itens.isEmpty()) {
            for (int i = 0; i < itens.size(); i++) {
            
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <th scope=\"row\">");
      out.print( i + 1 );
      out.write("</th>\n");
      out.write("            <td>");
      out.print( itens.get(i).getProduto().getDescricao() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( itens.get(i).getQuantidade() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( realFormat.format(itens.get(i).getProduto().getPreco()) );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( realFormat.format(itens.get(i).getProduto().getPreco() * itens.get(i).getQuantidade()) );
      out.write("</td>\n");
      out.write("            <td><a href=\"RemoverProdutoCarrinho?produtoId=");
      out.print( itens.get(i).getProduto().getId() );
      out.write("\" class=\"btn btn-primary\" role=\"button\" aria-disabled=\"true\">Remover</a></td>\n");
      out.write("        </tr>\n");
      out.write("            ");

                total += itens.get(i).getProduto().getPreco() * itens.get(i).getQuantidade();
            }
        }  

      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("<h4>Total R$: ");
      out.print( realFormat.format(total) );
      out.write("</h4>\n");

    } else {

      out.write("\n");
      out.write("<div class=\"alert alert-info alert-dismissible fade show mt-4\" role=\"alert\">\n");
      out.write("    Sem produtos no carrinho de compras\n");
      out.write("    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("</div>\n");

    }

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"d-flex flex-column flex-sm-row justify-content-between pt-4 mt-4 border-top\">\n");
      out.write("                <p>&copy; ");
      out.print( java.util.Calendar.getInstance().get(java.util.Calendar.YEAR));
      out.write(" smdecommerce - Todos os direitos reservados</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </div>    \n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
