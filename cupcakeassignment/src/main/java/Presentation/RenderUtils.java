package Presentation;

import java.time.LocalDate;

/**
 The purpose of RenderUtils is to...

 @author peter
 */
public class RenderUtils {

    public static String footer() {
        return "    <footer>\n"
                + "        <div class=\"container\">\n"
                + "            <div class=\"row\">\n"
                + "                <div class=\"col-lg-12 text-center\">\n"
                + "                    <p>Copyright &copy; Cupcake Assignment " + LocalDate.now().getYear() + "</p>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    </footer>";
    }

    public static String navBar() {
        return "<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n"
                + "                <ul class=\"nav navbar-nav\">\n"
                + "                    <li>\n"
                + "                        <a href=\"index.jsp\">Home</a>\n"
                + "                    </li>\n"
                + "                    <li>\n"
                + "                        <a href=\"login.jsp\">Login</a>\n"
                + "                    </li>\n"
                + "                    <li>\n"
                + "                        <a href=\"shop.jsp\">Blog</a>\n"
                + "                    </li>\n"
                + "                    <li>\n"
                + "                        <a href=\"contact.html\">Contact</a>\n"
                + "                    </li>\n"
                + "                </ul>\n"
                + "            </div>";
    }

    public static String title() {
        return "<div class=\"brand\">Cupcake Assignment</div>\n"
                + "    <div class=\"address-bar\">Week04 | "
                + "Frontend </div>";
    }
}
