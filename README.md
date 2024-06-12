# Blog API

## Overview
This project is a RESTful Blog API developed using Java Spring Boot, leveraging Hibernate and JPA for ORM, and MySQL as the database. The API allows users to perform CRUD (Create, Read, Update, Delete) operations on blog posts, manage users, categories, and comments, handle image uploads, and supports pagination for retrieving large sets of data.

## Features
1. **User Management**:
   - Create, read, update, and delete user profiles.

2. **Blog Post Management**:
   - Create new blog posts.
   - Retrieve a list of all blog posts or specific posts by ID.
   - Update existing blog posts.
   - Delete blog posts.
   - Associate posts with categories.
   - Add images to posts.

3. **Category Management**:
   - Create, read, update, and delete categories.
   - Assign categories to blog posts.

4. **Comment Management**:
   - Add comments to blog posts.
   - Retrieve comments for specific blog posts.
   - Delete comments.

5. **Pagination**:
   - Retrieve paginated lists of blog posts, comments, and categories for efficient data handling and improved performance.

6. **Image Handling**:
   - Upload and associate image files with blog posts.

## Technologies Used
- **Java Spring Boot**: Framework for building the application, enabling rapid development and easy integration with other technologies.
- **Hibernate**: ORM tool for mapping Java objects to database tables.
- **JPA (Java Persistence API)**: Simplifies data access and manipulation.
- **MySQL**: Relational database management system used to store data.
- **Spring Data JPA**: Facilitates data access using repository interfaces.
- **Spring Web**: Handles RESTful web services.
- **Spring Boot Starter Validation**: Provides validation support.
- **Spring Boot Starter Thymeleaf**: Template engine for generating HTML.
- **Spring Boot Starter Mail**: Email support.
- **Spring Boot Starter Test**: Testing support.

## EndpointsUsers
Add User

- Method: POST
URL: http://localhost:8080/api/users/
Get Users

- Method: GET
URL: http://localhost:8080/api/users/
Get Single User

- Method: GET
URL: http://localhost:8080/api/users/5
Update User

- Method: PUT
URL: http://localhost:8080/api/users/1
Delete User

- Method: DELETE
URL: http://localhost:8080/api/users/2
Categories
Add Category

- Method: POST
URL: http://localhost:8080/api/categories/
Get Categories

- Method: GET
URL: http://localhost:8080/api/categories/
Posts
Create Post

- Method: POST
URL: http://localhost:8080/api/posts/user/205/category/5/posts
Get Posts By User

- Method: GET
URL: http://localhost:8080/api/posts/user/1/posts
Get Posts By Category

- Method: GET
URL: http://localhost:8080/api/posts/category/1/posts
Get All Posts

- Method: GET
URL: http://localhost:8080/api/posts
Update Post

- Method: PUT
URL: http://localhost:8080/api/posts/posts/4
Pagination Check

- Method: GET
URL: http://localhost:8080/api/posts/posts?pageNumber=0&pageSize=3
Sorting

- Method: GET
URL: http://localhost:8080/api/posts/posts?pageNumber=0&pageSize=3&sortBy=postId&sortDir=desc
Search Post

- Method: GET
URL: http://localhost:8080/api/posts/posts/search/recession
Images
Send Image

- Method: POST
URL: http://localhost:8080/api/post/image/upload/1
Get Image

- Method: GET
URL: http://localhost:8080/api/post/image/Ashutosh_logo1.png
Comments
Add Comment (Post 4)

- Method: POST
URL: http://localhost:8080/api/posts/4/comments
Add Comment (Post 2)

- Method: POST
URL: http://localhost:8080/api/posts/2/comments

## Configuration
**application.properties**:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/blogdb
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.servlet.multipart.max-file-size=2MB
spring.servlet.multipart.max-request-size=2MB
