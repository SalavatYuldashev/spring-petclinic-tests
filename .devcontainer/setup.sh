#!/bin/bash

echo 'alias ll="ls -alF"' >> ~/.bashrc

echo "✅ Java version:"
java -version

echo "✅ Maven version:"
mvn -v

echo "✅ Chrome version:"
google-chrome --version

echo "✅ Dev container setup complete!"
