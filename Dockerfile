FROM apache/skywalking-base:8.4.0-es6
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
WORKDIR /app
ENV SW_AGENT_COLLECTOR_BACKEND_SERVICES="10.9.9.2:11800" \
    SW_AGENT_NAME="service-product"
CMD java -javaagent:/skywalking/agent/skywalking-agent.jar \
         -jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]