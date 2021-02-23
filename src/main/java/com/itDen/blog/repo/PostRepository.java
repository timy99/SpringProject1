package com.itDen.blog.repo;

import com.itDen.blog.models.Post;
import org.springframework.data.repository.CrudRepository;
//встроенный интерфейс который имеет уже готовые функции
/*для записи
удаления
обновления
вытягивания из таблицы
 */

public interface PostRepository extends CrudRepository<Post,Long> {
}
