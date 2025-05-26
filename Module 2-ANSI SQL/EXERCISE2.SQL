SELECT 
    e.title,
    AVG(f.rating) AS average_rating,
    COUNT(f.feedback_id) AS feedback_count
FROM 
    Feedback f
JOIN 
    Events e ON f.event_id = e.event_id
GROUP BY 
    e.event_id
HAVING 
    COUNT(f.feedback_id) >= 10
ORDER BY 
    average_rating DESC;
