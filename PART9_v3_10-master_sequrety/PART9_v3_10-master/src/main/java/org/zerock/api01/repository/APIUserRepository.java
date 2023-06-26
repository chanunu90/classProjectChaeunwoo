package org.zerock.api01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.api01.domain.APIUser;

public interface APIUserRepository extends JpaRepository<APIUser, String> {

}
