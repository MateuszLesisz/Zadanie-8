# Zadanie 8 - Streamy & Lambdy
#### Zakres: Java8: streamy, lambdy, data/czas

### Zadanie ToDoList cz.2 :scroll:

W zadaniu `Ex7` rozpoczęliśmy pisanie programu ToDoList.

Zadanie `Ex8` polega na rozszerzeniu naszej ToDoListy o nowe funkcjonalności. :mag:

Należy dodać do aplikacji (jeśli jeszcze nie posiada) klasę 'serwisową' (np. TaskService), w której znajdą się metody do bardziej zaawansowanego filtrowania i wyszukiwania naszych zadań.

Oto lista metod, wraz z opisem co dana metoda powinna zwracać:

1. Metoda, która wyszuka wszystkie zadania z najwyższym priorytetem i zwróci ich listę (najwyższy priorytet: 1, najniższy: 5)
2. Metoda, która wyszuka wszystkie zadania na następny dzień i zwróci ich listę.
3. Metoda, która posortuje zadania według malejącego priorytetu i zwróci posortowaną listę.
4. Metoda, która posortuje zadania według daty (najpierw najwcześniejsze) i zwróci posortowaną listę.
5. Metoda, która wyszuka wszystkie zadania dla danej kategorii (kategoria powinna być argumentem tej metody) i zwróci ich listę.
6. Metoda, która wyszuka wszystkie zadania zawierające w opisie podaną frazę (bez uwzględniania wielkości liter) i zwróci ich listę.
7. Metoda, która wyszuka zadanie najpilniejsze (z najwcześniejszą datą i z najwyższym priorytetem dla danego terminu) i zwróci jedno takie zadanie (najlepiej jako Optional<Task>).
8. Metoda, która podzieli zadania według kategorii i zwróci mapę (klucz: kategoria, wartość: lista zadań dla danej kategorii).
9. Metoda, która podzieli zadania według priorytetu i zwróci mapę (klucz: priorytet, wartość: lista zadań o danym priorytecie).
10. Metoda, która znajdzie zadanie z najwyższym priorytetem dla każdej kategorii i zwróci mapę (klucz: kategoria, wartość: Optional<Task>).


##### Wymagania:
   - We wszystkich metodach należy wykorzystać streamy i lambdy.
   - Każdy podpunkt zadania to osobna metoda w klasie 'TaskService'.
   - Za każdą prawidłowo zaimplementowaną metodę: **0.5** pkt.
   - Jak zawsze, należy pamiętać o zasadach `clean code`.

UWAGA :heavy_exclamation_mark: Nie trzeba dodawać ani zmieniać widoków i kontrolerów.

