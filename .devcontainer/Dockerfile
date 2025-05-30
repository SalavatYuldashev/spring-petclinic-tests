FROM mcr.microsoft.com/devcontainers/base:ubuntu-22.04

# Установка базовых утилит и Chrome
RUN export DEBIAN_FRONTEND=noninteractive && \
    apt-get update && \
    apt-get install -y --no-install-recommends \
        sudo \
        ca-certificates \
        fonts-liberation \
        lsb-release \
        wget \
        gnupg \
        curl \
        unzip && \
    # Установка Google Chrome
    wget -q -O - https://dl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google-chrome.list' && \
    apt-get update && \
    apt-get install -y google-chrome-stable && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /workspace

USER vscode
