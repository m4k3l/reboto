INSERT INTO org_unit (unit_name)
VALUES ('ORG_UNIT1'),
       ('ORG_UNIT2'),
       ('ORG_UNIT3');

INSERT INTO role (name)
VALUES ('APPRENTICE'),
       ('INSTRUCTOR'),
       ('ADMIN');

INSERT INTO app_user (org_unit_id, role_id, username, first_name, last_name, email_address, signature)
VALUES (1, 1, 'user1', 'John', 'Doe', 'john.doe@example.com', 'Signature 1'),
       (2, 2, 'user2', 'Jane', 'Smith', 'jane.smith@example.com', 'Signature 2'),
       (3, 3, 'user3', 'Mike', 'Johnson', 'mike.johnson@example.com', 'Signature 3');

INSERT INTO report_data (author_id, from_date, department, training_year, is_approved, work_text, external_text,
                         school_text, created_at, updated_at)
VALUES (1, '2023-01-01', 'Department 1', 2023, true, 'Work Text 1', 'External Text 1', 'School Text 1',
        CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (2, '2023-02-01', 'Department 2', 2023, false, 'Work Text 2', 'External Text 2', 'School Text 2',
        CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (3, '2023-03-01', 'Department 3', 2023, true, 'Work Text 3', 'External Text 3', 'School Text 3',
        CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO report_comment (report_id, user_id, comment, created_at)
VALUES (1, 1, 'Comment 1', CURRENT_TIMESTAMP),
       (1, 2, 'Comment 2', CURRENT_TIMESTAMP),
       (2, 3, 'Comment 3', CURRENT_TIMESTAMP);

