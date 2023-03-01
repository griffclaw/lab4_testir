package org.example;

    class Book {
            int price;
            int kolStr;
            Author author;
            int year;
            String name;
        public Book(Author author, String name, int price, int kolStr, int year){
            this.price = price;
            this.kolStr = kolStr;
            this.author = author;
            this.year = year;
            this.name = name;
        }
        public String toString() {
            return author + "Название: " + name + " Год: " + year + " Цена: " + price + " Количество страниц " + kolStr;
        }

    }

