create table teaching_cube_user (
user_name text Not Null primary key,
user_password text Not null,
date_of_birth Date Not null,
e_mail text Not null
);

CREATE SEQUENCE teaching_cube_session_sessionID_seq;
create table teaching_cube_session (
sessionID integer NOT NULL DEFAULT nextval('teaching_cube_session_sessionID_seq') primary key,
login_date date,
logout_date date,
user_name text REFERENCES teaching_cube_user(user_name)
);
ALTER SEQUENCE teaching_cube_session_sessionID_seq OWNED BY teaching_cube_session.sessionID;

create table teaching_cube_lesson (
lessonID integer NOT NULL primary key,
lesson_title text NOT NULL,
lesson_details text
);

create table teaching_cube_user_lesson (
user_name text REFERENCES teaching_cube_user(user_name),
lessonID integer REFERENCES teaching_cube_lesson(lessonID),
lesson_score integer,
PRIMARY KEY(user_name, lessonID)
);