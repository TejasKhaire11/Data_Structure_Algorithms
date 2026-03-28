class Node {
    String data;
    Node next;
    Node back;

    Node(String data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class browser {

    Node currentPage;

    browser(String homepage) {
        currentPage = new Node(homepage);
    }

    void visit(String url) {
        Node newNode = new Node(url);
        currentPage.next = newNode; // ✅ link current → new page
        newNode.back = currentPage; // ✅ link new page ← current
        currentPage = newNode;      // ✅ move to new page
    }

    String back(int steps) {
        while (steps > 0 && currentPage.back != null) { // ✅ condition fixed
            currentPage = currentPage.back;
            steps--;
        }
        return currentPage.data;
    }

    String forward(int steps) {
        while (steps > 0 && currentPage.next != null) { // ✅ condition fixed
            currentPage = currentPage.next;
            steps--;
        }
        return currentPage.data;
    }

    public static void main(String[] args) {

        browser browser = new browser("google.com");
        browser.visit("youtube.com");
        browser.visit("github.com");
        browser.visit("chat.openai.com");

        System.out.println("Current: " + browser.currentPage.data); // chat.openai.com
        System.out.println("Back 2: " + browser.back(2));           // youtube.com
        System.out.println("Forward 1: " + browser.forward(1));     // github.com
        browser.visit("leetcode.com");
        System.out.println("Visit leetcode: " + browser.currentPage.data); // leetcode.com
        System.out.println("Back 3: " + browser.back(3));           // google.com
    }
}
