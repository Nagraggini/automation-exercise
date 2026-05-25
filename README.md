<!-- 1. Státusz és Minőség -->
[![Java Selenium CI](https://github.com/Nagraggini/selenium-playground/actions/workflows/ci.yml/badge.svg)](https://github.com/Nagraggini/selenium-playground/actions/workflows/ci.yml)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/35d8eab8d0514685820cb6de0b8fb33a)](https://app.codacy.com/gh/Nagraggini/automation-exercise/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Nagraggini_automation-exercise&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Nagraggini_automation-exercise)

<!-- 2. Teszt adatok -->
<!-- [Coverage](.github/badges/jacoco.svg) -->
![Branches](.github/badges/branches.svg)

<!-- 3. Technológia és Eszközök -->
![Top Language](https://img.shields.io/github/languages/top/Nagraggini/automation-exercise)
![Selenium WebDriver](https://img.shields.io/badge/Selenium-WebDriver-333333?style=flat&logo=selenium&logoColor=43B02A)

<!-- 4. Egyéb -->
![License](https://img.shields.io/badge/license-MIT-green)


A projekt létrehozása és minden beállításhoz való útmutatót [itt](https://github.com/Nagraggini/selenium-playground/blob/main/README.md) találsz. 

[Programozásról szóló jegyzeteim](https://nagraggini.github.io/my-awesome-book/)

# Források

https://devhints.io/xpath
https://www.geeksforgeeks.org/software-testing/xpath-locators/

# Mappastruktúra

```bash
src/
├── main/
│   └── java/
│       └── com/company/
│           ├── pages/            <-- Ide jönnek a Page Object-ek (LoginPage, CartPage)
│           └── utils/            <-- Segédfájlok (Excel olvasó, konfiguráció betöltő)
└── test/
    └── java/
        └── com/company/
            ├── base/             <-- Ide jön a BaseTest és BaseWebUITest
            └── tests/            <-- Ide jönnek a tényleges tesztek (LoginTests, RegisterTests)
```

# Osztály diagramm

```bash
                  +-----------------------+
                  |      BaseTest         |  <-- Böngésző indítás, leállítás, screenshotok
                  +-----------+-----------+
                              |
                              v
                  +-----------------------+
                  |    BaseWebUITest      |  <-- Közös UI függvények (openPage, handleCookies)
                  +-----------+-----------+
                              |
            +-----------------+-----------------+
            |                                   |
            v                                   v
+-----------------------+           +-----------------------+
|  RegisterTests        |           |     CheckoutTests     |  <-- A konkrét tesztfájlok (@Test)
+-----------------------+           +-----------------------+
```
