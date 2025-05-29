# Используем базовый образ с Java 17 и общими инструментами разработки.
# См. https://github.com/microsoft/vscode-dev-containers/tree/main/containers/java
FROM mcr.microsoft.com/devcontainers/java:0-17-bullseye

# Пользователь 'vscode' создается в базовом образе и имеет доступ sudo NOPASSWD.
# Мы установим Maven.
USER root

# Установка Maven
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends maven

# Установка Google Chrome и его зависимостей
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends wget gnupg ca-certificates \
    && wget -q -O - https://dl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list' \
    && apt-get update \
    && apt-get -y install --no-install-recommends google-chrome-stable \
    && rm -rf /var/lib/apt/lists/*

# Возвращаемся к пользователю vscode
USER vscode

# [Необязательно] Вы можете установить здесь другие глобальные инструменты, если это необходимо.
# Например:
# RUN sudo apt-get update \
#    && sudo apt-get -y install <ваш-инструмент>

# [Необязательно] Если в вашем проекте есть wrapper, вам может не понадобиться устанавливать Maven глобально.
# Вместо этого вы можете использовать Maven Wrapper (mvnw), предоставленный в вашем проекте.
# В этом случае убедитесь, что ваш postCreateCommand или другие скрипты используют ./mvnw вместо mvn.

# Устанавливаем рабочий каталог
WORKDIR /workspace

# Вы можете раскомментировать следующую строку, чтобы скопировать файлы вашего проекта в образ во время сборки.
# Однако для dev-контейнеров более распространено монтирование вашего локального рабочего пространства.
# COPY . /workspace

# [Необязательно] Если вы хотите предварительно собрать зависимости для ускорения запуска:
# COPY pom.xml .
# RUN mvn dependency:go-offline -B

# Очищаем списки apt-get
USER root
RUN rm -rf /var/lib/apt/lists/*
USER vscode 