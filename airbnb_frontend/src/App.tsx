import React from "react";
import "./App.scss";
import Header from "./components/Header/Header";
import ItemView from "./components/ItemView/ItemView";
import MenuSlide from "./components/MenuSlide/MenuSlide";

function App() {
  return (
    <div className="App">
      <Header />
      <div style={{ padding: "0px 80px" }}>
        <MenuSlide />
        <ItemView />
      </div>
    </div>
  );
}

export default App;
