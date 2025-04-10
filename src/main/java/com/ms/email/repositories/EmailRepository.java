package com.ms.email.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
    // Interface para persistir os dados do email no banco de dados
    // Extende a interface JpaRepository para ter acesso aos métodos de persistência de dados.

}
