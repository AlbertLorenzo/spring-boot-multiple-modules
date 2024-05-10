INSERT INTO Users (user_id, first_name, last_name)
VALUES
    (UUID_GENERATE_V4(), 'John', 'Doe'),
    (UUID_GENERATE_V4(), 'Alice', 'Smith'),
    (UUID_GENERATE_V4(), 'Bob', 'Johnson'),
    (UUID_GENERATE_V4(), 'Emily', 'Davis'),
    (UUID_GENERATE_V4(), 'Michael', 'Brown'),
    (UUID_GENERATE_V4(), 'Emma', 'Jones'),
    (UUID_GENERATE_V4(), 'William', 'Taylor'),
    (UUID_GENERATE_V4(), 'Olivia', 'Martinez'),
    (UUID_GENERATE_V4(), 'James', 'Garcia'),
    (UUID_GENERATE_V4(), 'Sophia', 'Lee')
ON CONFLICT (user_id) DO NOTHING;
