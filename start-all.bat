start "ph-eureka-server" /D ph-eureka-server  mvn spring-boot:run
start "ph-oauth-server" /D ph-oauth-server mvn spring-boot:run
start "ph-zuul-api-gateway" /D ph-zuul-api-gateway mvn spring-boot:run
start "ph-customer-api" /D ph-customer-api mvn spring-boot:run
start "ph-vendor-api" /D ph-vendor-api mvn spring-boot:run
start "ph-search-api" /D ph-search-api mvn spring-boot:run
REM start "ph-hystrix-dashboard" /D ph-hystrix-dashboard mvn spring-boot:run
REM start "ph-turbine-dashboard" /D ph-turbine-dashboard mvn spring-boot:run
REM start "ph-config-server" /D ph-config-server mvn spring-boot:run