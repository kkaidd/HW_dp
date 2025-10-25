# 🧪 Проект автоматизации тестирования

![Java](https://img.shields.io/badge/Java-17-orange)
![Gradle](https://img.shields.io/badge/Gradle-8.5-blue)
![Selenide](https://img.shields.io/badge/Selenide-6.17.2-green)
![Allure](https://img.shields.io/badge/Allure_Report-Enabled-purple)

---

## 📋 О проекте

Проект предназначен для автоматизированного тестирования веб-приложения.  
Используются **Selenide**, **JUnit5**, **Allure**, **Gradle**, а также паттерн **Page Object** для структурирования тестов.

---

## ⚙️ Стек технологий

<details>
<summary>Показать стек</summary>

- Java 17  
- Gradle 8.5  
- JUnit 5  
- Selenide 6.17.2  
- Allure Report  
- Jenkins  
- GitHub / GitLab CI  
- IntelliJ IDEA

</details>

---

## 🧩 Архитектура проекта

<details>
<summary>Показать структуру проекта</summary>

```
src
 ├── main
 │    └── java
 │         └── pages
 │              └── MainPage.java
 ├── test
 │    └── java
 │         ├── tests
 │         │    └── MainPageTests.java
 │         └── resources
 │              └── allure.properties
 └── build.gradle
```
</details>

---

## 🚀 Запуск тестов

<details>
<summary>Показать инструкции</summary>

### Локальный запуск
```bash
gradle clean test
```

### Запуск с Allure-отчётом
```bash
gradle clean test allureReport
```

### Запуск через Jenkins
1. Открыть задачу в Jenkins.  
2. Указать параметры окружения.  
3. Нажать **Build Now**.

</details>

---

## 📊 Отчёт Allure

<details>
<summary>Показать пример отчёта</summary>

![Allure Report Screenshot](images/screen/allure-report.png)

</details>

---

## 📸 Скриншоты

<details>
<summary>Показать изображения</summary>

| Этап | Скриншот |
|------|-----------|
| Главная страница | ![Main Page](images/screen/main-page.png) |
| Результаты тестов | ![Tests](images/screen/tests.png) |

</details>

---

## 🎥 Видео выполнения тестов

<details>
<summary>Показать видео</summary>

| Тест | Видео |
|------|--------|
| Авторизация | ![Video](images/video/test-login.gif) |
| Покупка товара | ![Video](images/video/test-purchase.gif) |

</details>

---

## 💬 Бот
💼 Telegram: [@kaidAQA]([https://t.me/username](https://t.me/kaidAQA))
