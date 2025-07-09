# ✈️ Airline Reservation System – Java Project

A simple **Airline Reservation System** developed using **Java** and **MySQL** that allows users to search for flights, book tickets, and manage passenger data. This is a desktop-based application suitable for learning Java Swing and JDBC concepts.

## 🚀 Features

- 🛫 Search available flights
- 👤 Add passenger details
- 🎫 Book tickets and generate PNR
- 🧾 View and manage booking history
- 🛬 Admin panel for managing flights and destinations

## 🛠️ Technologies Used

| Technology | Description |
|------------|-------------|
| **Java**   | Core programming language |
| **Java Swing** | GUI (Graphical User Interface) |
| **JDBC**   | Java Database Connectivity for MySQL |
| **MySQL**  | Backend database for storing flight and passenger data |
| **XAMPP / WAMP** | Local server for database (if required) |

## 📂 Project Structure

airline-reservation/
│
├── src/
│   └── airline/
│       ├── Main.java                  # Entry point of the application
│       ├── DBConnection.java          # Handles MySQL connection using JDBC
│       ├── Login.java                 # Admin/User login GUI
│       ├── Dashboard.java             # Main dashboard after login
│       ├── AddCustomer.java          # GUI to add new passengers
│       ├── SearchFlight.java         # Search available flights
│       ├── BookTicket.java           # Book flight tickets
│       ├── ViewTicket.java           # View or search booked tickets
│       ├── FlightDetails.java        # Add/edit/delete flight details (admin)
│       ├── CancelTicket.java         # Cancel booked tickets
│       └── About.java                # About the system / credits
│
├── database/
│   └── airline_reservation.sql       # MySQL database dump
│
├── lib/
│   └── mysql-connector-java.jar      # MySQL JDBC Driver
│
├── README.md                         # Project documentation
├── LICENSE                           # (Optional) License file
└── airline-reservation.iml           # IntelliJ project file (if used)
