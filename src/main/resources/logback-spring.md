<?xml version="1.0" encoding="UTF-8"?>
<configuration debug="true">

    <!-- Appenders -->
    <!--  appender: 전달받은 로그를 어디에 출력할지 결정(콘솔 출력, 파일 저장, 데이터베이스 저장 등)  -->
    <appender name="console" class="ch.qos.logback.core.ConsoleAppender">
        <!--  encoder: appender에 포함되어 출력할 로그의 형식 지정      -->
        <encoder>
            <Pattern>%d %5p [%c] %m%n</Pattern>
        </encoder>
    </appender>

    <appender name="console-infolog" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <Pattern>%d %5p %m%n</Pattern>
        </encoder>
    </appender>

    <!-- Logger -->
    <!-- Logger: 로그를 출력하는 요소 / level 속성을 통해 출력할 로그의 레벨을 조절하여 appender에 전달   -->
    <logger name="com.example.jpasample" level="DEBUG" appender-ref="console" />
    <logger name="jdbc.sqlonly" level="INFO" appender-ref="console-infolog" />
    <logger name="jdbc.resultsettable" level="INFO" appender-ref="console-infolog" />

    <!-- Root Logger -->
    <root level="off">
        <appender-ref ref="console" />
    </root>
</configuration>

<!--
    ## 로그의 레벨
    fatal: 아주 심각한 에러가 발생한 상태
    error: 요청을 처리하던 중 문제가 발생한 상태
    warn:프로그램 실행에는 문제가 없지만, 나중에 시스템 에러의 원인이 될 수 있는 경고성 메시지
    info: 어떠한 상태 변경과 같은 정보성 메시지
    debug: 개발 시에 디버그 용도로 사용하는 메시지
    trace: 버그 레벨이 너무 광범위한 것을 해결하기 위해 좀 더 상세한 이벤트
-->

<!--
    ## 로그의 타입
    sqlonly: SQL을 로그로 남기며, Prepared Statement와 관련된 파라미터는 자동으로 변경되어 SQL을 출력
    sqltiming: 	SQL과 SQL 실행 시간(milliseconds 단위)을 출력
    audit: ResultSet을 제외한 모든 JDBC 호출 정보를 출력 / JDBC 관련 문제를 추적하는 경우를 제외하고는 사용이 권장되지 않음
    resultset: ResultSet을 포함한 모든 JDBC 호출 정보를 출력
    resultsettable: SQL 조회 결과를 테이블 형태로 출력
    connection: Connection의 연결과 종료에 관련된 로그를 출력 / 커넥션 누수 문제 해결에 도움
-->