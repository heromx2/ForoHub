package com.herox.forohubalura.repository;

import com.herox.forohubalura.domain.usuarios.UserForo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserForoRepository extends JpaRepository<UserForo, Long> {
}
