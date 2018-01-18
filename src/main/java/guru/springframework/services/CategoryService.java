package guru.springframework.services;

import java.util.List;

import guru.springframework.api.v1.model.CategoryDTO;

/**
 * Created by jt on 9/26/17.
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
