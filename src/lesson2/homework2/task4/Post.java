package lesson2.homework2.task4;

import java.util.ArrayList;
import java.util.List;

public class Post extends Item{
    private int userId;
    private String title;
    private String body;
    private List<Comment> comments = new ArrayList<>();

    public Post() {}

    public Post(int id, int userId, String title, String body) {
        super(id);
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", comments=" + comments +
                "} " + super.toString();
    }
}
