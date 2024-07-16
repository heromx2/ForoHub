package com.herox.forohubalura.repository;

import com.herox.forohubalura.domain.usuarios.UserAPI;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserApiRepository extends JpaRepository<UserAPI, Long> {
}
