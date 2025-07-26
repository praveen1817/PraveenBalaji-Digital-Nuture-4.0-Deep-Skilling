import React from "react";
import ListOfPlayers from "./components/ListofPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  const flag = true; 
  return (
    <div style={{ textAlign: "left", marginTop: "20px", paddingLeft: "20px" }}>
      <h1>Cricket App</h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
