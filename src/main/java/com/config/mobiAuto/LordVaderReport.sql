select OrderID,
       CustomerID,
       ProductName,
       UnitPrice,
       Quantity
       
from pedido 
where CustomerName = 'DeathStar'
order by OrderID, CustomerID, ProductName, UnitPrice, Quantity;
