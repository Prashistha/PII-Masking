

# PII Data Masking Application

## Overview

This Spring Boot application demonstrates how to securely mask Personally Identifiable Information (PII) in a RESTful service. It includes dynamic data masking using custom annotations to protect sensitive information like Social Security Numbers (SSN), phone numbers, passwords, and account details before they are returned in API responses.

## Features

- **Dynamic PII Masking:** Sensitive fields such as SSNs, phone numbers, and passwords are masked before being exposed to the client.
- **Custom Annotations:** The application uses a custom `@MaskData` annotation to specify which fields need to be masked.
- **JSON Serialization:** Implements a custom serializer to obfuscate PII fields dynamically during serialization.

## Technologies Used

- **Spring Boot**: Framework for building RESTful web services.
- **Lombok**: For reducing boilerplate code in the model classes.
- **Jackson**: For handling JSON serialization.
- **Maven**: Build automation and dependency management.

## Project Structure

- **HomeController.java**: A simple controller that handles the root endpoint and displays a welcome message.
- **UserController.java**: Handles user-related API requests such as fetching all users and retrieving specific user details.
- **MaskData.java**: A custom annotation used to mark fields that need masking.
- **ProtectDataSerializer.java**: Implements custom logic to mask sensitive fields like SSNs or account numbers during serialization.
- **AccountDetails.java**: Represents user account details, including account numbers, which are masked.
- **UserDetails.java**: A model class representing user data such as ID, SSN, phone number, and account details, with sensitive fields masked.

## How It Works

1. **Data Masking Annotation:**  
   Fields in the `UserDetails` and `AccountDetails` models that are sensitive are annotated with `@MaskData`.

2. **Custom Serializer:**  
   The `ProtectDataSerializer` class is responsible for masking data. For example, SSNs are masked to only show the last four digits, and the rest are replaced by "x" characters.

3. **Controller Methods:**  
   - `/users`: Fetches all user details, with sensitive fields masked.
   - `/users/{id}`: Fetches the details of a specific user by ID, with masked sensitive data.

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Prashistha/PII-Masking.git
   cd PII-Masking
   ```

2. **Build the project using Maven:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API:**
   - Welcome message: `http://localhost:8080/`
   - List all users: `http://localhost:8080/users`
   - Get user by ID: `http://localhost:8080/users/{id}`

## Example API Response

Here’s an example of the JSON response for a user:
```json
{
  "id": 1,
  "name": "John Doe",
  "ssn": "xxx-xx-6789",
  "phoneNumber": "xxx-xx-1234",
  "age": 30,
  "userName": "john123",
  "password": "xxxxxx",
  "accountDetails": [
    {
      "accountHolderName": "John Doe",
      "accountNumber": "xxxxxxx1234",
      "accountType": "SAVINGS"
    }
  ]
}
```

## Real-World Application

This application is useful in industries like:
- **Banking and Finance**: Securely mask sensitive financial data before displaying it to clients.
- **Healthcare**: Protect patient information like SSNs or medical records.
- **E-commerce**: Safeguard user details such as passwords and account numbers.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License.




