import React from "react";

function LoginButton(props) {
  return (
    <button
      onClick={props.onClick}
      style={{
        width: "100px",
        height: "50px",
        fontSize: "16px", 
        cursor: "pointer"
      }}
    >
      Login
    </button>
  );
}

export default LoginButton;
