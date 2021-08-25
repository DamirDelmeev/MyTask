package com.company.task22;

import java.util.List;
import java.util.Set;

public class Task22 {
    public static void main(String[] args) {

    }

        /**
         * Формирует упорядоченный список строк из стихотворений указанного автора.
         * @param poems Анализируемое множество стихотворений.
         * @param author Автор, стихотворения которого необходимо выбрать.
         * @return Список, упорядоченных по длине строк, составляющих стихотворения автора.
         */
      //  List<String> sortPoems(Set<IPoem> poems, String author);

        /**
         * Стихотворение.
         */
        interface IPoem {

            /**
             * @return Список строк, составляющих стихотворение.
             */
            List<String> getLines();

            /**
             * @return Автор стихотворения.
             */
            String getAuthor();
        }

    }
