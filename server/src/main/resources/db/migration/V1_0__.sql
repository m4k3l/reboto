CREATE TABLE org_unit
(
    id        bigserial PRIMARY KEY,
    unit_name varchar NOT NULL
);

CREATE TABLE role
(
    id   bigserial PRIMARY KEY,
    name varchar NOT NULL UNIQUE
);

CREATE TABLE app_user
(
    id            bigserial PRIMARY KEY,
    org_unit_id   bigint  NOT NULL REFERENCES org_unit (id) ON DELETE CASCADE,
    role_id       bigint  NOT NULL REFERENCES role (id) ON DELETE CASCADE,
    username      varchar NOT NULL UNIQUE,
    first_name    varchar NOT NULL,
    last_name     varchar NOT NULL,
    email_address varchar NOT NULL,
    signature     varchar
);

CREATE TABLE report_data
(
    id            bigserial PRIMARY KEY,
    author_id     bigint   NOT NULL REFERENCES app_user (id) ON DELETE CASCADE,
    from_date     date     NOT NULL,
    department    varchar  NOT NULL,
    training_year smallint NOT NULL,
    is_approved   bool     NOT NULL DEFAULT false,
    work_text     varchar,
    external_text varchar,
    school_text   varchar,
    created_at    timestamptz,
    updated_at    timestamptz
);

CREATE TABLE report_comment
(
    id         bigserial PRIMARY KEY,
    report_id  bigint      NOT NULL REFERENCES report_data (id) ON DELETE CASCADE,
    user_id    bigint      NOT NULL REFERENCES app_user (id) ON DELETE CASCADE,
    comment    varchar     NOT NULL,
    created_at timestamptz NOT NULL
);

CREATE TABLE notification_history
(
    id           bigserial PRIMARY KEY,
    report_id    bigint      NOT NULL REFERENCES report_data (id) ON DELETE CASCADE,
    recipient_id bigint      NOT NULL REFERENCES app_user (id) ON DELETE CASCADE,
    sent_at      timestamptz NOT NULL
);

CREATE INDEX idx_app_user_org_unit_id ON app_user (org_unit_id);
CREATE INDEX idx_app_user_role_id ON app_user (role_id);
CREATE INDEX idx_report_data_author_id ON report_data (author_id);
CREATE INDEX idx_report_comment_report_id ON report_comment (report_id);
CREATE INDEX idx_report_comment_user_id ON report_comment (user_id);
CREATE INDEX idx_notification_history_report_id ON notification_history (report_id);
CREATE INDEX idx_notification_history_recipient_id ON notification_history (recipient_id);