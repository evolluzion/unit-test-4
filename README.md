## Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
Заглушки позволяют изолировать тестируемый код от внешних зависимостей, таких как другие модули, службы, или ресурсы. Это способствует созданию контролируемой среды для тестирования для проверки функциональности конкретного модуля без необходимости взаимодействия с реальными зависимостями.

## Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
"Spy" (шпион). Spy позволяет отслеживать вызовы методов и аргументы, переданные при их вызове.

## Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
"Stub" (заглушка). Stub просто возвращает предопределенное значение или выбрасывает исключение при вызове, предоставляя контролируемый способ замены реальной логики метода в тестовом окружении.

## Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?
"Mock" (мок). Mock представляет собой объект, который эмулирует поведение реального объекта, позволяя контролировать и тестировать взаимодействие кода с внешними ресурсами.