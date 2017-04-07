package g_openClosedPrincipies.lab.c_graphicEditor.models;

import g_openClosedPrincipies.lab.c_graphicEditor.abstracrions.Shape;

public class GraphicEditor {
    public void drawShape(Shape shape) {
        System.out.println(shape.draw());
    }
}