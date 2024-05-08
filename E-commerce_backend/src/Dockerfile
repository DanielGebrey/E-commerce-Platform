FROM mysql:8.0

version: '3.8'
services:
  mydb:
    cap_add:
      - SYS_NICE
    restart: always
    environment:
      MYSQL_DATABASE: root
      MYSQL_ROOT_PASSWORD: root
    ports:
      - '3306:3306'
    volumes:
      - db:/var/lib/mysql

volumes:
  db:
    driver: local
