package g_openClosedPrincipies.lab.e_square;

class Rectangle {

    private int m_width;
    private int m_height;

    Rectangle(int m_width, int m_height) {
        this.setWidth(m_width);
        this.setHeight(m_height);
    }

    Rectangle(int m_width) {
        this.setWidth(m_width);
        this.setHeight(m_width);
    }

    private void setWidth(int width) {
        m_width = width;
    }

    private void setHeight(int height) {
        m_height = height;
    }

    int getWidth() {
        return m_width;
    }

    int getHeight() {
        return m_height;
    }

    int getArea() {
        return m_width * m_height;
    }
}