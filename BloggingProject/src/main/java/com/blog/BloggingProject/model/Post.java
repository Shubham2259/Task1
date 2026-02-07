//package com.blog.BloggingProject.model;
//
//import jakarta.persistence.*;
//
//@Entity
//
//public class Post {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @Column(name="Title")
//    private String title;
//    @Column(name="Content")
//    private String content;
//    @Column(name="Author")
//    private String author;
//
//    public Post() {
//    }
//
//    public Post(int id, String title, String author, String content) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.content = content;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    @Override
//    public String toString() {
//        return "Post{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                ", author='" + author + '\'' +
//                '}';
//    }
//}
