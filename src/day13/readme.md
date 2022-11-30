1) Реализовать простейшую структуру соцсети. 
Реализовать классы User, Message, MessageDatabase.
В классе Test, методе main проверить работоспособность соцсети. Отправит несколько сообщений и вывести
диалог или цепочку сообщений для двух пользователей.

В классе User добавить поля username(String) для хранения имени и subscriptions(List<User>) для хранения списка друзей.
Класс содержит следующие методы:
   * subscribe(User user) для добавления новых пользователей в перечень подписок.
   * isSubscribed(User user) для проверки наличия подписки на другого пользоавтеля с целью
определения возможности отправки сообщений. Логика поиска - по полному совпадению имени пользователя.
   * isFriend(User user) для проверки факта добавления в друзья: наличие взаимной подписки у обоих юзеров.
   * sendMessage(User addressee, Message message): отправляет сообщение получателю, подсказка: реализовать через инстанс класса
MessageDatabase.
Переопределить метод toString(), чтобы он возвращал только имя пользователя.

Класс Message содержит поля: 
   * отправитель: sender(User), 
   * получатель: recipient(User),
   * текст: text(String),
   * дата отправки: (Data)
Конструктор принимает на вход все поля, кроме даты отправки, т.к. она заполняется значением даты на момент создания 
сообщения, т.е. значением new Date().
Для всех полей класса реализовать геттеры 
и переопределить метод toString() для корректного выведения представления объекта в
следующем формате 
 "FROM sender 
 TO recipient
 ON date
 text". 

Класс MessageDatabase отвечает за хранение сообщений (имитация БД).
Он содержит следующие поля:
  * статическое свойство для хранение сообщений - messages (List<Message>)

и методы, оба статические:
 * newMessage(User sender, User recipient, String text)  - добавляет сообщение в историю сообщений.
 * chatHistory(User a, User b) - выводит историю переписки двух пользователей, каждый из которых может быть
и отправителем и получателем.