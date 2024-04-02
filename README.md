# IRCTC Backend

This project is a Java application designed to serve as the backend system for IRCTC (Indian Railway Catering and Tourism Corporation). It provides functionalities to manage train schedules, ticket bookings, and passenger information.

## Features

- **Train Schedule Management**: Manage the schedule of trains including arrival and departure timings, stations, and routes.
- **Ticket Booking System**: Facilitate users to book train tickets, check seat availability, and manage reservations.
- **Passenger Information Management**: Store and manage passenger details including personal information and booking history.
- **Data Persistence**: Utilize databases or file systems to ensure persistent storage of crucial information.
- **Authentication and Authorization**: Implement secure authentication mechanisms for users and restrict access based on roles.

## Dependencies

- [JUnit](https://junit.org/): Testing framework for unit testing.
- [Guava](https://github.com/google/guava): Google's core libraries for Java.
- [Jackson Databind](https://github.com/FasterXML/jackson-databind): High-performance JSON processor.

## Usage

To build and run the application, ensure you have Gradle installed. Then, execute the following commands:

```bash
# Build the application
./gradlew build

# Run the application
./gradlew run
