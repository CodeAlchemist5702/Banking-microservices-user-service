This repo is responsible for :
User Registration: Creating new user accounts.
User Authentication: Verifying credentials to log in.
User Profile Management: Viewing and updating personal information.
Authorization: Defining and checking user roles and permissions.

project structure:
Controller: Handles HTTP requests (UserController.java).
DTO: Data transfer objects for transferring data between layers (UserDTO.java).
Entity: Represents the database model (User.java).
Repository: Interface for database operations (UserRepository.java).
Service: Contains business logic (UserService.java and UserServiceImpl.java).
Exception Handling: Custom exceptions and global exception handler.
Utils: JWT token generation and validation.
