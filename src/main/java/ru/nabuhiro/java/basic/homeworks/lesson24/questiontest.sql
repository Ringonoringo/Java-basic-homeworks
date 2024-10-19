-- Table: public.qwestions

-- DROP TABLE IF EXISTS public.questions;

CREATE TABLE IF NOT EXISTS public.questions
(
    question_id integer NOT NULL DEFAULT nextval('questions_question_id_seq'::regclass),
    question_text text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT questions_pkey PRIMARY KEY (question_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.questions
    OWNER to postgres;

    -- Table: public.answer

    -- DROP TABLE IF EXISTS public.answer;

    CREATE TABLE IF NOT EXISTS public.answer
    (
        answer_text text COLLATE pg_catalog."default" NOT NULL,
        is_true boolean NOT NULL,
        answer_id integer NOT NULL DEFAULT nextval('answer_answer_id_seq'::regclass),
        CONSTRAINT answer FOREIGN KEY (answer_id)
            REFERENCES public.questions (question_id) MATCH SIMPLE
            ON UPDATE NO ACTION
            ON DELETE NO ACTION
            NOT VALID
    )
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

    ALTER TABLE IF EXISTS public.answer
        OWNER to postgres;
-----------
TEST case
SELECT * from questions, answer
	where is_true = true and answer_id = question_id
order by questions.question_id