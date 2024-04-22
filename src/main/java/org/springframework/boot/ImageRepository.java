package org.springframework.boot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long> {

    @Query(value = "SELECT url FROM image_url WHERE image_id = :image_id", nativeQuery = true)
    List<String> imageGenerate(@Param("image_id") Long image_id);

}
