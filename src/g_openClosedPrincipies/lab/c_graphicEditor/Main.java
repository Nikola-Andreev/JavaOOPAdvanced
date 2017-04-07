package g_openClosedPrincipies.lab.c_graphicEditor;

import g_openClosedPrincipies.lab.c_graphicEditor.abstracrions.Shape;
import g_openClosedPrincipies.lab.c_graphicEditor.models.Circle;
import g_openClosedPrincipies.lab.c_graphicEditor.models.GraphicEditor;
import g_openClosedPrincipies.lab.c_graphicEditor.models.Rectangle;

public class Main {
    public static void main(String[] args) {

        GraphicEditor ge = new GraphicEditor();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        ge.drawShape(rectangle);
        ge.drawShape(circle);
    }
}
