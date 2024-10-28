CREATE TABLE public.questions
(
    question_id serial NOT NULL DEFAULT,
    question_text text NOT NULL,

);
    CREATE TABLE public.answer
    (
        answer_id serial NOT NULL,
        answer_text text NOT NULL,
        is_true boolean NOT NULL,
        question_id integer NOT NULL,
        PRIMARY KEY (answer_id),
        FOREIGN KEY (question_id)
            REFERENCES public.questions (question_id) MATCH SIMPLE
            ON UPDATE RESTRICT
            ON DELETE RESTRICT
    );
