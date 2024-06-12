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

## Endpoints
### User Endpoints:
- `[POST /users](http://localhost:8080/api/users/)`: Create a new user.
- `[GET /users](http://localhost:8080/api/users/)`: Retrieve all users.
- `[GET /users/{id}](http://localhost:8080/api/users/2)`: Retrieve a user by ID.
- `[PUT /users/{id}](http://localhost:8080/api/users/1)`: Update a user by ID.
- `[DELETE /users/{id}](http://localhost:8080/api/users/2)`: Delete a user by ID.

### Blog Post Endpoints:
- `[POST /posts](http://localhost:8080/api/posts/user/205/category/5/posts)`: Create a new blog post.
- `GET /posts`: Retrieve all blog posts with pagination support.
- `[GET /posts/{id}]http://localhost:8080/api/posts/category/1/posts`: Get Post by categories
- `(http://localhost:8080/api/posts/user/1/posts)`: Retrieve a blog post by user.
- `PUT /posts/{id}`: Update a blog post by ID.
- `DELETE /posts/{id}`: Delete a blog post by ID.
- `POST /posts/{postId}/images`: Upload an image for a blog post.

### Category Endpoints:
- `[POST /categories](http://localhost:8080/api/categories/)`: Create a new category.
- `[GET /categories](http://localhost:8080/api/categories/)`: Retrieve all categories.
- `[GET /categories/{id}](http://localhost:8080/api/categories/)`: Retrieve a category by ID.
- `PUT /categories/{id}`: Update a category by ID.
- `DELETE /categories/{id}`: Delete a category by ID.

### Comment Endpoints:
- `POST /posts/{postId}/comments`: Add a comment to a blog post.
- `GET /posts/{postId}/comments`: Retrieve all comments for a blog post with pagination support.
- `DELETE /comments/{id}`: Delete a comment by ID.

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
