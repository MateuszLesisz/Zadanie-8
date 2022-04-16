Zadanie 8 - Streamy & Lambdy
Zakres: Java8: streamy, lambdy, data/czas
Zadanie ToDoList cz.2 📜
W zadaniu Ex7 rozpoczęliśmy pisanie programu ToDoList.

Zadanie Ex8 polega na rozszerzeniu naszej ToDoListy o nowe funkcjonalności. 🔍

Należy dodać do aplikacji (jeśli jeszcze nie posiada) klasę 'serwisową' (np. TaskService), w której znajdą się metody do bardziej zaawansowanego filtrowania i wyszukiwania naszych zadań.

Oto lista metod, wraz z opisem co dana metoda powinna zwracać:

Metoda, która wyszuka wszystkie zadania z najwyższym priorytetem i zwróci ich listę (najwyższy priorytet: 1, najniższy: 5)
Metoda, która wyszuka wszystkie zadania na następny dzień i zwróci ich listę.
Metoda, która posortuje zadania według malejącego priorytetu i zwróci posortowaną listę.
Metoda, która posortuje zadania według daty (najpierw najwcześniejsze) i zwróci posortowaną listę.
Metoda, która wyszuka wszystkie zadania dla danej kategorii (kategoria powinna być argumentem tej metody) i zwróci ich listę.
Metoda, która wyszuka wszystkie zadania zawierające w opisie podaną frazę (bez uwzględniania wielkości liter) i zwróci ich listę.
Metoda, która wyszuka zadanie najpilniejsze (z najwcześniejszą datą i z najwyższym priorytetem dla danego terminu) i zwróci jedno takie zadanie (najlepiej jako Optional).
Metoda, która podzieli zadania według kategorii i zwróci mapę (klucz: kategoria, wartość: lista zadań dla danej kategorii).
Metoda, która podzieli zadania według priorytetu i zwróci mapę (klucz: priorytet, wartość: lista zadań o danym priorytecie).
Metoda, która znajdzie zadanie z najwyższym priorytetem dla każdej kategorii i zwróci mapę (klucz: kategoria, wartość: Optional).
Wymagania:
We wszystkich metodach należy wykorzystać streamy i lambdy.
Każdy podpunkt zadania to osobna metoda w klasie 'TaskService'.
Za każdą prawidłowo zaimplementowaną metodę: 0.5 pkt.
Jak zawsze, należy pamiętać o zasadach clean code.
UWAGA ❗ Nie trzeba dodawać ani zmieniać widoków i kontrolerów.
