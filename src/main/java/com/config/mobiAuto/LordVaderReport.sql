select * 
from pedido 
where CustomerName = 'DeathStar'
order by OrderID, CustomerID, ProductName, UnitPrice, Quantity;