![결과](https://user-images.githubusercontent.com/79190824/175614591-7d1ac3a7-4eb2-440b-8a7c-faca84fb88cf.gif)



## 📃 Summary

---

OAuth2 로그인을 하고 JWT를 통해서 회원인증을 하는 것과 RecyclerView, BindingAdapter, Hilt 등을 학습하고 적용해서 반찬 주문 앱을 개발하여 보았습니다.

## 💻 Part

---

- `REST API`를 이용한 서버 통신 구현
- Hilt를 통한 DI 구현
- AppLink를 통해 OAuth2 로그인 구현
- ViewPager2를 이용한 화면 이동 구현

## ✏️ Learn

---

- ViewPager2의 원리와 swipe를 이용한 화면 이동 기능을 학습하였습니다.
- AppLink를 통해서 OAuth 로그인을 구현할 수 있었습니다.
    - 로그인 구현 시 redirect로 오는 URI의 code를 파싱해서 api로 전달하여 JWT를 받아 와야하는 상황이 었는데, redirect로 오는 URI를 browser에서 처리를 하여 앱으로 돌아오지 않아서 code를 파싱할 수 없는 상황이 되어서 custom scheme과 AppLink를 이용하여 browser에서 다시 앱으로 돌아오게 하여 URI를 얻어올 수 있도록 구현하였습니다.
- Hilt를 이용한 DI를 구현하며 Hilt와 DI에 대해서 학습할 수 있었습니다.

## 🕶Team

---

안드로이드 : 2명

백엔드 : 2명

팀 소개 및 Ground rule, 협업 전략은 [`Notion`](https://www.notion.so/Team27-39689e4eba7843bda8b0d8d4e78e8191)에 정리하였습니다.



