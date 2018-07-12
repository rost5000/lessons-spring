Spring boot приложение для загрузки в docker

*Важно!!!* Необходимо выбрать свой jar в зависимости от того какой образ используется в Docker файле.

Запуск:
 - Собрать проект:
    - ' ./gradlew asseble ' для gradle
    - ' mvn package ' для maven
 - собрать Docker образ: ' docker build -t lesson/docker-spring ./spring-docker/ '
 - Запустить образ: ' docker-compose up -d '
