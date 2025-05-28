# 🧪 Spring Petclinic Test

Этот проект — **автоматизированный набор тестов** для популярного
демо-приложения [Spring Petclinic](https://github.com/SalavatYuldashev/spring-petclinic), написанный на **Java с
использованием TestNG**.
Он создан в первую очередь **для обучения** , а также демонстрирует практики, приближённые к реальной работе QA-инженера
в команде.

> ⚙️ Проект в процессе активной разработки. Буду рад любым замечаниям и предложениям!

---

## 🎯 Цели проекта

- 📚 Освоить самые востребованные инструменты для тестирования Java-приложений
- 💼 Продемонстрировать реальные примеры юнит, API, UI, BDD и интеграционных тестов
- 🧱 Построить структуру, соответствующую индустриальным стандартам
- 🚀 Подключить CI/CD и систему отчётности Allure

---

## 📂 Структура проекта

```bash
spring-petclinic-tests/
├── README.md                # Главная документация проекта
├── pom.xml                  # Maven зависимости и плагины
├── docker-compose.yml       # Запуск окружения (petclinic + БД)
├── .github/workflows/       # CI-конфигурация GitHub Actions
├── src/
│   └── test/
│       ├── java/
│       │   ├── unit/         # Юнит-тесты (TestNG + Mockito)
│       │   ├── api/          # API-тесты (RestAssured)
│       │   ├── integration/  # Интеграционные тесты (Testcontainers)
│       │   ├── ui/           # UI-тесты (Selenide)
│       │   └── bdd/          # Step Definition классы (Cucumber)
│       └── resources/
│           └── features/     # .feature-файлы для BDD
└── docs/
    ├── test-strategy.md     # Пирамида тестирования и общая стратегия
    ├── test-cases.md        # Описание тест-кейсов
    ├── checklist.md         # Чек-листы для ручного тестирования
    └── bug-report-template.md # Шаблон баг-репортов
