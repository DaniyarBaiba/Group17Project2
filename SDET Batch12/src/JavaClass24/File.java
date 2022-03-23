package JavaClass24;

public abstract class File{
    void edit() {
        System.out.println("it's edit");
    }

    void close() {
        System.out.println("it's closed");
    }

    abstract void open();
}

class JavaFile  extends File{
    @Override
    void open () {
        System.out.println("to open");
    }
    class WordFile  extends File{
        @Override
        void open () {
            System.out.println("we need notepad");
        }
        class PdfFile  extends File{
            @Override
            void open () {
                System.out.println("we need MS word");
            }
            //Create a class File that will have the following behaviors:
            // /open, edit, close. Edit and close are implemented method while open is an abstract.
            // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
            // Example: to open .
            // java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
        }


    }
}