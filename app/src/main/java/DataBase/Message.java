package DataBase;

public class Message {
    private String author;
    private String message;
    private long date;
    private String imageURL;

    public Message(String author, String message,long date,String imageURL) {
        this.author = author;
        this.message = message;
        this.date=date;
        this.imageURL=imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Message(){}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
