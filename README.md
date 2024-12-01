# <p align="center">Проект по автоматизации тестовых сценариев для сайта компании [АО «НСПК»](https://nspk.ru/)</p>   
  
> Акционерное общество «Национальная система платежных карт» (НСПК) — оператор платежной системы «Мир», операционный платежный и клиринговый центр Системы быстрых платежей (СБП)

 ____
 
## Содержание
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#project_goal">Цель проекта</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>


* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>

___
 
<a id="tools"></a>
## <a name="Технологии и инструменты"> Технологии и инструменты: </a>

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" height="40" weight="40" alt="IntelliJ IDEA"/>
<a href="https://www.java.com/ru/"><img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" height="40" weight="40" alt="Java"/>
<a href="https://github.com/"><img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" height="40" weight="40" alt="Github"/>
<a href="https://junit.org/junit5/"><img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" height="40" weight="40" alt="JUnit 5"/>
<a href="https://gradle.org/"><img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" height="40" weight="40" alt="Gradle"/>
<a href="https://www.jenkins.io/"><img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" height="40" weight="40" alt="Jenkins"/>
<a href="https://www.atlassian.com/software/jira"><img align="center" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jira/jira-original.svg" height="40" weight="40" alt="Jira"/>
<a href="https://github.com/allure-framework"><img align="center" src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" height="40" weight="40" alt="Allure"/>
<a href="https://selenide.org/"><img align="center" src="https://avatars.githubusercontent.com/u/43955696?s=200&v=4" height="40" weight="40" alt="Selenide"/>
<a href="https://aerokube.com/selenoid/"><img align="center" src="https://avatars.githubusercontent.com/u/26328913?s=200&v=4" height="40" weight="40" alt="Selenoid"/>
<a href="https://qameta.io/"><img align="center" src="https://avatars.githubusercontent.com/u/19841150?s=200&v=4" height="40" weight="40" alt="TestOps"/>
<a href="https://telegram.org/"><img align="center" src="https://upload.wikimedia.org/wikipedia/commons/8/83/Telegram_2019_Logo.svg" height="40" weight="40" alt="Telegram"/>
</p>

____

<a id="project_goal"></a>
## <a name="Цель проекта"> Цель проекта </a>

> <p>Проект является демонстрационным и включает в себя ряд автоматизированных тестов пользовательского интерфейса (UI), охватывающих различные аспекты функциональности, обеспечивая качество, надежность и стабильность работы веб-приложения.</p>

 ____

<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов"> Примеры автоматизированных тест-кейсов </a>

- Проверка pdf-файлов на страницах Правила и тарифы платежной системы «Мир», Брендбук НСПК;
- Проверка перехода со страницы Систему быстрых платежей, открытие страницы Углеметбанка;
- Проверка содержания страницы Универсальный QR;
- Проверка содержания страниц "Банкам" - "Руководства", "Эквайринг SoftPOS", "Правила и тарифы платежной системы «Мир»", "Сервис «Аналитика»", "Сервис привязки фискальных чеков к банковским транзакциям";
- Проверка контента страницы Контакты;
- Проверка содержания страницы Компания АО «НСПК»;
- Проверка ссылок, телефонов, логотипа в "подвале" сайта на главной странице.

____

<a id="jenkins"></a>
## <a name="Сборка в Jenkins"> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/005-Kornilova_Ann_qa_guru-java_14_jenkins/) </a>

<p align="center">  
<a href="https://jenkins.autotests.cloud/job/005-Kornilova_Ann_qa_guru-java_14_jenkins/"><img src="src/test/resources/images/screenshot/HW14_Jenkins.png" alt="Jenkins" width="950"/></a>  
</p>

<a id="jenkins_parameters"></a>
### <a name="Параметры сборки в Jenkins"> Параметры сборки в Jenkins </a>

