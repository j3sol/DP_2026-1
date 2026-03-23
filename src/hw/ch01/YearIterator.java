package hw.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class YearIterator implements Iterator<Book> {
    private List<Book> sortedBooks;
    private int index;

    public YearIterator(BookShelf bookShelf) {
        this.sortedBooks = new ArrayList<>();

        // 기존 데이터 복사
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks.add(bookShelf.getBookAt(i));
        }

        // 연도 기준 내림차순 정렬
        sortedBooks.sort((b1, b2) -> b2.getYear() - b1.getYear());

        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sortedBooks.get(index++);
    }
}