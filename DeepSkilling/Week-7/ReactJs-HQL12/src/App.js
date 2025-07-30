import React, { useState } from "react";
import Greeting from "./Greeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  const button = isLoggedIn ? (
    <LogoutButton onClick={handleLogoutClick} />
  ) : (
    <LoginButton onClick={handleLoginClick} />
  );

  return (
     <div style={{
      height: "100vh",
      display: "flex",
      flexDirection: "column",
      justifyContent: "center",
      alignItems: "center",
      textAlign: "center" ,
      fontSize: "20px", 
      fontFamily: "Arial, sans-serif"
    }}>
      <Greeting isLoggedIn={isLoggedIn} />
      {button}
      <hr style={{ width: "400px", margin: "40px 0" }} />
    </div>
  );
}

export default App;
