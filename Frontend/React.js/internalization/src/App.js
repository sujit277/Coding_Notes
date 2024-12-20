import React from "react";
import { useTranslation } from "react-i18next";

const App = () => {
  const { t, i18n } = useTranslation();

  // Change language dynamically
  const changeLanguage = (language) => {
    i18n.changeLanguage(language);
  };

  return (
    <div style={{textAlign: "center"}}>
      <h1>{t("welcome")}</h1>
      <p>{t("description")}</p>
      <button onClick={() => changeLanguage("en")}>English</button>
      <button onClick={() => changeLanguage("fr")}>Français</button>
    </div>
  );
};

export default App;
