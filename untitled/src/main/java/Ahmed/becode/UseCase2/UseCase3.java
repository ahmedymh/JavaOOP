package Ahmed.becode.UseCase2;
public class UseCase3 {
    private String type;
    private String title;
    private String text;
    private boolean isBreakingNews;

    public UseCase3(String type, String title, String text, boolean isBreakingNews) {
        this.type = type;
        this.title = title;
        this.text = text;
        this.isBreakingNews = isBreakingNews;
    }

    public String getTitle() {
        return isBreakingNews ? "BREAKING: " + title : title;
    }

    public String getModifiedTitle() {
        switch (type) {
            case "article":
                return getTitle();
            case "ad":
                return getTitle().toUpperCase();
            case "vacancy":
                return getTitle() + " - apply now!";
            default:
                return getTitle();
        }
    }

    public String displayWithHtmlTags() {
        String titleHtml = "<h2>" + getModifiedTitle() + "</h2>";
        String textHtml = "<p>" + text + "</p>";
        return titleHtml + textHtml;
    }
}

