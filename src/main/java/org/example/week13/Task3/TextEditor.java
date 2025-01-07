package org.example.week13.Task3;

class TextEditor {
    private TextFormatter textFormatter;

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String formatText(String text) {
        return this.textFormatter.formatText(text);
    }
}

class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.setTextFormatter(new UpperCaseFormatter());
        System.out.println(textEditor.formatText("Neki text da se formatuje u upper case"));

        textEditor.setTextFormatter(new LowerCaseFormatter());
        System.out.println(textEditor.formatText("Neki text da se formatuje u lower case"));

        textEditor.setTextFormatter(new CamelCaseFormatter());
        System.out.println(textEditor.formatText("Neki text da se formatuje u camel case"));
    }
}
