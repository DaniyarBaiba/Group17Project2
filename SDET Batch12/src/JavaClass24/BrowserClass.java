package JavaClass24;

public class BrowserClass {
    void OpenBrowser () {
        System.out.println("Opening the browser");
    }
    void loadPage (String websiteLink) {
        System.out.println("Loading the website "+ websiteLink);
    }
    void testThePage () {
        System.out.println("Testing the page");
    }
    void closeBrowser () {
        System.out.println("Closing the Browser");
    }
}
class GoogleChome extends BrowserClass {
    void OpenBrowser() {
        System.out.println("Opening the browser GoogleChome");
    }

    void loadPage(String websiteLink) {
        System.out.println("Loading the website " + websiteLink + " GoogleChome");
    }

    void testThePage() {
        System.out.println("Testing the page GoogleChome");
    }

    void closeBrowser() {
        System.out.println("Closing the Browser GoogleChome");
    }
}
    class FireFox extends BrowserClass {
        void OpenBrowser() {
            System.out.println("Opening the browser FireFox");
        }

        void loadPage(String websiteLink) {
            System.out.println("Loading the website " + websiteLink + " FireFox");
        }

        void testThePage() {
            System.out.println("Testing the page FireFox");
        }

        void closeBrowser() {
            System.out.println("Closing the Browser FireFox");

        }
    }
class Safari extends BrowserClass {
    void OpenBrowser() {
        System.out.println("Opening the browser Safari");
    }

    void loadPage(String websiteLink) {
        System.out.println("Loading the website " + websiteLink + " Safari");
    }

    void testThePage() {
        System.out.println("Testing the page Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the Browser Safari");

    }
}
class IE extends BrowserClass {
    void OpenBrowser() {
        System.out.println("Opening the browser IE ");
    }

    void loadPage(String websiteLink) {
        System.out.println("Loading the website " + websiteLink + " IE ");
    }

    void testThePage() {
        System.out.println("Testing the page IE ");
    }

    void closeBrowser() {
        System.out.println("Closing the Browser IE ");

    }
}