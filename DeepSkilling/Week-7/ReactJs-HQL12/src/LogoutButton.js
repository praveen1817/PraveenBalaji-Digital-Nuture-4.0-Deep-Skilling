import React from "react";

function LogoutButton(props) {
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
      Logout
    </button>
  );
}

export default LogoutButton;
