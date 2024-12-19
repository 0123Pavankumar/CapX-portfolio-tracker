import React, { useState } from "react";
import AddEditStockForm from "./AddEditStockForm";
import StockList from "./StockList";

const Dashboard = () => {
  const [stocks, setStocks] = useState([]);

  const addStock = (stock) => {
    setStocks([...stocks, stock]);
  };

  const editStock = (updatedStock) => {
    setStocks(
      stocks.map((stock) =>
        stock.ticker === updatedStock.ticker ? updatedStock : stock
      )
    );
  };

  const deleteStock = (ticker) => {
    setStocks(stocks.filter((stock) => stock.ticker !== ticker));
  };

  return (
    <div>
      <h2>Portfolio Dashboard</h2>
      <AddEditStockForm addStock={addStock} />
      <StockList
        stocks={stocks}
        editStock={editStock}
        deleteStock={deleteStock}
      />
    </div>
  );
};

export default Dashboard;
