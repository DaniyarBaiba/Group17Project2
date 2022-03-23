package JavaClass24;

public class BrowserTester {
    public static void main(String[] args) {

        BrowserClass [] browser={new GoogleChome(),new FireFox(), new Safari(), new IE(),};
        for (BrowserClass b: browser) {
            b.OpenBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }
        /*GoogleChome googleChome = new GoogleChome();
        googleChome.OpenBrowser();
        googleChome.loadPage("www.google.com");
        googleChome.testThePage();
        googleChome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.OpenBrowser();
        fireFox.loadPage("www.google.com");
        fireFox.testThePage();
        fireFox.closeBrowser();
        */

    }
}