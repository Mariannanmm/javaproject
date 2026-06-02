package lesson2.homework2.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Post> postsList = new ArrayList<>();
        postsList.add(new Post(1, 1, "New Title", "text for body1"));
        postsList.add(new Post(2, 2, "One more title", "a little longer text for body2"));

        List<Comment> commentsList = new ArrayList<>();

        commentsList.add(new Comment(1, 1, "Biba", "user1@mail.com", "nice comment nuber 1"));
        commentsList.add(new Comment(1, 2, "Boba", "user2@mail.com", "amazing comment number2"));

        commentsList.add(new Comment(2, 3, "Aboba", "user3@mail.com", "short comment3"));


        for (Post post : postsList) {
            for (Comment comment : commentsList) {

                if (comment.getId() == post.getId()) {
                    post.addComment(comment);
                }
            }
        }


        System.out.println("====== РЕЗУЛЬТАТ СВЯЗЫВАНИЯ ПОСТОВ И КОММЕНТАРИЕВ ======");
        System.out.println(postsList);
    }


}
