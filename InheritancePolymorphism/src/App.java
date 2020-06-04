package InheritancePolymorphism.src;

public class App {
    public static void main(String[] args) throws Exception {
        // TextBox textBox = new TextBox();
        // Input input = new Input();

        // textBox.setText("Halo Dunia!");
        // textBox.clear();

        // input.disable();

        // System.out.println(input.isEnabled());

        // method atau field?

        // Point point1 = new Point(1,2); -instance
        // Point point2 = new Point(1,2);

        // System.out.println(point1.equals(point2));

        // TextBox textBox = new TextBox();
        // textBox.setText("Hello World!");

        // System.out.println(textBox.toString());

        // Point point1 = new Point(1,2);
        // Point point2 = new Point(1,2);

        // System.out.println(point1.hashCode());
        // System.out.println(point2.hashCode());

        // show(input);

        Input[] inputs = { new TextBox(), new CheckBox() };

        for (int i = 0; i < inputs.length; i++) {
            inputs[i].render();
        }

    }

    public static void show(Input input) {
        if (input instanceof TextBox) {
            TextBox textBox = (TextBox) input;
            textBox.setText("Text sudah diganti");
        }
        System.out.println(input);
    }
}
