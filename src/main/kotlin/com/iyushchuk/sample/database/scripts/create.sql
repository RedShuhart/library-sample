CREATE TABLE authors
(
    id bigint NOT NULL,
    name varchar(255),
    email varchar(255),
    CONSTRAINT author_pkey PRIMARY KEY (id)
);

CREATE TABLE public.genres
(
    id bigint NOT NULL,
    name varchar(255),
    CONSTRAINT genres_pkey PRIMARY KEY (id)
);

CREATE TABLE books
(
    id bigint NOT NULL,
    title varchar(255),
    description varchar(255),
    genre bigint,
    CONSTRAINT book_pkey PRIMARY KEY (id),
    CONSTRAINT fk_genre FOREIGN KEY (genre) REFERENCES genres (id)
);

CREATE TABLE books_authors
(
    book bigint NOT NULL,
    author bigint NOT NULL,
    CONSTRAINT fk_author FOREIGN KEY (author)
        REFERENCES authors (id)
        ON DELETE CASCADE,
    CONSTRAINT fk_book FOREIGN KEY (book)
        REFERENCES books (id)
        ON DELETE CASCADE
);