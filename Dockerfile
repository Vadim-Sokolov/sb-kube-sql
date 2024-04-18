FROM openjdk:17
EXPOSE 8080
ADD target/sb-kube-sql.jar sb-kube-sql.jar
ENTRYPOINT ["java","-jar","/sb-kube-sql.jar"]