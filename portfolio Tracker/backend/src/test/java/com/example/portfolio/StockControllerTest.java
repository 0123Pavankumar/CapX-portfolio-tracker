package com.example.portfolio.controller;

import com.example.portfolio.model.Stock;
import com.example.portfolio.service.StockService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class StockControllerTest {
    @Mock
    private StockService stockService;

    @InjectMocks
    private StockController stockController;

    @Test
    void testGetAllStocks() {
        MockitoAnnotations.openMocks(this);

        Stock stock1 = new Stock();
        stock1.setName("Apple");

        Stock stock2 = new Stock();
        stock2.setName("Google");

        when(stockService.getAllStocks()).thenReturn(Arrays.asList(stock1, stock2));

        List<Stock> stocks = stockController.getAllStocks();

        assertEquals(2, stocks.size());
        verify(stockService, times(1)).getAllStocks();
    }

    @Test
    void testAddStock() {
        MockitoAnnotations.openMocks(this);

        Stock newStock = new Stock();
        newStock.setName("Microsoft");

        when(stockService.addStock(newStock)).thenReturn(newStock);

        Stock addedStock = stockController.addStock(newStock);

        assertEquals("Microsoft", addedStock.getName());
        verify(stockService, times(1)).addStock(newStock);
    }
}
