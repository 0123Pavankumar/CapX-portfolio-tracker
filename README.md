# Portfolio Tracker Application

This is a full-stack portfolio tracker application that allows users to manage their stock portfolios by adding, viewing, editing, and deleting stock holdings. It dynamically calculates the total portfolio value using real-time stock prices from an external API.

---

## Features

- **Frontend**: A responsive React web application for user interaction.
  - Dashboard with portfolio metrics (total value, top-performing stock, portfolio distribution).
  - Forms to add/edit stock details (e.g., stock name, ticker, quantity, buy price).
  - List view of current stock holdings with options to edit or delete them.

- **Backend**: A Spring Boot application that provides RESTful APIs for stock management and portfolio value calculation.
  - Supports CRUD operations for stock data.
  - Integration with a real-time stock price API (e.g., Alpha Vantage).
  - MySQL database for data persistence.

- **Deployment**:
  - Frontend: Deployed on Netlify.
  - Backend: Deployed on Heroku.

---

## Technologies Used

### **Frontend**
- **Framework**: React
- **Styling**: Material-UI, Chart.js
- **Deployment**: Netlify

### **Backend**
- **Framework**: Spring Boot
- **Database**: MySQL
- **ORM**: JPA with Hibernate
- **External API**: Alpha Vantage
- **Deployment**: Heroku

---
portfolio-tracker/
├── frontend/                          # Frontend React app
│   ├── src/
│   │   ├── components/
│   │   │   ├── Dashboard.js            # Portfolio dashboard
│   │   │   ├── AddEditStockForm.js     # Form for adding/editing stocks
│   │   │   ├── StockList.js            # List of stocks
│   │   ├── App.js                      # Main app component
│   │   ├── index.js                    # React entry point
│   │   ├── styles.css                  # CSS styling
|   └──package.json                     # Node.js package configuration (for the frontend)
├── backend/                           # Backend Java Spring Boot application
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── portfolio/
│   │   │   │               ├── controller/      # REST APIs
│   │   │   │               ├── service/         # Business logic
│   │   │   │               ├── repository/      # Data access
│   │   │   │               ├── model/           # Entity classes
│   │   │   │               ├── dto/             # Data Transfer Objects
│   │   │   │               ├── exception/       # Custom exceptions
│   │   │   │               └── PortfolioTrackerApplication.java
│   │   │   ├── resources/
│   │   │   │   ├── application.properties
│   │   │   │   ├── data.sql
│   │   │   │   └── schema.sql
|   └── pom.xml                          # Maven configuration (for the backend)
|   └── applications.properties.example  #Properties examples
└── test/
    └── java/
        └── com/
            └── example/
                └── portfolio/
                    ├── controller/      # Controller tests
                    ├── service/         # Service tests
                    └── PortfolioTrackerApplicationTests.java


