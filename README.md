
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
---

- ✓ *Проверка работы Поп-апа Меню*
- ✓ *Проверка работы Поп-апа Каталог*
- ✓ *Проверка перехода на страницу рецептов*
- ✓ *Проверка перехода на страницу Корзины*
- ✓ *Проверка перехода на страницу вакансий*



---

<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/HW-dp/)

---

<p align="center">  
<a href="https://jenkins.autotests.cloud/job/HW-dp/"><img src="images/screen/vkusvill_jenkins_build.png" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- *BROWSER (браузер, по умолчанию chrome)*
- *VERSION (версия браузера, по умолчанию 126)*
- *SIZE (размер окна браузера, по умолчанию 1920x1080)*
- *REMOTEURL (адрес хоста для удалённого запуска тестов)*


<a id="console"></a>
## Команды для запуска из терминала
---

***Локальный запуск:***
```bash  
gradle clean vkusvill_test
```
```bash  
gradle clean test
```

***Удалённый запуск через Jenkins:***
```bash  
clean 
vkusvill 
"-Dbrowser=${BROWSER}" 
"-DbrowserSize=${SIZE}" 
"-DbrowserVersion=${VERSION}" 
"-DremoteUrl=${REMOTEURL}"
```

---

<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/HW-dp/allure/)</a>
---

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/vkusvill_jenkins.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/vkusvill_jenkins_tests.png" width="850">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screen/vkusvill_allure_graphs.png" width="850">

</p>

---

<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4974/dashboards">Allure TestOps</a>
---

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screen/vkusvill_allure_autotestsN.png" width="850">  
</p>

---

<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
---

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/vkusvill_telegram.png" width="550">  
</p>

---

<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
---

<p align="center">
<img title="Selenoid Video" src="images/video/vid.gif" width="550" height="350"  alt="video">
<img title="Selenoid Video" src="images/video/vid_2.gif" width="550" height="350"  alt="video">
<img title="Selenoid Video" src="images/video/vid_3.gif" width="550" height="350"  alt="video">
<img title="Selenoid Video" src="images/video/vid_4.gif" width="550" height="350"  alt="video">   
</p>

<img width="468" height="718" alt="image" src="https://github.com/user-attachments/assets/11670f67-c0a9-43a0-a933-dee4e0d2177a" />
