# NetherWaterPlacement

![Minecraft](https://img.shields.io/badge/Minecraft-1.13+-brightgreen)
![Spigot](https://img.shields.io/badge/Spigot-API-orange)
![License](https://img.shields.io/badge/license-MIT-blue)
![Version](https://img.shields.io/badge/version-1.0.0-purple)

Плагин для Minecraft серверов, позволяющий игрокам с определённым правом ставить воду в Аду (Nether).

## 📋 Описание

NetherWaterPlacement - это легковесный плагин для Spigot/Paper серверов, который интегрируется с системами прав (LuckPerms, PermissionsEx и др.) и позволяет избранным игрокам размещать воду в измерении Ада.

### ✨ Особенности

- 🔥 Позволяет ставить воду в Аду игрокам с правом доступа
- 🔐 Полная интеграция с системами прав (LuckPerms, PermissionsEx и др.)
- ⚙️ Настраиваемое право доступа через config.yml
- 🚀 Легковесный и производительный
- 🌍 Поддержка Minecraft 1.13+

## 📦 Установка

1. Скачайте последнюю версию плагина из [Releases](https://github.com/Wolfasow/NetherWaterPlacement/releases)
2. Поместите JAR файл в папку `plugins/` вашего сервера
3. Перезапустите сервер
4. Настройте права доступа (см. раздел "Настройка")

## ⚙️ Настройка

### config.yml

```yaml
# Право доступа для размещения воды в Аду
permission: "netherwaterplacement.place"
```

### Права доступа

#### С использованием LuckPerms:

**Для группы:**
```bash
/lp group vip permission set netherwaterplacement.place true
```

**Для игрока:**
```bash
/lp user Wolf permission set netherwaterplacement.place true
```

#### С использованием PermissionsEx:

**Для группы:**
```bash
/pex group vip add netherwaterplacement.place
```

**Для игрока:**
```bash
/pex user Wolf add netherwaterplacement.place
```

## 🎮 Использование

1. Выдайте право `netherwaterplacement.place` игроку или группе
2. Игрок заходит в Ад (Nether)
3. Используя ведро с водой, игрок может разместить воду
4. Вода не испарится!

## 🔑 Права доступа

| Право | Описание | По умолчанию |
|-------|----------|--------------|
| `netherwaterplacement.place` | Позволяет размещать воду в Аду | `false` |
| `netherwaterplacement.*` | Все права плагина | `op` |

## 🛠️ Сборка из исходников

### Требования

- Java 17 или выше
- Maven 3.6+

### Команды

```bash
# Клонирование репозитория
git clone https://github.com/Wolfasow/NetherWaterPlacement.git
cd NetherWaterPlacement

# Сборка плагина
mvn clean package

# Готовый JAR будет в папке target/
```

## 📁 Структура проекта

```
NetherWaterPlacement/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── wolf/
│       │           └── netherwaterplacement/
│       │               └── NetherWaterPlacement.java
│       └── resources/
│           ├── plugin.yml
│           └── config.yml
├── pom.xml
├── README.md
├── LICENSE
└── .gitignore
```

## 🔧 Технические детали

- **Версия плагина:** 1.0.0
- **API:** Spigot/Paper 1.13+
- **Java:** 17+
- **Зависимости:** Нет обязательных
- **Soft-зависимости:** LuckPerms (опционально)

## 📝 API для разработчиков

### Проверка права у игрока

```java
Player player = // получить игрока
if (player.hasPermission("netherwaterplacement.place")) {
    // У игрока есть право ставить воду в Аду
}
```

### Интеграция в ваш плагин

Добавьте зависимость в ваш `pom.xml`:

```xml
<dependency>
    <groupId>com.wolf</groupId>
    <artifactId>netherwaterplacement</artifactId>
    <version>1.0.0</version>
    <scope>provided</scope>
</dependency>
```

## 🐛 Сообщить о проблеме

Нашли баг или хотите предложить улучшение? Создайте [Issue](https://github.com/Wolfasow/NetherWaterPlacement/issues)!

## 🤝 Вклад в проект

Мы приветствуем вклад в проект! Вот как вы можете помочь:

1. Форкните репозиторий
2. Создайте ветку для вашей функции (`git checkout -b feature/AmazingFeature`)
3. Закоммитьте изменения (`git commit -m 'Add some AmazingFeature'`)
4. Запушьте в ветку (`git push origin feature/AmazingFeature`)
5. Откройте Pull Request

## 📜 Лицензия

Этот проект лицензирован под MIT License - см. файл [LICENSE](LICENSE) для деталей.

## 👤 Автор

**Wolf**

- Telegram: [@zxzniktozxz](https://t.me/zxzniktozxz)
- GitHub: [@Wolfasow](https://github.com/Wolfasow)

## 🌟 Поддержка проекта

Если вам нравится этот плагин, поставьте ⭐ на GitHub!

## 📊 Статистика

![GitHub stars](https://img.shields.io/github/stars/Wolfasow/NetherWaterPlacement?style=social)
![GitHub forks](https://img.shields.io/github/forks/Wolfasow/NetherWaterPlacement?style=social)
![GitHub issues](https://img.shields.io/github/issues/Wolfasow/NetherWaterPlacement)

## 📸 Скриншоты

### Размещение воды в Аду
![Water in Nether](https://i.ibb.co/FLds8Kyw/image.png)

### Конфигурация плагина
![Config](https://i.ibb.co/tps61f2d/image.png)

## ❓ FAQ

**Q: Работает ли плагин без LuckPerms?**  
A: Да! Плагин работает с любой системой прав, включая встроенную в Bukkit.

**Q: Можно ли изменить право доступа?**  
A: Да, отредактируйте `config.yml` и перезагрузите плагин.

**Q: Поддерживается ли Paper?**  
A: Да, плагин полностью совместим с Paper.

**Q: Какая минимальная версия Java?**  
A: Java 17 или выше.

## 🔄 Версии

### 1.0.0 (16 октября 2025)
- Первый релиз
- Базовая функциональность размещения воды в Аду
- Интеграция с системами прав
- Настраиваемый config.yml

## 🎯 Планы на будущее

- [ ] Добавить звуковые эффекты при размещении воды
- [ ] Добавить сообщения в чат (опционально)
- [ ] Добавить статистику использования
- [ ] Добавить PlaceholderAPI интеграцию

---

**Сделано с ❤️ by Wolf**
