CREATE TABLE authors
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 0 MINVALUE 0 MAXVALUE 9223372036854775807 CACHE 1 ),
    name varchar(255),
    email varchar(255),
    CONSTRAINT author_pkey PRIMARY KEY (id)
);

CREATE TABLE public.genres
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 0 MINVALUE 0 MAXVALUE 9223372036854775807 CACHE 1 ),
    name varchar(255),
    CONSTRAINT genres_pkey PRIMARY KEY (id)
);

CREATE TABLE public.books
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 0 MINVALUE 0 MAXVALUE 9223372036854775807 CACHE 1 ),
    title varchar(255) COLLATE pg_catalog."default",
    description varchar(255) COLLATE pg_catalog."default",
    genre bigint,
    author bigint,
    CONSTRAINT book_pkey PRIMARY KEY (id),
    CONSTRAINT fk_author FOREIGN KEY (author)
        REFERENCES public.authors (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE SET NULL,
    CONSTRAINT fk_genre FOREIGN KEY (genre)
        REFERENCES public.genres (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE SET NULL
);