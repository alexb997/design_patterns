# Chain of Responsibility Pattern Example

This project demonstrates the **Chain of Responsibility** pattern through a support system where different levels of support (Basic, Advanced, and Supervisor) handle customer requests based on the severity of the issue.

## Project Structure

- `src/handler/SupportHandler.java`: Abstract class for support handlers. Includes logging and escalation logic.
- `src/handler/BasicSupportHandler.java`: Handles basic (low severity) requests.
- `src/handler/AdvancedSupportHandler.java`: Handles advanced (medium severity) requests.
- `src/handler/SupervisorSupportHandler.java`: Handles supervisor-level (high severity) requests.
- `src/model/SupportRequest.java`: Class representing the support request, including severity level, issue type, and customer details.
- `src/Main.java`: Entry point to demonstrate the support system and how requests are handled.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/handler/*.java src/model/*.java src/Main.java


   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

The output will show how each support request is processed and whether it is escalated to the next handler:

```bash
Handling Request 1:
BasicSupportHandler is processing request: SupportRequest{requestId='REQ123', severityLevel=1, issueType='Password reset', customerId='CUST001'}
Basic Support handled request: REQ123

Handling Request 2:
BasicSupportHandler is processing request: SupportRequest{requestId='REQ124', severityLevel=2, issueType='Unable to connect', customerId='CUST002'}
Request REQ124 has been escalated to the next level.
AdvancedSupportHandler is processing request: SupportRequest{requestId='REQ124', severityLevel=2, issueType='Unable to connect', customerId='CUST002'}
Advanced Support handled request: REQ124

Handling Request 3:
BasicSupportHandler is processing request: SupportRequest{requestId='REQ125', severityLevel=3, issueType='System crash', customerId='CUST003'}
Request REQ125 has been escalated to the next level.
AdvancedSupportHandler is processing request: SupportRequest{requestId='REQ125', severityLevel=3, issueType='System crash', customerId='CUST003'}
Request REQ125 has been escalated to the next level.
SupervisorSupportHandler is processing request: SupportRequest{requestId='REQ125', severityLevel=3, issueType='System crash', customerId='CUST003'}
Supervisor handled request: REQ125
```

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir ChainOfResponsibilityExample
   cd ChainOfResponsibilityExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/handler
   mkdir src/model
   ```

3. **Create java files:**

   *Create SupportHandler.java, BasicSupportHandler.java, AdvancedSupportHandler.java, and SupervisorSupportHandler.java in the src/handler directory.
   *Create SupportRequest.java in the src/model directory.
   \*Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/handler/*.java src/model/SupportRequest.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how the Chain of Responsibility Pattern can be used to handle different levels of support requests and automatically escalate unresolved issues.
