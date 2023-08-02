<h1>자바웹개발워크북 5장 스프링부트 + JPA </h1>
<br>
<p> CRUD + 페이징 처리 + 검색 필터</p>
<br>
<br>


<h1>📆 개발일정</h1>
<br>
2023.06 ~ 2023.06<br><br>
<br>


<h1>⚡ 핵심기능</h1> <br>
<li> 등록 <br> <br>
&nbsp;&nbsp; : @Valid적용 , BoardController에서 RedirectAttributes를 통해 Result 라는 데이터 전달 
<br><br></li><br> <br>


<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/a0ea0e08-9164-4ecb-9846-9a529cb30766">
<br> <br>

<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/2e78ba7b-f01b-47fc-ae25-d424c1fe63dd">
<br> <br>


<li> 조회 <br> <br>
&nbsp;&nbsp; : PageRequestDTO의 getLink() 결과를 변수로 처리하고 링크를 통한 조회  
 <br><br></li><br> <br>


<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/c1df0db9-2f4c-45a1-b283-2f0436382dfe">
<br> <br>

 
<li> 삭제 <br> <br>
&nbsp;&nbsp; BoardController의 Remove이용, 삭제가 이루어지면 RedirectAttributes를 통해 result 값 전달 
<br><br></li><br> <br>
  
<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/73bdadca-42ba-4e61-a89d-5ff89c067f97">
<br> <br>
<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/5abe6118-e3f6-4e90-bbef-6c853c19f26d">
<br> <br>
 

<li> 수정 <br> <br>
&nbsp;&nbsp; : 수정은 POST방식으로 처리. 조회와 마찬가지로 PageRequestDTO의 getLink()를 통해서  
<br><br></li><br> <br>



<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/79a5f2c0-ebdb-4121-96c1-14a7acdd14ea">
<br> <br>
<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/2fe76b95-6680-48cc-9e9b-8fa9f6ff8678">
<br> <br>

  
<li> 페이징 <br> <br>
&nbsp;&nbsp; : PageRequestDTO에 변수추가, 반환타입은 PageResponseDTO , 검색 조건과 페이징 조건 문자열로 구성하는 getLink()추가 
 <br><br></li><br> <br>

<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/8fa986e3-af67-407c-963f-0f0101111c6f">
<br> <br>
  

<li> 검색 & 필터 <br> <br>
&nbsp;&nbsp; : PageRequestDTO에 변수추가, 반환타입은 PageResponseDTO , 검색 조건과 페이징 조건 문자열로 구성하는 getLink()추가 
 <br><br></li><br> <br>


<img width="700" alt="image" src="https://github.com/Btcantony/WebStudy-SpringBoot-05/assets/94521647/57e917b5-ee4d-49f9-8182-d8421745c1da">
<br> <br>
