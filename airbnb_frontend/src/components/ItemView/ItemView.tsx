import React from "react";
import "../ItemView/ItemView.scss";
import photoIMG from "../../assets/images/photo.jpg";

const data = [
  {
    location: "그레이터 런던, 영국",
    host: "Yeri",
    period: "8월 1일~6일",
    score: "4.93",
    price: "10000",
  },
  {
    location: "발렌시아, 스페인",
    host: "Inje",
    period: "11월 13일~18일",
    score: "4.17",
    price: "10000",
  },
  {
    location: "투린, 이탈리아",
    host: "Movie",
    period: "8월 7일~14일",
    score: "4.89",
    price: "10000",
  },
  {
    location: "서울, 대한민국",
    host: "Yeri",
    period: "8월 13일~16일",
    score: "3.98",
    price: "10000",
  },
  {
    location: "서울, 대한민국",
    host: "Yeri",
    period: "8월 13일~16일",
    score: "3.98",
    price: "10000",
  },
];

const accomodationList = data.map((i, j) => {
  return (
    <div className="accomodationListView">
      <img
        src={photoIMG}
        height="70%"
        width="90%"
        alt="accomodationPhoto"
        style={{ borderRadius: "10px" }}
      />
      <div className="infoContainer">
        <b style={{ fontSize: "15px" }}>{i.location}</b>
        <div
          style={{
            display: "flex",
            flexDirection: "column",
            alignItems: "flex-start",
            fontSize: "14px",
          }}
        >
          <span>호스트: {i.host} 님</span>
          <span>날짜: {i.period}</span>
          <p>$ {i.price} / 박</p>
        </div>
      </div>
    </div>
  );
});

export default function ItemView() {
  return <div className="itemViewContainer">{accomodationList}</div>;
}
