import com.example.portfolio.dto.StockDTO;
import com.example.portfolio.model.Stock;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    // Assume StockService is already injected

    @GetMapping
    public List<StockDTO> getAllStocks() {
        return stockService.getAllStocks().stream()
                .map(stock -> new StockDTO(
                        stock.getId(),
                        stock.getName(),
                        stock.getTicker(),
                        stock.getQuantity(),
                        stock.getBuyPrice(),
                        stock.getCurrentPrice()))
                .toList();
    }

    @PostMapping
    public StockDTO addStock(@RequestBody StockDTO stockDTO) {
        Stock stock = new Stock();
        stock.setName(stockDTO.getName());
        stock.setTicker(stockDTO.getTicker());
        stock.setQuantity(stockDTO.getQuantity());
        stock.setBuyPrice(stockDTO.getBuyPrice());
        stock.setCurrentPrice(stockDTO.getCurrentPrice());

        Stock savedStock = stockService.addStock(stock);

        return new StockDTO(
                savedStock.getId(),
                savedStock.getName(),
                savedStock.getTicker(),
                savedStock.getQuantity(),
                savedStock.getBuyPrice(),
                savedStock.getCurrentPrice()
        );
    }
}
