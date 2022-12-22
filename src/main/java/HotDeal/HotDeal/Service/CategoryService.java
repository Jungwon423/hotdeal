package HotDeal.HotDeal.Service;

import HotDeal.HotDeal.Domain.Category;
import HotDeal.HotDeal.Domain.Product;
import HotDeal.HotDeal.Repository.CategoryRepository;
import HotDeal.HotDeal.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public ResponseEntity<Map<String,Object>> insert(Category category){
        Map<String, Object> responseJson = new HashMap<>();
        categoryRepository.insert(category);
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }
}
