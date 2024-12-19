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

## Project Structure

```plaintext
portfolio-tracker/
├── frontend/               # React frontend
│   ├── public/             # Public assets
│   ├── src/                # Source files
│   │   ├── components/     # React components
│   │   ├── services/       # API service calls
│   │   └── App.js          # Main React component
│   ├── .env.example        # Example environment variables
│   └── package.json        # Frontend dependencies
├── backend/                # Spring Boot backend
│   ├── src/                
│   │   ├── main/           # Application source
│   │   └── test/           # Test cases
│   ├── pom.xml             # Maven dependencies
│   └── application.properties.example # Example backend configuration
└── README.md               # Documentation
