FROM mcr.microsoft.com/devcontainers/base:ubuntu-22.04

# Установка утилит и зависимостей
RUN export DEBIAN_FRONTEND=noninteractive && \
    apt-get update && \
    apt-get -y install --no-install-recommends \
        sudo \
        ca-certificates \
        fonts-liberation \
        lsb-release \
        wget \
        gnupg \
        curl \
        unzip && \
    rm -rf /var/lib/apt/lists/*

# Устанавливаем рабочую директорию
WORKDIR /workspace

# Переключаемся на пользователя vscode
USER vscode
