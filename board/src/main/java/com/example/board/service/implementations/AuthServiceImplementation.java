package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.service.AuthService;

@Service
public class AuthServiceImplementation implements AuthService {
    
    @Override
    public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto) {
        
      try {
        // 1. 입력받은 이메일이 테이블에 존재하는지 조회
        // findBy 사용x (데이터 자체가 필요한 것이 아니라, 있는 지 없는 지만 확인)
        // email -> (true, false)

        // 1-1. 1에 대한 조회결과가 true 중복된 이메일 응답 처리


        // 2. 입력받은 닉네임이 테이블에 존재하는지 조회
        // nickname -> (true, false)

        // 2-1. 2에 대한 조회결과가 true 중복된 닉네임 응답 처리


        // 3. 입력받은 휴대전화번호가 테이블에 존재하는지 조회
        // telNumber -> (true, false)

        // 3-1. 3에 대한 조회결과가 true 중복된 휴대전화번호 응답 처리


        // 4. 유저 레코드 삽입

        // 4-1. 유저 엔터티의 인스턴스 생성
        // (dto) -> userEntity 인스턴스

        // 4-2. 유저 엔터티 인스턴스 저장(save)


        // 5. 성공 응답 처리




      }catch (Exception exception) {
        // 데이터베이스 작업중에 발생하는 예외 데이터베이스 에러 처리
        

      }

      // 
    
    }
}
