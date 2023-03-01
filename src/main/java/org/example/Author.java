package org.example;

        class Author {
            String FIO;
            int Birth;
            int kolBook;
            public Author (String FIO, int Birth, int kolBook){
                this.FIO = FIO;
                this.Birth = Birth;
                this.kolBook = kolBook;
            }
                public String toString() {
                    return "Автор: " + FIO + " Год рождения: " + Birth  + " Количество книг " + kolBook + " ";
                }

        }

