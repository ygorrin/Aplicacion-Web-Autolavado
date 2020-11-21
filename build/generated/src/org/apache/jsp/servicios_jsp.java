package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class servicios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Servicios Los Eren</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\" />\n");
      out.write("        <!-- Font Awesome icons (free version)-->\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.13.0/js/all.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Google fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Varela+Round\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("          <!-- Navigation-->\n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"mainNav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"Loseren.html\">Home <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-house\" fill=\"currentColor\" xmlns=\"w3.org/2000/svg\">\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M2 13.5V7h1v6.5a.5.5 0 0 0 .5.5h9a.5.5 0 0 0 .5-.5V7h1v6.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5zm11-11V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z\"/>\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M7.293 1.5a1 1 0 0 1 1.414 0l6.647 6.646a.5.5 0 0 1-.708.708L8 2.207 1.354 8.854a.5.5 0 1 1-.708-.708L7.293 1.5z\"/>\n");
      out.write("                </svg></a>\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    Menu\n");
      out.write("                    <i class=\"fas fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"reserva.html\">Reserva Hora</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#signup\">Contacto <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-telephone-inbound-fill\" fill=\"currentColor\" xmlns=\"w3.org/2000/svg\">\n");
      out.write("                            <path fill-rule=\"evenodd\" d=\"M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.471 17.471 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969zM15.854.146a.5.5 0 0 1 0 .708L11.707 5H14.5a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 1 0v2.793L15.146.146a.5.5 0 0 1 .708 0z\"/>\n");
      out.write("                          </svg></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Masthead-->\n");
      out.write("        <header class=\"masthead\">\n");
      out.write("            <div class=\"container d-flex h-100 align-items-center\">\n");
      out.write("                <div class=\"mx-auto text-center\">\n");
      out.write("                    <h1 class=\"mx-auto my-0 text-uppercase\">Servicios</h1>\n");
      out.write("                    <a class=\"btn btn-primary js-scroll-trigger\" href=\"#about\">Servicios</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- About-->\n");
      out.write("        <section class=\"about-section text-center\" id=\"about\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 mx-auto\">\n");
      out.write("                        <p class=\"text-white-50\">\n");
      out.write("                                Compañia chilena constituida en el año 1990, \n");
      out.write("                                caracterizada por su buen servicio y ser comprometidos con usted. Since 1990 &copy;\n");
      out.write("                        </p>\n");
      out.write("                        <h2 class=\"text-white mb-4\">Lavados</h2>\n");
      out.write("                        <div style=\"overflow-x:auto;\">\n");
      out.write("                                  <table class=\"table\" id=\"tabla\">\n");
      out.write("                                      <tr>\n");
      out.write("                                        <th>Nombre Servicio</th>\n");
      out.write("                                        <th>Precio</th>\n");
      out.write("                                      </tr>\n");
      out.write("                                      <tr>\n");
      out.write("                                        <td>Lavado Exterior</td>\n");
      out.write("                                        <td>5000 CLP</td>\n");
      out.write("                                      </tr>\n");
      out.write("                                      <tr>\n");
      out.write("                                        <td>Lavado de Motor</td>\n");
      out.write("                                        <td>8000 CLP</td>\n");
      out.write("                                      </tr>\n");
      out.write("                                  </table>      \n");
      out.write("                              </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    \n");
      out.write("        <!-- Contact-->\n");
      out.write("        <section class=\"contact-section bg-black\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                        <div class=\"card py-4 h-100\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <i class=\"fas fa-map-marked-alt text-primary mb-2\"></i>\n");
      out.write("                                <h4 class=\"text-uppercase m-0\">Direccion</h4>\n");
      out.write("                                <hr class=\"my-4\" />\n");
      out.write("                                <div class=\"small text-black-50\">Av Providencia 2367, Santiago CL</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                        <div class=\"card py-4 h-100\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <i class=\"fas fa-envelope text-primary mb-2\"></i>\n");
      out.write("                                <h4 class=\"text-uppercase m-0\">Email</h4>\n");
      out.write("                                <hr class=\"my-4\" />\n");
      out.write("                                <div class=\"small text-black-50\"><a href=\"#!\">autolavadolE@loseren.com</a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 mb-3 mb-md-0\">\n");
      out.write("                        <div class=\"card py-4 h-100\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <i class=\"fas fa-mobile-alt text-primary mb-2\"></i>\n");
      out.write("                                <h4 class=\"text-uppercase m-0\">Telefono</h4>\n");
      out.write("                                <hr class=\"my-4\" />\n");
      out.write("                                <div class=\"small text-black-50\">+56987459316</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"footer bg-black small text-center text-white-50\"><div class=\"container\">Copyright © Your Website 2020</div></footer>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Third party plugin JS-->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
