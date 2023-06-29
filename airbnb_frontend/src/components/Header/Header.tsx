import React from "react";
import "../../App.scss";
import loginIMG from "../../../src/assets/images/user.png";
import menuIMG from "../../../src/assets/images/menu.png";
import magnifyingIMG from "../../../src/assets/images/magnifying-glass.png";

export default function Header() {
  return (
    <div className="App-header">
      <div className="logoBox">AIRBNB</div>
      <div className="searchBox">
        <div
          style={{
            display: "flex",
            width: "80%",
            justifyContent: "space-around",
            alignItems: "center",
          }}
        >
          <b>어디든지</b>
          <b
            style={{
              borderLeft: "1px solid lightgray",
              borderRight: "1px solid lightgray",
              padding: "0px 25px",
            }}
          >
            언제든 일주일
          </b>
          <p>게스트 추가</p>
        </div>
        <div
          style={{
            backgroundColor: "#FF5A5F",
            borderRadius: 25,
            width: "30px",
            height: "30px",
            display: "flex",
            justifyContent: "center",
            alignItems: "center",
          }}
        >
          <img src={magnifyingIMG} width="12" height="12" />
        </div>
      </div>
      <div className="loginBigBox">
        <b style={{ fontSize: 13, marginRight: "30px" }}>
          당신의 공간을 에어비앤비하세요
        </b>
        <div className="loginBox">
          <img src={menuIMG} width="13" height="13" />
          <img src={loginIMG} width="30" height="30" />
        </div>
      </div>
    </div>
  );
}
