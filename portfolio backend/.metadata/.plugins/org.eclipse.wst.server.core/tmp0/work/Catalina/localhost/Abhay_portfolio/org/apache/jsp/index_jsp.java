/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-12-04 08:52:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Abhay KUMAR TIWARI</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" />\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,600;0,700;0,800;1,300;1,400;1,600;1,700;1,800&display=swap\" rel=\"stylesheet\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"img/icons.png\">\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"main-content\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("         <div class=\"row head p-2 justify-content-end align-items-center mb-2\">\r\n");
      out.write("            <div class=\"col-md-4 p-2 change\"><h2>ABHAY KUMAR TIWARI</h2></div>\r\n");
      out.write("           <div class=\"col-md-2  headitem\"><a href=\"#section1\">Home</a></div>\r\n");
      out.write("           <div class=\"col-md-2  headitem\"><a href=\"#section2\" class=\"scroll\">About Me</a></div>\r\n");
      out.write("           <div class=\"col-md-2 headitem\"><a href=\"#section3\" class=\"scroll\">My Work</a></div>\r\n");
      out.write("           <div class=\"col-md-2 headitem\"><a href=\"#section4\">Contact Me</a></div>\r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <!-- home content   -->\r\n");
      out.write("         <div class=\"row \" id=\"section1 \">\r\n");
      out.write("             <div class=\"col-md-5  hero\">\r\n");
      out.write("                <div class=\"h-shape\"></div>\r\n");
      out.write("              <div class=\"col heroimg\" >\r\n");
      out.write("                <img  class=\"images\" src=\"img/hero.png\" alt=\"\">\r\n");
      out.write("              \r\n");
      out.write("             </div> \r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"col-md-7\" >\r\n");
      out.write("               <div class=\"row justify-content-center pt-5 \">\r\n");
      out.write("                <div class=\"col-6\">\r\n");
      out.write("                <h1 class=\"name\">\r\n");
      out.write("                    Hello, I'm <span>Abhay Kumar Tiwari.</span>\r\n");
      out.write("                    A full-stack Web Developer.\r\n");
      out.write("                </h1>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col-7\">\r\n");
      out.write("                <p class=\"text\">\r\n");
      out.write("                    I'm a full-stack Web Developer, I love to create beautiful and functional websites.\r\n");
      out.write("                    I'm very dedicated and hardworking person who always thrives to work on \r\n");
      out.write("                    end to end products. I enjoyed every step of creation, learning and development. \r\n");
      out.write("                </p>\r\n");
      out.write("                </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"row justify-content-center mt-2 align-items-center  \">\r\n");
      out.write("                <div class=\"col-md-3  download \"><a href=\"\">VIEW C.V</a> <span><i class=\"fas fa-download fa-xl\"></i></span></div>\r\n");
      out.write("               </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- about content -->\r\n");
      out.write("\r\n");
      out.write("              <!-- heading -->\r\n");
      out.write("              <div class=\"row mt-5 pt-5 pb-5\"  id=\"section2\">\r\n");
      out.write("                 <div class=\"row mt-5 main-title\">\r\n");
      out.write("                 <h2>About <span>me</span><span class=\"stats\">my stats</span></h2>\r\n");
      out.write("                 </div>          \r\n");
      out.write("\r\n");
      out.write("                 <div class=\"row mt-5\">\r\n");
      out.write("                  <div class=\"col-md-4\">\r\n");
      out.write("                   <div class=\"row justify-content-end\">\r\n");
      out.write("                    <div class=\"col-md-7 info\"><h3 class=\"infome\">Information About Me</h3>\r\n");
      out.write("                    <p class=\"para\">I love to create beautiful and functional websites.\r\n");
      out.write("                        I'm very dedicated and hardworking person who always thrives to work on \r\n");
      out.write("                        end to end products. I enjoyed every step of creation, learning and development.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  <div class=\"col-md-8 \">\r\n");
      out.write("                     <div class=\"row m-2  justify-content-center align-items-center\">\r\n");
      out.write("                  <div class=\"col-md-5 p-5 m-1 okk\"><p class=\"leftabouttext\">Learner</p></div>\r\n");
      out.write("                    <div class=\"col-md-5 m-1  okk\"><p class=\"leftabouttext\">Hard Worker</p></div>\r\n");
      out.write("                     <div class=\"col-md-5 p-5 m-1 okk\"><p class=\"leftabouttext\">Dedicated</p></div>\r\n");
      out.write("                   <div class=\"col-md-5 p-5 m-1 okk\"><p class=\"leftabouttext\">Focused</p></div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                   <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-md-3 last\"></div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                  <!-- Skills -->\r\n");
      out.write("                 <div class=\"row m-3 \" >\r\n");
      out.write("                    <div class=\"row m-2  justify-content-center align-items-center\">\r\n");
      out.write("                    <div class=\"col-md-3 \"><h2 class=\"skills\">MY SKILLS</h2></div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                     \r\n");
      out.write("                    <div class=\"row m-3 justify-content-around\"  >\r\n");
      out.write("                         <div class=\"col-md-5\">\r\n");
      out.write("                          <div class=\"row\">\r\n");
      out.write("                             <div class=\"row justify-content-space justify-content-around\" >\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >Html 5</div>\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >CSS</div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                        </div>\r\n");
      out.write("                          <div class=\"row\">\r\n");
      out.write("                            <div class=\"row justify-content-space justify-content-around\" >\r\n");
      out.write("                                <div class=\" col-md-4  skilldata\" >React JS(learning)</div>\r\n");
      out.write("                                <div class=\" col-md-3 skilldata\" >JAVA S.E</div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"row\">\r\n");
      out.write("                            <div class=\"row justify-content-space justify-content-around\">\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >J.D.B.C</div>\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >SWING</div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"row\">\r\n");
      out.write("                            <div class=\"row justify-content-space justify-content-around\" >\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >MYSQL</div>\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >ORACLE</div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          \r\n");
      out.write("                         </div>\r\n");
      out.write("                         <div class=\"col-md-5\"><div class=\"row\"></div>\r\n");
      out.write("                         <div class=\"row\">\r\n");
      out.write("                            <div class=\"row justify-content-space justify-content-around\" >\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\">JavaScript</div>\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >BOOTSTRAP</div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <div class=\"row\">\r\n");
      out.write("                            <div class=\"row justify-content-space justify-content-around\" >\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >SERVLETS</div>\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >J.S.P</div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <div class=\"row\">\r\n");
      out.write("                            <div class=\"row justify-content-space justify-content-around\" >\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >JSTL</div>\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >HIBERNATE</div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <div class=\"row\">\r\n");
      out.write("                            <div class=\"row justify-content-space justify-content-around\" >\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" >SPRING(LEARNING)</div>\r\n");
      out.write("                                <div class=\" col-md-2 skilldata\" ></div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row m-3 \" >\r\n");
      out.write("                        <div class=\"row m-2  justify-content-center align-items-center\">\r\n");
      out.write("                        <div class=\"col-md-3 \"><h2 class=\"skills\">MY TIMELINE</h2></div> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"container mt-5\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("                                    <div class=\"timeline\">\r\n");
      out.write("                                        <div class=\"timeline-item\">\r\n");
      out.write("                                            <div class=\"timeline-content\">\r\n");
      out.write("                                                <h3>TRAINING-JAVA-FULL STACK</h3>\r\n");
      out.write("                                                <p>DUCAT-The IT Training School,Sector 14, Gurugram,Haryana </p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"timeline-date\">June 2023-Present</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"timeline-item\">\r\n");
      out.write("                                            <div class=\"timeline-content\">\r\n");
      out.write("                                                <h3>Bachelor of Computer Application(B.C.A)</h3>\r\n");
      out.write("                                                <p>Aligarh College Of Enginnering And Technology</p>\r\n");
      out.write("                                                <p>C.G.P.A : 8.1</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"timeline-date\">2021-2023</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"timeline-item\">\r\n");
      out.write("                                            <div class=\"timeline-content\">\r\n");
      out.write("                                                <h3>Senior Secondary(XII)</h3>\r\n");
      out.write("                                                <p>Brilliant Public Sr. Sec. School, Aligarh,U.P,India</p>\r\n");
      out.write("                                                \r\n");
      out.write("                                                <p>PERCENTAGE : 69.60%</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"timeline-date\">2019-2020</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"timeline-item\">\r\n");
      out.write("                                            <div class=\"timeline-content\">\r\n");
      out.write("                                                <h3>Secondary(X)</h3>\r\n");
      out.write("                                                <p>Brilliant Public Sr. Sec. School, Aligarh,U.P,India</p>\r\n");
      out.write("                                                \r\n");
      out.write("                                                 <p>PERCENTAGE : 71.8O%</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"timeline-date\">2017-2018</div>\r\n");
      out.write("                                        </div>   \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>             \r\n");
      out.write("                </div>\r\n");
      out.write("    \r\n");
      out.write("                     <!-- my work -->\r\n");
      out.write("                <div class=\"row m-1\"  id=\"section3\" >\r\n");
      out.write("                        <div class=\"row  pt-5 pb-5\"  >\r\n");
      out.write("                           <div class=\"row mt-5 main-title\">\r\n");
      out.write("                              <h2> <span>Portfolio</span><span class=\"stats\">My Work</span></h2>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                               <div class=\"row m-3 p-3\">\r\n");
      out.write("                                   <p class=\"workhead\">Here is some of my work that I've done using various Technology.</p>\r\n");
      out.write("                                   <div class=\"row justify-content-around p-5 \">\r\n");
      out.write("                                      <div class=\"col-md-5 m-2\">\r\n");
      out.write("                                           <img src=\"img/Screenshot (1).png\" alt=\"\" class=\"work1\">\r\n");
      out.write("                                           <div class=\"row\" >\r\n");
      out.write("                                            <h2 class=\"worktext\"> MY PORTFOLIO WEBSITE</h2>\r\n");
      out.write("                                            <p>This website is designed using  HTML, CSS BOOTSTRAP.</p>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                      <div class=\"col-md-5 m-2\" >\r\n");
      out.write("                                        <img src=\"img/Screenshot 2023-11-28 223751.png\" alt=\"\" class=\"work1\">\r\n");
      out.write("                                        <div class=\"row\" >\r\n");
      out.write("                                         <h2 class=\"worktext\">ShopSavvy</h2>\r\n");
      out.write("                                         <p>It's an food delevery website building using following technology frontend using html,css,bootstrap\r\n");
      out.write("                                          JavaScript and for backend JAVA (Hibernate, Spring) and database handel with mysql using\r\n");
      out.write("                                          Apache Tomcat server (on going project).</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                      <div class=\"col-md-5 m-2\" ></div>\r\n");
      out.write("                                      <div class=\"col-md-5 m-2\" ></div>\r\n");
      out.write("                                \r\n");
      out.write("                                   </div>\r\n");
      out.write("                                </div>          \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                         <!-- contact -->\r\n");
      out.write("                         <div class=\"row m-1\"  id=\"section4\" >\r\n");
      out.write("                            <div class=\"row  pt-5 pb-5\">\r\n");
      out.write("                                <div class=\"row mt-5 main-title\">\r\n");
      out.write("                                <h2> <span>Contact Me</span><span class=\"stats\">Contact</span></h2>\r\n");
      out.write("                                </div>  \r\n");
      out.write("        \r\n");
      out.write("                             </div>\r\n");
      out.write("                        \r\n");
      out.write("                          <div class=\"row justify-content-around m-2 p-5\" >\r\n");
      out.write("                                <div  class=\" col-md-6 p-4\" >\r\n");
      out.write("                                    <h2  class=\"contacthead \">CONTACT ME HERE</h2>\r\n");
      out.write("                                    <p> <i class=\"fa-solid fa-location-dot fa-fade p-2\" style=\"color: #36f5ff;\"></i>Address:Sector-67, Sunrise Colony,Grugram,Haryana </p>\r\n");
      out.write("                                    <p><i class=\"fa-regular fa-envelope fa-fade p-2\" style=\"color: #36f5ff;\"></i>Email: abhaykumartiwari71@gamil.com</p>\r\n");
      out.write("                                    <p><i class=\"fa-regular fa-address-book fa-fade p-2\" style=\"color: #36f5ff;\"></i>Contact NO: 7900206974</p>\r\n");
      out.write("                                    <p><i class=\"fa-solid fa-language fa-fade p-2\" style=\"color: #36f5ff;\" ></i>Languages: English, Hindi</p>\r\n");
      out.write("                                    <p style=\"color: #36f5ff;\"><a href=\"https://github.com/Creater8/\"><i class=\"fa-brands fa-github fa-bounce fa-3x p-5\"></i></a>  <a href=\"https://www.twitter.com/\"><i class=\"fa-brands fa-x-twitter fa-bounce fa-3x\"></i></a></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div  class=\" col-md-6 p-1\" >\r\n");
      out.write("                                    <h2  class=\"contacthead \">SUBMIT FEEDBACK HERE</h2>\r\n");
      out.write("                                    <form action=\"submit.jsp\" method=\"post\">\r\n");
      out.write("                                        <input type=\"text\" class=\"formtext p-1 m-3\" placeholder=\"Enter Your Name\" name=\"name\" required>\r\n");
      out.write("                                        <input type=\"email\" class=\"formtext p-1 m-3\" placeholder=\" Enter Email\" name=\"email\" required>\r\n");
      out.write("                                       <textarea name=\"message\" placeholder=\"write feedback\" class=\"form-control-lg feedback w-75 p-3 m-3\" ></textarea>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <input type=\"submit\" value=\"SUBMIT\"  name=\"submit\" class=\"submit m-4 fa-fade \">\r\n");
      out.write("                                    \r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                               \r\n");
      out.write("                          </div>\r\n");
      out.write("                                        <div class=\"row justify-content-around m-2 p-4\">\r\n");
      out.write("                                            <div class=\"text-center p-4\" >\r\n");
      out.write("                                                © 2023 Copyright:\r\n");
      out.write("                                                <a class=\"text-reset fw-bold\" href=\"#\">https://creater8.github.io/Abhay_portfolio.github.io/</a>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
