package org.vaibhao.vk.ecommercesprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vaibhao.vk.ecommercesprinboot.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
