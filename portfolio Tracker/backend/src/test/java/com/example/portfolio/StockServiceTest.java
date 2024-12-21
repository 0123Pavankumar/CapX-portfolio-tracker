package com.example.portfolio.service;

import com.example.portfolio.model.Stock;
import com.example.portfolio.repository.StockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class StockServiceTest {
    @Mock
    private StockRepository stockRepository;

    @InjectMocks
    private StockService stockService;

    private Stock mockStock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockStock = new Stock();
        mockStock.setId(1L);
        mockStock.setName("Apple");
        mockStock.setTicker("AAPL");
        mockStock.setQuantity(1);
        mockStock.setBuyPrice(150.0);
    }

    @Test
    void testAddStock() {
        when(stockRepository.save(mockStock)).thenReturn(mockStock);

        Stock savedStock = stockService.addStock(mockStock);

        assertEquals("Apple", savedStock.getName());
        verify(stockRepository, times(1)).save(mockStock);
    }

    @Test
    void testGetStockById() {
        when(stockRepository.findById(1L)).thenReturn(Optional.of(mockStock));

        Optional<Stock> retrievedStock = stockService.getStockById(1L);

        assertEquals("Apple", retrievedStock.get().getName());
        verify(stockRepository, times(1)).findById(1L);
    }
}