- REPOSITORY (репозиторий для запуска job'а)
- BROWSER (браузер для запуска тестов)
- BROWSER_VERSION (версия браузера, по умолчанию)
- SCREEN_RESOLUTION (размер окна браузера)
- URL (адрес для запуска тестов)
- COMMENT (комментарий для сборки)
- ENVIRONMENT (окружение развёртывания ПО)

<p align="center">  
<a href="https://jenkins.autotests.cloud/job/005-Kornilova_Ann_qa_guru-java_14_jenkins/build?delay=0sec"><img src="src/test/resources/images/screenshot/HW14_Jenkins_parameters.png" alt="Jenkins" width="950"/></a>  
</p>

_____

<a id="console"></a>
## Команды для запуска из терминала

**Локальный запуск с параметрами по умолчанию**
```bash  
gradle clean smoke_test 
```

**Локальный запуск с указанием параметров**
```bash  
gradle clean smoke_test
-Dbrowser=chrome
-DbrowserVersion=100
-DbrowserSize=1920x1080
-Durl=selenoid.autotests.cloud
```

**Удалённый запуск через Jenkins:**
```bash
clean smoke_test 
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${SCREEN_RESOLUTION}
-Durl=${URL}
```

_____

<a id="allure"></a>
## <a name="Allure">Allure [отчет](https://jenkins.autotests.cloud/job/005-Kornilova_Ann_qa_guru-java_14_jenkins/27/allure/)</a>

### Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="src/test/resources/images/screenshot/HW14_Allure_Report.png" width="850">  
</p>  

### Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="src/test/resources/images/screenshot/HW14_Allure_Report_2.png" width="850">  
</p>

<p align="center">  
<img title="Allure Tests" src="src/test/resources/images/screenshot/HW14_Allure_Report_6.png" width="850">  
</p>

<p align="center">  
<img title="Allure Tests" src="src/test/resources/images/screenshot/HW14_Allure_Report_7.png" width="850">  
</p>

### Графики

  <p align="center">  
<img title="Allure Graphics" src="src/test/resources/images/screenshot/HW14_Allure_Report_3.png" width="850">

<img title="Allure Graphics" src="src/test/resources/images/screenshot/HW14_Allure_Report_4.png" width="850">  
</p>

___

<a id="allure-testops"></a>
## <a name="Allure_TestOps">Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/43014)</a>

### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="src/test/resources/images/screenshot/HW14_Allure_TestOps_1png.png" width="850">  
</p>  

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="src/test/resources/images/screenshot/HW14_Allure_TestOps_2.png" width="850">  
</p>

___
<a id="jira"></a>
## <a name="Jira">Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1369)</a>

<p align="center">  
<img title="Jira" src="src/test/resources/images/screenshot/HW14_Jira_1.png" width="850">  
</p>

<p align="center">  
<img title="Jira" src="src/test/resources/images/screenshot/HW14_Jira_2.png" width="850">  
</p>

____

<a id="telegram"></a>
##  <a name="Telegram"> Уведомление в Telegram </a>

<p align="center">  
<img title="Allure Overview Dashboard" src="src/test/resources/images/screenshot/HW14_Telegram.png" width="550">  
</p>

____

<a id="mail"></a>
##  <a name="Mail"> Уведомление на почту </a>

<p align="center">  
<img title="Allure Overview Dashboard" src="src/test/resources/images/screenshot/HW14_Mail.png" width="550">  
</p>

____

<a id="video"></a>
##  <a name="Telegram"> Примеры выполнения тестов </a>

<p align="center">
<img title="Selenoid Video" src="src/test/resources/screenshot.gif/09d9d37bed5f8ca68ac8b75ed3ee662d.gif" width="550" height="350"  alt="video">   
</p>

<details>
<summary>Ещё примеры выполнения тестов</summary>
<p align="center">
<img title="Selenoid Video" src="src/test/resources/screenshot.gif/0c4d0160fbd6b5f263c90fea6633e5be.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="src/test/resources/screenshot.gif/40c7ba1ddcfa452973872f1762d43e69.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="src/test/resources/screenshot.gif/83b1f07cfb4ba590d6a1fd02e1450c7b.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="src/test/resources/screenshot.gif/9d04b9d44e6dd781d0c4c5eb928d61e6.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="src/test/resources/screenshot.gif/c2a8591ea5e815d2ec56cd0a46eb9bcd.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="src/test/resources/screenshot.gif/da8584b8de36369e48f6777dbe7de63c.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="src/test/resources/screenshot.gif/e8029034c4f950f02cf427264e58254c.gif" width="550" height="350"  alt="video">   
</p>
</details>
