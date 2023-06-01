/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2023-03-30 16:47:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write("<html lang=\"en\">\n");
      out.write("<!--this is the jsp for being able to create the lists-->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>List</title>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "meta.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h1 class=\"text-center mt-4 mb-5\">Make Your List Here</h1>\n");
      out.write("  <div class=\"row justify-content-center\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("      <form method=\"post\" action=\"/savelist\" enctype=\"application/x-www-form-urlencoded\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"title\" class=\"mb-2\">Title</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"title\" id=\"title\" placeholder=\"Enter the title\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"index\" class=\"mb-2\">Index</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"index\" id=\"index\" placeholder=\"Enter the index\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"items\" class=\"mb-2\">Items</label>\n");
      out.write("          <small class=\"text-muted d-block mb-2\">Click add button to add items.</small>\n");
      out.write("          <div class=\"input-group mb-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"item\" id=\"item\" placeholder=\"Enter item\">\n");
      out.write("            <button class=\"btn btn-outline-secondary\" type=\"button\" id=\"add-btn\">Add</button>\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"list-group\" id=\"item-list\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary mt-3\">Save</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"notes\" class=\"row container-fluid\"></div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("  document.getElementById('add-btn').addEventListener('click', addItem);\n");
      out.write("\n");
      out.write("  function addItem() {\n");
      out.write("    var itemInput = document.getElementById('item');\n");
      out.write("    var itemList = document.getElementById('item-list');\n");
      out.write("    var newItem = document.createElement('li');\n");
      out.write("    newItem.setAttribute('class', 'list-group-item d-flex justify-content-between align-items-center');\n");
      out.write("    newItem.innerHTML = itemInput.value + '<input type=\"hidden\" name=\"item[]\" value=\"' + itemInput.value + '\">' +\n");
      out.write("      '<button class=\"btn btn-danger btn-sm remove-btn\">&times;</button>';\n");
      out.write("    itemList.appendChild(newItem);\n");
      out.write("    itemInput.value = '';\n");
      out.write("    var removeButtons = document.getElementsByClassName('remove-btn');\n");
      out.write("    for (var i = 0; i < removeButtons.length; i++) {\n");
      out.write("      removeButtons[i].addEventListener('click', removeItem);\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  function removeItem() {\n");
      out.write("    this.parentElement.remove();\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
