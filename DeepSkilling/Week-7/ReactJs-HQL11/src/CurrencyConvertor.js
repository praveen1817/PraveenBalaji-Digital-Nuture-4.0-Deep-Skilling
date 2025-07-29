import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [amount, setAmount] = useState('');
  const [convertedValue, setConvertedValue] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    const rupeeValue = parseFloat(amount);

    if (isNaN(rupeeValue)) {
      alert("Please enter a valid number for amount.");
      return;
    }

    const euroValue = (rupeeValue / 90).toFixed(2); 
    setConvertedValue(`${euroValue} Euro`);
  };

  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Amount (in ₹):
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </label>
        <br /><br />
        <label>
          Currency:
          <textarea
            readOnly
            value={convertedValue}
          ></textarea>
        </label>
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default CurrencyConvertor;
