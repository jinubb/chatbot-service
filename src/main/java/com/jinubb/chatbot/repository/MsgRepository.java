package com.jinubb.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jinubb.chatbot.entity.Msg;

@Repository
public interface MsgRepository extends JpaRepository<Msg, Long>{

}
