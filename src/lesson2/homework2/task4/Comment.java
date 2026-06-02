package lesson2.homework2.task4;

public class Comment extends Item {
    private int postId;
    private String name;
    private String email;
    private String body;

    public Comment() {}

    public Comment(int id, int postId, String name, String email, String body) {
        super(id);
        this.postId = postId;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "postId=" + postId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                "} " + super.toString();
    }
}
