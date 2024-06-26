package com.simple.photo.userframe;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*database에 쿼리를 이용해서 CRUD를 하는 계층(Data Access Layer)*/
@Repository
public interface UserframeRepository extends JpaRepository<Userframe, Long> {

    List<Userframe> findByUserNumAndUserId(int userNum, String userId);

    @Transactional
    void deleteByUserNumAndUserIdAndFrameName(int userNum, String userId, String frameName);
}
