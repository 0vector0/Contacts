CREATE TABLE public.contact
(
  id          SERIAL PRIMARY KEY NOT NULL,
  first_name  VARCHAR(60)        NOT NULL,
  last_name   VARCHAR(40)        NOT NULL,
  birth_date  DATE,
  description VARCHAR(2000),
  photo       BYTEA,
  version     INT DEFAULT 0      NOT NULL
);
CREATE UNIQUE INDEX contact_first_name_last_name_uindex
  ON public.contact (first_name, last_name);