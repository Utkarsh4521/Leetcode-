SELECT 
    p.product_id,
    CASE
        WHEN MAX(CASE WHEN change_date <= '2019-08-16' THEN change_date END) IS NULL
            THEN 10
        ELSE MAX(
            CASE 
                WHEN change_date = (
                    SELECT MAX(change_date)
                    FROM Products p2
                    WHERE p2.product_id = p.product_id
                      AND p2.change_date <= '2019-08-16'
                )
                THEN new_price
            END
        )
    END AS price
FROM Products p
GROUP BY p.product_id;