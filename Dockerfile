FROM java:8
ADD target/movie-0.0.1-SNAPSHOT.jar movie-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","movie-0.0.1-SNAPSHOT.jar" ]