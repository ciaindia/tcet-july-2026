Take codebase ref from day3 directory
https://github.com/ciaindia/tcet-july-2026.git

database -> employee table -->
Create Employee.java POJO class
-->
Create EmployeeRepository.java (CRUD ops)
-->
Create EmployeeService.java class
-->
Create EmployeeController.java (REST) class (using service)

Rerun the application and Access URL
http://localhost:9090/api/employees


-- Create a new user
-- Grant all privileges on all databases
-- Reload privilege tables


CREATE USER 'tcetuser'@'%' IDENTIFIED BY 'tcet@123';

GRANT ALL PRIVILEGES ON *.* TO 'tcetuser'@'%';

FLUSH PRIVILEGES;








npm create vite@latest my-react-app

✔ Select a framework: › React
✔ Select a variant: › JavaScript

cd my-react-app
npm install
npm run dev

Access in browser: http://localhost:5173





CW: Fetch data from external API 
(example-> https://api.github.com/users) 
and show in React app