package structural_design_pattern;

public class Proxy {
}

interface Image {
    void display();
}

class Real implements Image {
    String file_name;

    Real(String file_name) {
        this.file_name = file_name;
        loadImage();
    }

    @Override
    public void display() {
        System.out.println("Image is displayed");
    }

    void loadImage() {
        System.out.println(file_name + " is loaded");
    }
}

class ProxyImage implements Image {

    private Image real;
    String file_name;

    ProxyImage(String file_name) {
        this.file_name = file_name;
    }

    @Override
    public void display() {
        if (real == null) real = new Real(file_name);
        real.display();
    }
}

class Main2 {
    public static void main(String[] args) {
        Image image = new ProxyImage("abc");

        image.display();
        System.out.println();
        image.display();
    }
}
