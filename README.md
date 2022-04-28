#JPA-Study-Project

### Swagger2 적용 가이드
* [공식 사이트 링크(클릭)](https://swagger.io/resources/articles/documenting-apis-with-swagger/)
> ####build.gradle에 Swagger 관련 라이브러리 추가
> * implementation 'io.springfox:springfox-swagger2:2.9.2'
> * implementation 'io.springfox:springfox-swagger-ui:2.9.2'
> ####Swagger 2.9.2 버전 적용 시 스프링 부트 버전이 2.4.2보다 상위 버전일 경우 버전 수정 필요
> * id 'org.springframework.boot' version '2.4.2'
> ####Swagger 관련 설정 추가
> ```java
> import springfox.documentation.spring.web.plugins.Docket;
> import springfox.documentation.swagger2.annotations.EnableSwagger2;
>
> @Configuration
> @EnableSwagger2
> public class SwaggerConfiguration {
>  
>   @Bean
>   public Docket api() {
>       return new Docket(DocumentationType.SWAGGER_2)
>               .apiInfo(apiInfo())
>               .select()
>               .apis(RequestHandlerSelectors.basePackage("com.example.jpasample")) // 프로젝트 패키지 경로에 맞게 수정
>               .paths(PathSelectors.any())
>               .build();
>   }
>
>   private ApiInfo apiInfo() {
>       return new ApiInfoBuilder()
>               .title("JPA-Study-Project API Test with Swagger") // 프로젝트 제목
>               .description("설명 부분") // 프로젝트 설명
>               .version("1.0.0") // 프로젝트 버전
>               .build();
>   }
>
>}
>```
> ####RestController에 @ApiOperation 어노테이션 추가
> ```java
> /**
> ** 예시 **
> * OOO의 상태를 조회
> * @return 
> */
> @ApiOperation("상태별 OOO 조회")
> @RequestMapping(value="/bystatus/get", method=RequestMethod.GET)
> public List<SomeDto> getByStatus() {
> SearchStatus searchStatus = new SearchStatus();
> List<SomeDto> listBlahblah = inspRsltService.listSomeStatus(searchStatus);
> return listBlahblah;
> }
> ```
> #### Swagger를 이용한 API 문서 확인
> * http://localhost:8080/swagger-ui.html로 접속