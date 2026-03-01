select 
    round(count(
        case 
            when order_date=customer_pref_delivery_date then 1
            end )*100 / count(*),2) as immediate_percentage
from delivery
where (customer_id,order_date) in (
    select customer_id,MIN(order_date)
    from delivery
    group by customer_id
);