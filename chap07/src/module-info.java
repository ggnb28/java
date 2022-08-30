module chap07 {
	requires java.se;
	// java.se 모듈이 필요함을 컴파일러에게 알림
	// 컴파일 : 소스프로그램(Source Code)을
	// 목적프로그램(Object Code - 기계친화적, java byte code) 번역해주는
	// 컴파일러 : 컴파일을 수행하는 프로그램
	// 링킹 : 목적코드와 라이브러리를 연결하는 행위
	// 정적링킹(컴파일 직후 링킹하여 실행가는한 파일을 생성)
	// vs 동적링킹 (실행시점에 링킹을 함, Dynamic Linking)
	// 프로그램 실행은 해당 목적코드와 라이브러리가 정적 또는 동적링킹되어 
	// 메모리에 적재(loading)되어 CPU가 명령을 수행하는것
}