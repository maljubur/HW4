# HW4 – Staff Role Implementation
CSE 360 – Individual HW4  
Author: Mustafa Al-jubury

---

## Overview
This repository contains my HW4 implementation for the **Staff** role features, built on top of our TP3 group project.

For this assignment I:
- Reviewed all six epics with my team.
- Selected five Staff-focused user stories.
- Designed, implemented, and tested those stories in this project.

---

## Purpose
Implement a subset of Staff-role functionality so that staff members can:
- Monitor questions, answers, and feedback.
- Respond to flagged content.
- Track issue resolution.

---

## Implemented Features
All features are implemented in `StaffDashboard.java`.

Staff can:

1. Staff can easily access and review the content.
2. Staff can view feedback that is visible only to them.
3. Staff can keep an eye on how users are interacting.
4. Staff can receive alerts when a problem comes up.
5. Staff can follow the progress and resolution of reported issues.

Each feature:
- Has its own method(s).
- Is demonstrated using sample data.

---

## Testing (JUnit)
Unit tests are located in `StaffDashboardTest.java`.

- Each user story has at least one dedicated test.
- `@BeforeEach` sets up a fresh `StaffDashboard` before every test.
- All tests currently pass.

---

## Documentation
- All public classes and methods include Javadoc comments.
- Javadoc was generated via Eclipse’s Javadoc tool.

---

## Screencast
A Zoom screencast walks through:

- The five implemented user stories.
- Running the JUnit test suite and interpreting results.
- Generated Javadoc.
- Explanation of how the code satisfies the requirements.

**Screencast Link:**  


---

## How to Run

1. Import/open the project in Eclipse (or any Java IDE).
2. To see the feature demo:
   - Run `StaffDashboard.java` as a Java
