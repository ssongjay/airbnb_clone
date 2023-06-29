import React from "react";
import "../MenuSlide/MenuSlide.scss";
import accomodationIMG from "../../assets/images/accomodation.png";
import nextIMG from "../../assets/images/next.png";
import preIMG from "../../assets/images/previous.png";

export default function MenuSlide() {
  const menuName = [
    "방",
    "해변 바로 앞",
    "한적한 시골",
    "통나무집",
    "저택",
    "멋진 수영장",
    "최고의 전망",
    "한옥",
    "국립공원",
    "캠핑장",
    "인기 급상승",
    "농장",
    "기상천외한 숙소",
    "초소형 주택",
    "료칸",
    "캐슬",
    "열대 지역",
    "호수 근처",
    "디자인",
    "호숫가",
    "키즈",
    "스키",
    "속세를 벗어난 숙소",
    "와인 농장",
    "신규",
    "섬",
    "B&B",
    "트리하우스",
  ];

  const MenuSlideList = menuName.map((i, j) => {
    return (
      <div className="slideListItem">
        <div
          style={{
            height: "40px",
            width: "100px",
          }}
        >
          <img
            src={accomodationIMG}
            width="35"
            height="35"
            alt="accomodation"
          />
        </div>
        <span>{i}</span>
      </div>
    );
  });
  return (
    <div className="slideContainer">
      <img src={preIMG} width="20" height="20" alt="previous" />
      <div className="slideListContainer">{MenuSlideList}</div>
      <img src={nextIMG} width="20" height="20" alt="next" />
    </div>
  );
}
