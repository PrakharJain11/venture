FROM wrlennon/alpine-java8-jre
COPY target/EquityList-0.0.1-SNAPSHOT.jar /Equity.jar
ENTRYPOINT ["java", "-jar", "/Equity.jar"]