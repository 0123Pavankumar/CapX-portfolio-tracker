import React from "react";

const StockList = ({ stocks, deleteStock }) => {
  return (
    <div>
      <h3>Stock Holdings</h3>
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Ticker</th>
            <th>Buy Price</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {stocks.map((stock, index) => (
            <tr key={index}>
              <td>{stock.name}</td>
              <td>{stock.ticker}</td>
              <td>{stock.buyPrice}</td>
              <td>
                <button onClick={() => deleteStock(stock.ticker)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default StockList;
