import React, { useState } from "react";

const AddEditStockForm = ({ addStock }) => {
  const [stock, setStock] = useState({ name: "", ticker: "", buyPrice: 0 });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setStock({ ...stock, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    addStock(stock);
    setStock({ name: "", ticker: "", buyPrice: 0 });
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        name="name"
        placeholder="Stock Name"
        value={stock.name}
        onChange={handleChange}
      />
      <input
        type="text"
        name="ticker"
        placeholder="Ticker"
        value={stock.ticker}
        onChange={handleChange}
      />
      <input
        type="number"
        name="buyPrice"
        placeholder="Buy Price"
        value={stock.buyPrice}
        onChange={handleChange}
      />
      <button type="submit">Add Stock</button>
    </form>
  );
};

export default AddEditStockForm;
